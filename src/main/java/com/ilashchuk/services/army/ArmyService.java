package com.ilashchuk.services.army;

import com.ilashchuk.model.Army;

import java.util.List;

public interface ArmyService {
    Army insertArmy(Army army);
    Army getArmy(long id);
    Army updateArmy(Army army);
    void deleteArmy(long id);
    List<Army> getAll();
}
