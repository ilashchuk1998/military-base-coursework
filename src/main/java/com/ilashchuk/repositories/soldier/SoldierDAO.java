package com.ilashchuk.repositories.soldier;

import com.ilashchuk.model.Soldier;
import com.ilashchuk.model.Specialty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SoldierDAO extends JpaRepository<Soldier, Integer> {
    List<Soldier> findAllBySpecialtyContainingAndMilitaryBase_ArmyId(@Param("specialty") Specialty specialty,
                                                                       @Param("id") long id);

    List<Soldier> findAllBySpecialtyContainingAndMilitaryBase_Id(@Param("specialty") Specialty specialty,
                                                                @Param("id") int id);

    List<Soldier> findAllBySpecialtyContainingAndMilitaryBase_Division_Id(@Param("specialty") Specialty specialty,
                                                                          @Param("id") int id);

    List<Soldier> findAllBySpecialtyContainingAndMilitaryBase_Corps_Id(@Param("specialty") Specialty specialty,
                                                                          @Param("id") int id);

    List<Soldier> findAllBySpecialtyContainingAndMilitaryBase_Brigade_Id(@Param("specialty") Specialty specialty,
                                                                         @Param("id") int id);
}

