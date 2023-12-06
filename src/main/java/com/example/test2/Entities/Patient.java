package com.example.test2.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idPatient ;
    @Enumerated(EnumType.STRING)
    private TypePieceIdentite typePieceIdentite ;
    private String identifiantPieceIdentite ;
    @Temporal(TemporalType.DATE)
    private Date dateEmission ;
    private String nomP ;
    private String prenomP ;
    //relation 3
    @ManyToMany
    Set<Pathologie> pathologies=new HashSet<>();
}
