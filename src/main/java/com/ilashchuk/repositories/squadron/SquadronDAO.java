package com.ilashchuk.repositories.squadron;

import com.ilashchuk.model.Squadron;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SquadronDAO extends JpaRepository<Squadron, Integer> {

}

