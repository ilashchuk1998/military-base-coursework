package com.ilashchuk.services.division;

import com.ilashchuk.model.Division;
import com.ilashchuk.repositories.division.DivisionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionServiceImpl implements DivisionService {
    @Autowired
    DivisionDAO divisionDAO;

    @Override
    public Division insertDivision(Division division) {
        return divisionDAO.save(division);
    }

    @Override
    public Division getDivision(int id) {
        return divisionDAO.findById(id).get();
    }

    @Override
    public Division updateDivision(Division division) {
        return divisionDAO.save(division);
    }

    @Override
    public void deleteDivision(int id) {
        divisionDAO.deleteById(id);
    }

    @Override
    public List<Division> getAll() {
        return (List<Division>) divisionDAO.findAll();
    }
}