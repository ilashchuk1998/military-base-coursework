package com.ilashchuk.services.militarybase;

import com.ilashchuk.model.MilitaryBase;

import java.util.List;

public interface MilitaryBaseService {
    MilitaryBase insertMilitaryBase(MilitaryBase militaryBase);
    MilitaryBase getMilitaryBase(int id);
    MilitaryBase updateMilitaryBase(MilitaryBase militaryBase);
    void deleteMilitaryBase(int id);
    List<MilitaryBase> getAll();
    List<MilitaryBase> findAllByArmyId(int id);
    List<MilitaryBase> findAllByDivisionId(int id);
    List<MilitaryBase> findAllByCorpsId(int id);
}
