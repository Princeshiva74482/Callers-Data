package org.simuserdata.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "SIM_USR_DTLS")
public class SimUserDetailsEntity {

    @Id
    @Column(name = "SIM_NMBE")
    private String SIMNumber;

    @Column(name = "SIM_USR_NAME")
    private String SIMUserName;

    @Column(name = "EMAIL")
    private String emailAddress;

    @Column(name = "SIM_NETWORK")
    private String SIMNetwork;

    @Column(name = "SIM_TYP")
    private String SIMType;

    @Column(name = "SIM_PLAN")
    private String SIMUserPlan;

    @Column(name = "SIM_USER_ADRS")
    private String SIMUserAddress;

    // Add constructors, getters, and setters if necessary
}
