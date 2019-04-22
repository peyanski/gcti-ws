package org.a3.gctibws.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "IVR_ADXSWAP")
public class Ivrswap {

    @Id
    @Column(name = "PRODUCTION_TABLE_NAME", nullable = true, length = 30)
    private String prodtable;

    @Column(name = "BACKUP_TABLE_NAME", nullable = true, length = 30)
    private String backuptable;

    public Ivrswap(String prodtable, String backuptable) {
        this.prodtable = prodtable;
        this.backuptable = backuptable;
    }

    protected Ivrswap(){

    }

    public String getProdtable() {
        return prodtable;
    }

    public void setProdtable(String prodtable) {
        this.prodtable = prodtable;
    }

    public String getBackuptable() {
        return backuptable;
    }

    public void setBackuptable() {
        this.backuptable = backuptable;
    }

    @Override
    public String toString() {
        return "Ivrswap{" +
                "prodtable = " + prodtable +
                ", backuptable =" + backuptable +
                "}";
    }
}
