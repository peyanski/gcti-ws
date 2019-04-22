package org.a3.gctibws.dao;


import org.a3.gctibws.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientDao extends JpaRepository<Client, String> {


}