package com.ilashchuk.repositories.weaponry;

import com.ilashchuk.model.Weaponry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeaponryDAO extends JpaRepository<Weaponry, Integer> {

}

