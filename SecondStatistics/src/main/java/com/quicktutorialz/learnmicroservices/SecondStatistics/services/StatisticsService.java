package com.quicktutorialz.learnmicroservices.SecondStatistics.services;

import com.quicktutorialz.learnmicroservices.SecondStatistics.entities.Statistics;

import java.util.List;

public interface StatisticsService {

    /** it fetches historical data from MySQL database */
    List<Statistics> getStatistics(String jwt, String email);

    /** it calls ToDoMicroservice, take the current ToDos and saves the current data in the MySQL Database */
   // Statistics getPresentStatistics(String jwt, String email);

}
