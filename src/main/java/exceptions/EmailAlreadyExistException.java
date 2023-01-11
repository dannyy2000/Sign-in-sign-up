package exceptions;

public class EmailAlreadyExistException extends signUpSignInException{
    public EmailAlreadyExistException(String message) {
        super(message);
    }
}
