package com.ilashchuk.services.brigade;

import com.ilashchuk.repositories.brigade.BrigadeDAO;
import com.ilashchuk.model.Brigade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrigadeServiceImpl implements BrigadeService {
    @Autowired
    BrigadeDAO brigadeDAO;

    @Override
    public Brigade insertBrigade(Brigade brigade) {
        return brigadeDAO.save(brigade);
    }

    @Override
    public Brigade getBrigade(int id) {
        return brigadeDAO.findById(id).get();
    }

    @Override
    public Brigade updateBrigade(Brigade brigade) {
        return brigadeDAO.save(brigade);
    }

    @Override
    public void deleteBrigade(int id) {
        brigadeDAO.deleteById(id);
    }

    @Override
    public List<Brigade> getAll() {
        return (List<Brigade>) brigadeDAO.findAll();
    }
}

