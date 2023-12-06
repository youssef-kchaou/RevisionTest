package com.example.test2.Services;

import com.example.test2.Entities.Acte;
import com.example.test2.Entities.Pathologie;
import com.example.test2.Repository.ActesRepo;
import com.example.test2.Repository.PathologieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class PathologieService implements IPathologie{
    @Autowired
    PathologieRepo pathologieRepo ;
    @Autowired
    ActesRepo actesRepo ;
    @Override
    public Pathologie addPathologie(Pathologie p) {
        return pathologieRepo.save(p);
    }

    @Override
    public void affecterActeAPathologie(String codeActe, String codePathologie) {
        Pathologie p = pathologieRepo.findAllByCodePath(codePathologie);
        Acte a =actesRepo.findAllByCodeActe(codeActe);
        p.getActes().add(a);


        actesRepo.save(a);
    }
}
