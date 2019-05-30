package com.ilashchuk.repositories.platoon;

import com.ilashchuk.model.Platoon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatoonDAO extends JpaRepository<Platoon, Integer> {

}
