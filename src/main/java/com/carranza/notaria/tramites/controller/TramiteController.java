package com.carranza.notaria.tramites.controller;

import com.carranza.notaria.tramites.model.Tramite;
import com.carranza.notaria.tramites.services.TramiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by luis_carranza on 3/6/18.
 */


@RestController
public class TramiteController {

    @Autowired
    private TramiteService tramiteService;

    @RequestMapping(method = RequestMethod.GET, value = "/tramites")
    public List<Tramite> getAllTrammites() {
        return tramiteService.getAllTramites();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/tramites")
    public void addTramite(@RequestBody Tramite tramite) {
        tramiteService.addTramite(tramite);
    }


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello() {
        return "Notaria 6";
    }
}
