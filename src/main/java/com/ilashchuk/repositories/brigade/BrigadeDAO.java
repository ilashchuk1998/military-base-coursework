package com.ilashchuk.repositories.brigade;

import com.ilashchuk.model.Brigade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrigadeDAO extends JpaRepository<Brigade, Integer> {

}
