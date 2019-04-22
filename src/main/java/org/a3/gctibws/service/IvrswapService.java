package org.a3.gctibws.service;

import org.a3.gctibws.dao.IvrswapDao;
import org.a3.gctibws.entity.Ivrswap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IvrswapService {

    @Autowired
    IvrswapDao ivrswapDao;

    public List<Ivrswap> getAllRows() {
        return this.ivrswapDao.findAll();
    }

    public Ivrswap updateIvrswap(Ivrswap ivrswap) {
        return this.ivrswapDao.save(ivrswap);
    }

    public Optional<Ivrswap> getProdTable(String prodtable) {
        return this.ivrswapDao.findById(prodtable);
    }

}
