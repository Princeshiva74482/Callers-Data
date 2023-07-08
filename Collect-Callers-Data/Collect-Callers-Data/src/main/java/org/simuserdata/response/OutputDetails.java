package org.simuserdata.response;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OutputDetails {

    private String simNumber;
    private String simNetwork;
    private String simUserName;
    private String simType;
    private String simUserPlan;
    private String simUserAddress;
    private String callerNumber;
    private String callType;
    private LocalDateTime callStartTime;
    private LocalDateTime callEndTime;
    private String callDuration;
    private String messageNumber;
    private String messageType;
    private LocalDateTime messageTime;
}
