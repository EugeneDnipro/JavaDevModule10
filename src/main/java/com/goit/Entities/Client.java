package com.goit.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "client")
@Data
public class Client {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "name")
    private String name;
}
