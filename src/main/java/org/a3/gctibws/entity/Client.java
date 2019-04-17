package org.a3.gctibws.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "IVR_CUST_DET2")
public class Client {
    @Id
    @Column(name = "MSISDN", nullable = true, length = 15)
    private String msisdn;

    @Column(name = "SIM_STATUS", nullable = true, length = 40)
    private String simstatus;

    @Column(name = "SEGMENT", nullable = true, length = 32)
    private String segment;

    public Client(String msisdn, String simstatus) {
        this.msisdn = msisdn;
        this.simstatus = simstatus;
    }

    protected Client() {

    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn() {
        this.msisdn = msisdn;
    }

    public String getSimstatus() {
        return simstatus;
    }

    public void setSimstatus() {
        this.msisdn = msisdn;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment() {
        this.segment = segment;
    }

    @Override
    public String toString() {
        return "Client{" +
                "MSISDN =" + msisdn +
                ", SIM_STATUS = " + simstatus +
                ", SEGMENT = " + segment +
                "}";
    }
}
