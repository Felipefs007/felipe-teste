package com.aula12.conn.repository;

import org.springframework.data.repository.CrudRepository;

import com.aula12.conn.model.Ong;

public interface OngRepository 
  extends CrudRepository<Ong, Long> {


    
}
