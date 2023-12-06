package com.example.test2.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pathologie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idPath;
    private String codePath ;
    private String libelle ;
    private String description ;
    private boolean archive ;
    //relation 2
    @ManyToMany
    private List<Acte> actes ;
}
