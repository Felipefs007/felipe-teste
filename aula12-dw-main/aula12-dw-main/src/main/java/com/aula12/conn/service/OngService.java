package com.aula12.conn.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aula12.conn.model.Ong;
import com.aula12.conn.repository.OngRepository;

@Service
public class OngService implements OngRepository {

    private final OngRepository ongDAO;

    @Autowired
    public OngService(OngRepository ongDAO) {
        this.ongDAO = ongDAO;
    }

    @Override
    public <S extends Ong> S save(S entity) {
        return ongDAO.save(entity);
    }

    @Override
    public <S extends Ong> Iterable<S> saveAll(Iterable<S> entities) {
        return ongDAO.saveAll(entities);
    }

    @Override
    public Optional<Ong> findById(Long id) {
        return ongDAO.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return ongDAO.existsById(id);
    }

    @Override
    public Iterable<Ong> findAll() {
        return ongDAO.findAll();
    }

    @Override
    public Iterable<Ong> findAllById(Iterable<Long> ids) {
        return ongDAO.findAllById(ids);
    }

    @Override
    public long count() {
        return ongDAO.count();
    }

    @Override
    public void deleteById(Long id) {
        ongDAO.deleteById(id);
    }

    @Override
    public void delete(Ong entity) {
        ongDAO.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
        ongDAO.deleteAllById(ids);
    }

    @Override
    public void deleteAll(Iterable<? extends Ong> entities) {
        ongDAO.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        ongDAO.deleteAll();
    }
}
