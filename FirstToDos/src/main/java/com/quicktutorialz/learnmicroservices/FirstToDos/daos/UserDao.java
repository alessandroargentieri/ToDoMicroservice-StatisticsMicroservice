package com.quicktutorialz.learnmicroservices.FirstToDos.daos;

import com.quicktutorialz.learnmicroservices.FirstToDos.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserDao extends JpaRepository<User, String> {

    //name strategy method
    Optional<User> findUserByEmail(String email);

    //@Query annotation equivalent
    @Query(value="SELECT * FROM users WHERE email=:email", nativeQuery = true)
    Optional<User> findUserByTheEmail(@Param("email") String email);

    //alternative already implemented by the extended interfaces: JpaRepository, PagingAndSortingRepository, CrudRepository
    // User findOne(String email);


}
