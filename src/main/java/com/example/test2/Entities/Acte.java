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
public class Acte {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idActe ;
    private String codeActe ;
    private int contationActe ;
    private float prixUnitaireActe ;
    private String designationActe ;
    //relation 1
    @ManyToOne
    private FamilleActe familleActe;
    //relation 2
    @ManyToMany(mappedBy ="actes", cascade = CascadeType.ALL)
    private List<Pathologie> pathologies;



}
