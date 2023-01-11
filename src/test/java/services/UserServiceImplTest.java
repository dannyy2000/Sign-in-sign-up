package services;

import data.models.User;
import dtos.requests.RegisterRequest;
import dtos.response.RegisterResponse;
import exceptions.EmailAlreadyExistException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServiceImplTest {


    private UserService userService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void createUser() throws EmailAlreadyExistException {
        RegisterRequest registerRequest = new RegisterRequest();
        User user = new User();
        user.setFirstName(registerRequest.getFirstName());
        user.setFirstName(registerRequest.getFirstName());
        user.setLastName(registerRequest.getLastName());
        RegisterResponse registerResponse = userService.createUser(registerRequest);
    }
}