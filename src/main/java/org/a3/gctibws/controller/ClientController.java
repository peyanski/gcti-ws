package org.a3.gctibws.controller;

import org.a3.gctibws.entity.Client;
import org.a3.gctibws.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    ClientService clientService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }


    @RequestMapping(value = "/{msisdn}", method = RequestMethod.GET)
    public Optional<Client> getClient(@PathVariable String msisdn) {
        return this.clientService.getClientByMsisdn(msisdn);
    }

    @RequestMapping(value = "/{msisdn}", method = RequestMethod.DELETE)
    public void deleteClient(@PathVariable String msisdn) {
        this.clientService.deleteClient(msisdn);
    }

    @RequestMapping(value = "/addclient", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    //@ResponseBody() ??
    public Client addNewClient(@RequestBody Client client) {
        return this.clientService.addClient(client);
    }

    @RequestMapping(value = "/updateclient/{msisdn}", method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Client updateClient(@RequestBody Client client) {
        return this.clientService.updateClient(client);
    }

    @RequestMapping(value = "/all", method = RequestMethod.DELETE)
    public void deleteAllClients() {
        this.clientService.deleteAllClients();
    }





}
