package org.a3.gctibws.dao;

import org.a3.gctibws.entity.Ivrswap;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IvrswapDao extends JpaRepository<Ivrswap, String> {
    // https://docs.spring.io/spring-data/data-commons/docs/current/reference/html/#repositories
    // 	Declaring custom query method on the Interface to return all entities
    //  Iterable<Ivrswap> findActive();
}
