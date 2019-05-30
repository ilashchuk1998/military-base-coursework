package com.ilashchuk.services.weaponry;

import com.ilashchuk.model.Weaponry;

import java.util.List;

public interface WeaponryService {
    Weaponry insertWeaponry(Weaponry weaponry);
    Weaponry getWeaponry(int id);
    Weaponry updateWeaponry(Weaponry weaponry);
    void deleteWeaponry(int id);
    List<Weaponry> getAll();
}
