package org.a3.gctibws.controller;

import org.a3.gctibws.entity.Client2;
import org.a3.gctibws.service.Client2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/client2")
public class Client2Controller {
    @Autowired
    Client2Service client2Service;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Client2> getAllClients() {
        return client2Service.getAllClients();
    }


    @RequestMapping(value = "/{msisdn}", method = RequestMethod.GET)
    public Optional<Client2> getClient(@PathVariable String msisdn) {
        return this.client2Service.getClientByMsisdn(msisdn);
    }

    @RequestMapping(value = "/{msisdn}", method = RequestMethod.DELETE)
    public void deleteClient(@PathVariable String msisdn) {
        this.client2Service.deleteClient(msisdn);
    }

    @RequestMapping(value = "/addclient", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    //@ResponseBody() ??
    public Client2 addNewClient(@RequestBody Client2 client) {
        return this.client2Service.addClient(client);
    }

    @RequestMapping(value = "/updateclient/{msisdn}", method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Client2 updateClient(@RequestBody Client2 client) {
        return this.client2Service.updateClient(client);
    }

    @RequestMapping(value = "/all", method = RequestMethod.DELETE)
    public void deleteAllClients() {
        this.client2Service.deleteAllClients();
    }





}
