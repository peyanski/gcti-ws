package org.a3.gctibws.dao;


import org.a3.gctibws.entity.Client;
import org.a3.gctibws.entity.Client2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Client2Dao extends JpaRepository<Client2, String> {
}


