package org.simuserdata.controller;

import org.simuserdata.response.OutputDetails;
import org.simuserdata.response.UserInput;
import org.simuserdata.service.CallerDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import java.util.List;

@RestController
@RequestMapping("/api")
@Api(tags = "User Data API")
public class CallerDataController {

    private final CallerDataService callerDataService;

    @Autowired
    public CallerDataController(CallerDataService callerDataService) {
        this.callerDataService = callerDataService;
    }


    @PostMapping(value = "/userdata")
    @ApiOperation(value = "Get User Data", notes = "Retrieves user data based on input")
    public ResponseEntity<List<OutputDetails>> getUserData(
            @ApiParam(value = "User Input") @RequestBody UserInput userInput) {
        List<OutputDetails> outputDetailsList = callerDataService.getOutputDetails(userInput);
        return ResponseEntity.ok(outputDetailsList);
    }

}
