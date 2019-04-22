package org.a3.gctibws.controller;

import org.a3.gctibws.entity.Ivrswap;
import org.a3.gctibws.service.IvrswapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ivrswap")
public class IvrswapController {

    @Autowired
    IvrswapService ivrswapService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Ivrswap> getAllRows() {
        return ivrswapService.getAllRows();
    }

    @RequestMapping(value = "/update/{prodtable}", method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Ivrswap updateIvrswap(@RequestBody Ivrswap ivrswap) {
        return this.ivrswapService.updateIvrswap(ivrswap);
    }

    @RequestMapping(value = "/{prodtable}", method = RequestMethod.GET)
    public Optional<Ivrswap> getProdtable(@PathVariable String prodtable) {
        return this.ivrswapService.getProdTable(prodtable);
    }


}
