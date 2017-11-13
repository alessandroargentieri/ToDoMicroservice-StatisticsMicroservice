package com.quicktutorialz.learnmicroservices.SecondStatistics.entities;

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
@Table(name="latest_statistics")
@AllArgsConstructor @NoArgsConstructor
public class Statistics {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="ID")
    @Getter @Setter
    private Integer id;                     //filled with autogeneration: it can be null in input; we don't use @NotNull

    @Column(name="DESCRIPTION")
    @Getter @Setter
    @NotBlank @NotEmpty @NotNull
    private String description;

    @Column(name="DATE")
    @Getter @Setter
    private Date date;                  //filled with prePersist: it can be null in input; we don't use @NotNull

    @Column(name="EMAIL")
    @Getter @Setter
    @NotBlank @NotEmpty @NotNull
    private String email;

    @PrePersist
    void getTimeOperation() {
        this.date = new Date();
    }

}
