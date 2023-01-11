package services;

import dtos.requests.RegisterRequest;
import dtos.response.RegisterResponse;
import exceptions.EmailAlreadyExistException;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    RegisterResponse createUser(RegisterRequest registerRequest) throws EmailAlreadyExistException;
}
