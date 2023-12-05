package com.aula12.conn.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aula12.conn.model.Ong;
import com.aula12.conn.service.OngService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class OngController {
private  OngService ongService;

    @Autowired
    public void SeuController(OngService ongService) {
        this.ongService = ongService;
    }

    @PostMapping("/cadastrar")
    public Ong criar(@RequestBody Ong e) {
        Ong et = ongService.save(e);
        return et;
    }

    @GetMapping("/listar")
    public List<Ong> listarOngs(){
        return (List<Ong>) ongService.findAll();
    }


    @PutMapping("/alterar")
    public void alterar(@RequestBody Ong ong) {  
        if (ong.getId() > 0) 
            ongService.save(ong);
        
    }

    @DeleteMapping("/excluir")
    public void excluirOng(@RequestBody Ong ong) { 
        ongService.delete(ong);
    }

    @GetMapping(value="/")
    public String teste() {
        return "Olá";
    }
    

}
