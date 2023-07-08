package org.simuserdata.response;

import java.time.LocalDate;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserInput {

    private String simNumber;
    private LocalDate beginDate;
    private LocalDate endDate;
    // Actions

    @ApiModelProperty(value = "User Details", example = "false")
    private boolean userDetails;
    @ApiModelProperty(value = "User Details", example = "false")
    private boolean callHistory;
    @ApiModelProperty(value = "User Details", example = "false")
    private boolean incomingCalls;
    @ApiModelProperty(value = "User Details", example = "false")
    private boolean outgoingCalls;
    @ApiModelProperty(value = "User Details", example = "false")
    private boolean messagesHistory;
    @ApiModelProperty(value = "User Details", example = "false")
    private boolean receivedMessages;
    @ApiModelProperty(value = "User Details", example = "false")
    private boolean sentMessages;
}
