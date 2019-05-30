package com.ilashchuk.services.buildings;

import com.ilashchuk.model.Buildings;

import java.util.List;

public interface BuildingsService {
    Buildings insertBuildings(Buildings buildings);
    Buildings getBuildings(int id);
    Buildings updateBuildings(Buildings buildings);
    void deleteBuildings(int id);
    List<Buildings> getAll();
    List<Buildings> findAllByMoreThanOneUnit();
    List<Buildings> findAllByNoUnits();
}
