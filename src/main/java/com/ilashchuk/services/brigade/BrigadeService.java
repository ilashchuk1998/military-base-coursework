package com.ilashchuk.services.brigade;

import com.ilashchuk.model.Brigade;

import java.util.List;

public interface BrigadeService {
    Brigade insertBrigade(Brigade brigade);
    Brigade getBrigade(int id);
    Brigade updateBrigade(Brigade brigade);
    void deleteBrigade(int id);
    List<Brigade> getAll();
}
