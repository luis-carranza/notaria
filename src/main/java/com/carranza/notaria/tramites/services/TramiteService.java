package com.carranza.notaria.tramites.services;

import com.carranza.notaria.tramites.model.Tramite;
import com.carranza.notaria.tramites.repositories.TramiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luis_carranza on 3/6/18.
 */

@Service
public class TramiteService {

    @Autowired
    private TramiteRepository tramiteRepository;

    public List<Tramite> getAllTramites() {
        List<Tramite> tramites = new ArrayList<>();
        tramiteRepository.findAll().forEach(tramites::add);

        return tramites;

    }

    public void addTramite(Tramite tramite){
        tramiteRepository.save(tramite);
    }

}
