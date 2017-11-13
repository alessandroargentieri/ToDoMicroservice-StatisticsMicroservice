package com.quicktutorialz.learnmicroservices.FirstToDos.services;

import com.quicktutorialz.learnmicroservices.FirstToDos.entities.User;
import com.quicktutorialz.learnmicroservices.FirstToDos.utilities.UserNotInDatabaseException;
import com.quicktutorialz.learnmicroservices.FirstToDos.utilities.UserNotLoggedException;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Map;
import java.util.Optional;

public interface LoginService {

    Optional<User> getUserFromDb(String email, String pwd) throws UserNotInDatabaseException;

    String createJwt(String email, String name, Date date) throws UnsupportedEncodingException;

    Map<String, Object> verifyJwtAndGetData(HttpServletRequest request)throws UnsupportedEncodingException, UserNotLoggedException; //ExpiredJwtException;
}
