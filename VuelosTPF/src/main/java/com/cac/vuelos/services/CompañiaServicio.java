package com.cac.vuelos.services;

import com.cac.vuelos.exceptions.ResourceNotFoundException;
import com.cac.vuelos.models.Compañia;
import com.cac.vuelos.repositories.CompañiaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompañiaServicio {
    @Autowired
    CompañiaRepositorio compañiaRepositorio;
    public List<Compañia> allCompanies() {
        return compañiaRepositorio.findAll();
    }

    public void createCompany(Compañia compañia) {
        compañiaRepositorio.save(compañia);
    }

    public Compañia findById(Long id){
        return compañiaRepositorio.findById(id).orElse(null);
    }

    public void deleteCompany(Long id) {
        Compañia compañia = compañiaRepositorio.findById(id).orElseThrow(()-> new ResourceNotFoundException("company","id",id));
        compañiaRepositorio.deleteById(compañia.getId());
    }

    public Compañia updateCompany(Compañia compañia) {
        compañiaRepositorio.save(compañia);
        return compañiaRepositorio.findById(compañia.getId()).orElse(null);
    }
}