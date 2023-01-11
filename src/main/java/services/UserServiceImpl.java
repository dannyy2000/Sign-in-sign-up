package services;

import data.models.User;
import data.repositories.UserRepository;
import dtos.requests.RegisterRequest;
import dtos.response.RegisterResponse;
import exceptions.EmailAlreadyExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import util.ModelMapper;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    private ModelMapper modelMapper;

    @Override
    public RegisterResponse createUser(RegisterRequest registerRequest)throws EmailAlreadyExistException {
        Optional <User> existingUser = userRepository.findByEmail(registerRequest.getEmail());
        if(existingUser.isPresent()){
            throw new EmailAlreadyExistException("This email already registered");
        }

        User user = modelMapper.mapUser(registerRequest);

        User savedUser =   userRepository.save(user);


        return new RegisterResponse("Register successful", savedUser.getEmail());
    }
}
