package com.ilashchuk.repositories.transport;

import com.ilashchuk.model.Transport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportDAO extends JpaRepository<Transport, Integer> {

}

