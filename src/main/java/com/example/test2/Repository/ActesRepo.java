package com.example.test2.Repository;

import com.example.test2.Entities.Acte;
import com.example.test2.Entities.Pathologie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActesRepo extends JpaRepository<Acte, Long> {
    Acte findAllByCodeActe(String codeActe);
}
