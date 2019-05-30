package com.ilashchuk.services.platoon;

import com.ilashchuk.model.Platoon;

import java.util.List;

public interface PlatoonService {
    Platoon insertPlatoon(Platoon platoon);
    Platoon getPlatoon(int id);
    Platoon updatePlatoon(Platoon platoon);
    void deletePlatoon(int id);
    List<Platoon> getAll();
}
