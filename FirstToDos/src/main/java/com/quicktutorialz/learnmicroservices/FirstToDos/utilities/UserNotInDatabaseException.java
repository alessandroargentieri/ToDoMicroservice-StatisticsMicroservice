package com.quicktutorialz.learnmicroservices.FirstToDos.utilities;

public class UserNotInDatabaseException extends Exception{

    public UserNotInDatabaseException(String message){
        super(message);
    }
}
