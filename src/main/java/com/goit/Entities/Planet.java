package com.goit.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "planet")
@Data
public class Planet {
    @Id
    private String id;

    @Column(name = "name")
    private String name;
}
