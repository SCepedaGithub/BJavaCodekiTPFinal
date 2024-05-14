package com.cac.vuelos.controllers;

import com.cac.vuelos.exceptions.ResourceNotFoundException;
import com.cac.vuelos.models.Compañia;
import com.cac.vuelos.services.CompañiaServicio;
//import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import java.net.http.HttpClient;
import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompañiaControlador {
    @Autowired
    CompañiaServicio companyService;

    @GetMapping("")
    public List<Compañia> getAllCompanies() {
        return companyService.allCompanies();
    }

    @PostMapping("/add")
    public void createCompany(@RequestBody Compañia compañia) {
        companyService.createCompany(compañia);
    }

    @GetMapping("/{id}")
    public Compañia findCompanyById(@PathVariable Long id) {
        return companyService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCompany(@PathVariable Long id) {

        try {
            companyService.deleteCompany(id);
            return "Compania eliminada con exito";

        } catch (ResourceNotFoundException e) {
            e.printStackTrace();
            return "No existe la compania con el Id seleccionado";
        }

    }

    @PutMapping("/update")
    public Compañia updateCompany(@RequestBody Compañia compañia) {
        return companyService.updateCompany(compañia);
    }

}