package com.quicktutorialz.learnmicroservices.FirstToDos.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Entity
@Table(name="todos")
@AllArgsConstructor @NoArgsConstructor
public class ToDo{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="ID")
    @Getter @Setter
    private Integer id;                 //filled with autogeneration: it can be null in input; we don't use @NotNull

    @Column(name="DESCRIPTION")
    @NotNull @NotEmpty @NotBlank
    @Getter @Setter
    private String description;

    @Column(name="DATE")
    @Getter @Setter
    private Date date;              //filled with prePersist: it can be null in input; we don't use @NotNull

    @Column(name="PRIORITY")
    @NotNull @NotEmpty @NotBlank
    @Getter @Setter
    private String priority;

    @Column(name="FK_USER")
    @NotNull @NotEmpty @NotBlank
    @Getter @Setter
    private String fkUser;

    @PrePersist
    void getTimeOperation() {
        this.date = new Date();
    }


}
