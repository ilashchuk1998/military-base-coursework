package com.ilashchuk.services.weaponryinmilitarybase;

import com.ilashchuk.model.WeaponryInMilitaryBase;
import com.ilashchuk.model.WeaponryType;

import java.util.List;

public interface WeaponryInMilitaryBaseService {
    WeaponryInMilitaryBase insertWeaponryInMilitaryBase(WeaponryInMilitaryBase weaponryInMilitaryBase);
    WeaponryInMilitaryBase getWeaponryInMilitaryBase(int id);
    WeaponryInMilitaryBase updateWeaponryInMilitaryBase(WeaponryInMilitaryBase weaponryInMilitaryBase);
    void deleteWeaponryInMilitaryBase(int id);
    List<WeaponryInMilitaryBase> getAll();

    List<WeaponryInMilitaryBase> findAllByWeaponryType(WeaponryType type);
    List<WeaponryInMilitaryBase> findAllByBaseAndWeaponryType(int id, WeaponryType type);
    List<WeaponryInMilitaryBase> findAllByArmyAndWeaponryType(long id, WeaponryType type);
    List<WeaponryInMilitaryBase> findAllByDivisionAndWeaponryType(int id, WeaponryType type);
    List<WeaponryInMilitaryBase> findAllByCorpsAndWeaponryType(int id, WeaponryType type);
}
