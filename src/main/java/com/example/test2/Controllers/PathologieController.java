package com.example.test2.Controllers;

import com.example.test2.Entities.Pathologie;
import com.example.test2.Services.IPathologie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pathologie")
public class PathologieController {
    @Autowired
    IPathologie pathologieService ;
    @PostMapping("/addPathologie")
    public Pathologie ajouterPathologie(@RequestBody Pathologie path){
        return pathologieService.addPathologie(path) ;
    }

    @PostMapping("/affecterActeAPathologie/{CodeA}/{CodeP}")
    public void affecterActeAPathologie(@PathVariable("CodeA") String codeActe ,
                                              @PathVariable("CodeP") String codePath){
         pathologieService.affecterActeAPathologie(codeActe,codePath) ;
    }
}
