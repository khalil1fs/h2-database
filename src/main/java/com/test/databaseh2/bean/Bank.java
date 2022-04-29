package com.test.databaseh2.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Bank {
    @Id @GeneratedValue
    private Long id;
    private String reference;
}

/*

http://localhost:8080/h2-console
******* login *********
JDBC URL : jdbc:h2:mem:bank

 */
