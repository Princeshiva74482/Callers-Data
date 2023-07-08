package org.simuserdata.entity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Data
@Entity
@Table(name = "CALL_HIST")
public class CallHistoryEntity {
    @Id
    @Column(name = "SIM_NMBE")
    private String SIMNumber;
    @Column(name = "CALLER_NMBR")
    private String callerNumber;
    @Column(name = "CALL_TYP")
    private String callType;
    @Column(name = "CALL_STRT_TYM")
    private String callStartTime;
    @Column(name = "CALL_END_TYM")
    private String callEndTime;
    @Column(name = "CALL_DRTN")
    private String callDuration;
}
