package com.example.test2.Repository;

import com.example.test2.Entities.Pathologie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PathologieRepo extends JpaRepository<Pathologie, Long> {
    public Pathologie findAllByCodePath(String codePath);
}
