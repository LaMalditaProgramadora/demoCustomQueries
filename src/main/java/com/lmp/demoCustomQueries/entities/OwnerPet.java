package com.lmp.demoCustomQueries.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class OwnerPet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    private Owner owner;

    @ManyToOne
    private Pet pet;
}
