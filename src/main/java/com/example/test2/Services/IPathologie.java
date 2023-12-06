package com.example.test2.Services;

import com.example.test2.Entities.Pathologie;

public interface IPathologie {
public Pathologie addPathologie (Pathologie p);
    public void affecterActeAPathologie(String codeActe , String
            codePathologie);
}
