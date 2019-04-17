package org.a3.gctibws.service;

import org.a3.gctibws.entity.Client;
import org.a3.gctibws.dao.ClientDao;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

        @Autowired
        ClientDao clientDao;

        public List<Client> getAllClients() {
            return this.clientDao.findAll();
        }

        public Client addClient(Client client) {
            return this.clientDao.save(client);
        }

        public void deleteClient(String msisdn) {
            this.clientDao.deleteById(msisdn);
        }

        public void deleteAllClients() {
            this.clientDao.deleteAll();
        }

        public Client updateClient(Client client) {
            return this.clientDao.save(client);
        }

        //TODO to understand how Optional works
        public Optional<Client> getClientByMsisdn(String msisdn) {
            return this.clientDao.findById(msisdn);
        }



}
