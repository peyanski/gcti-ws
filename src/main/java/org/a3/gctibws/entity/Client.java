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

    @Column(name = "SPECIAL_IND", nullable = true, length = 2)
    private String specialind;

    @Column(name = "CUSTOMER_TYPE", nullable = true, length = 40)
    private String customertype;

    @Column(name = "CUSTOMER_SUBTYPE", nullable = true, length = 40)
    private String customersubtype;

    @Column(name = "EFFECTIVE_SEGMENT", nullable = true, length = 40)
    private String effectivesegment;

    @Column(name = "SERVICE_SEGMENT", nullable = true, length = 40)
    private String servicesegment;

    @Column(name = "SUB_LEVEL_IND", nullable = true, length = 10)
    private Long sublevelind;

    @Column(name = "PIN", nullable = true, length = 20)
    private String pin;

    @Column(name = "ACC_LEVEL_IND", nullable = true, length = 10)
    private String acclevelind;

    public Client(String msisdn, String simstatus, String segment, String acclevelind, String specialind,
                  String customertype, String customersubtype, String effectivesegment, String servicesegment,
                  Long sublevelind, String pin) {
        this.msisdn = msisdn;
        this.simstatus = simstatus;
        this.segment = segment;
        this.acclevelind = acclevelind;
        this.specialind = specialind;
        this.customertype = customertype;
        this.customersubtype = customersubtype;
        this.effectivesegment = effectivesegment;
        this.servicesegment = servicesegment;
        this.sublevelind = sublevelind;
        this.pin = pin;
    }

    protected Client() {

    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getSimstatus() {
        return simstatus;
    }

    public void setSimstatus(String simstatus) {
        this.simstatus = simstatus;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getAcclevelind() {
        return acclevelind;
    }

    public void setAcclevelind(String acclevelind) {
        this.acclevelind = acclevelind;
    }

    public String getSpecialind() {
        return specialind;
    }

    public void setSpecialind(String specialind) {
        this.specialind = specialind;
    }

    public String getCustomertype() {
        return customertype;
    }

    public void setCustomertype(String customertype) {
        this.customertype = customertype;
    }

    public String getCustomersubtype() {
        return customersubtype;
    }

    public void setCustomersubtype(String customersubtype) {
        this.customersubtype = customersubtype;
    }

    public String getEffectivesegment() {
        return effectivesegment;
    }

    public void setEffectivesegment(String effectivesegment) {
        this.effectivesegment = effectivesegment;
    }

    public String getServicesegment() {
        return servicesegment;
    }

    public void setServicesegment(String servicesegment) {
        this.servicesegment = servicesegment;
    }

    public Long getSublevelind() {
        return sublevelind;
    }

    public void setSublevelind(Long sublevelind) {
        this.sublevelind = sublevelind;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Client{" +
                "MSISDN = " + msisdn +
                ", SIM_STATUS = " + simstatus +
                ", SEGMENT = " + segment +
                ", SPECIAL_IND = " + specialind +
                ", CUSTOMER_TYPE = " + customertype +
                ", CUSTOMER_SUBTYPE = " + customersubtype +
                ", EFECTIVE_SEGMENT = " + effectivesegment +
                ", SERVICE_SEGMENT = " + servicesegment +
                ", SUB_LEVEL_IND = " + sublevelind +
                ", PIN = " + pin +
                ", ACC_LEVEL_IND = " + acclevelind +
        "}";
    }

}
