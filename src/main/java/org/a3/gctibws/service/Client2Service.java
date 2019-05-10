package org.a3.gctibws.service;

import org.a3.gctibws.dao.Client2Dao;
import org.a3.gctibws.entity.Client2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Client2Service {

        @Autowired
        Client2Dao client2Dao;

        public List<Client2> getAllClients() {
            return this.client2Dao.findAll();
        }

        public Client2 addClient(Client2 client) {
            return this.client2Dao.save(client);
        }

        public void deleteClient(String msisdn) {
            this.client2Dao.deleteById(msisdn);
        }

        public void deleteAllClients() {
            this.client2Dao.deleteAll();
        }

        public Client2 updateClient(Client2 client) {
            return this.client2Dao.save(client);
        }

        //TODO to understand how Optional works
        public Optional<Client2> getClientByMsisdn(String msisdn) {
            return this.client2Dao.findById(msisdn);
        }



}
