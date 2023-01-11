package util;

import data.models.User;
import dtos.requests.RegisterRequest;

public class ModelMapper {
    public User mapUser(RegisterRequest registerRequest){
       User user = new User();
       user.setEmail(registerRequest.getEmail());
       user.setPassword(registerRequest.getPassword());
       user.setPhoneNumber(registerRequest.getPhoneNumber());
       user.setFirstName(registerRequest.getFirstName());

       return user;
    }
}
