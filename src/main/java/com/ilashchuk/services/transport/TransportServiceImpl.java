package com.ilashchuk.services.transport;

import com.ilashchuk.model.Transport;
import com.ilashchuk.repositories.transport.TransportDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportServiceImpl implements TransportService {
    @Autowired
    TransportDAO transportDAO;

    @Override
    public Transport insertTransport(Transport transport) {
        return transportDAO.save(transport);
    }

    @Override
    public Transport getTransport(int id) {
        return transportDAO.findById(id).get();
    }

    @Override
    public Transport updateTransport(Transport transport) {
        return transportDAO.save(transport);
    }

    @Override
    public void deleteTransport(int id) {
        transportDAO.deleteById(id);
    }

    @Override
    public List<Transport> getAll() {
        return (List<Transport>) transportDAO.findAll();
    }
}
