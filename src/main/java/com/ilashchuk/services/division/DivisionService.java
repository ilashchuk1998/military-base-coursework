package com.ilashchuk.services.division;

import com.ilashchuk.model.Division;

import java.util.List;

public interface DivisionService {
    Division insertDivision(Division division);
    Division getDivision(int id);
    Division updateDivision(Division division);
    void deleteDivision(int id);
    List<Division> getAll();
}
