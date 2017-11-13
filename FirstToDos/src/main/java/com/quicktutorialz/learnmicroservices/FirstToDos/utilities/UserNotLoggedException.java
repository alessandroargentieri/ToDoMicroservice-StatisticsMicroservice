package com.quicktutorialz.learnmicroservices.FirstToDos.utilities;

public class UserNotLoggedException extends Exception {

    public UserNotLoggedException(String message){
        super(message);
    }
}
