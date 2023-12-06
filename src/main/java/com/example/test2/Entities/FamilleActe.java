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
public class FamilleActe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idFA ;
    private String codeFA ;
    private String libelle ;
    private String description ;
    @OneToMany(mappedBy = "familleActe",cascade = CascadeType.ALL)
    private List<Acte> actes;

}
