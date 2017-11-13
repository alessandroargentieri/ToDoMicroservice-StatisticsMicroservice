package com.quicktutorialz.learnmicroservices.FirstToDos.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="users")
@AllArgsConstructor @NoArgsConstructor
public class User {

    @Id
    @Column(name="EMAIL")
    @NotNull @NotBlank @NotEmpty
    @Getter @Setter
    private String email;

    @Column(name="NAME")
    @NotNull @NotBlank @NotEmpty
    @Getter @Setter
    private String name;

    @Column(name="PASSWORD")
    @NotNull @NotBlank @NotEmpty
    @Getter @Setter
    private String password;

}
