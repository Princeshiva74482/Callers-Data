package org.simuserdata.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "MSG_HIST")
public class MessageHistoryEntity {

    @Id
    @Column(name = "SIM_NMBE")
    private String SIMNumber;
    @Column(name = "MSG_NMBR")
    private String messageNumber;
    @Column(name = "MSG_TYP")
    private String messageType;
    @Column(name = "MSG_TYM")
    private String messageTime;

}