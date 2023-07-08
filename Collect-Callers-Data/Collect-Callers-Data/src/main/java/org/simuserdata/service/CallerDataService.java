package org.simuserdata.service;

import lombok.extern.slf4j.Slf4j;
import org.simuserdata.entity.SimUserDetailsEntity;
import org.simuserdata.mapper.SimUserDetailsMapper;
import org.simuserdata.repository.SimUserDetailsRepository;
import org.simuserdata.response.OutputDetails;
import org.simuserdata.response.UserInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class CallerDataService {

    private final SimUserDetailsRepository simUserDetailsRepository;
    private final SimUserDetailsMapper simUserDetailsMapper;

    @Autowired
    public CallerDataService(SimUserDetailsRepository simUserDetailsRepository,
                             SimUserDetailsMapper simUserDetailsMapper) {
        this.simUserDetailsRepository = simUserDetailsRepository;
        this.simUserDetailsMapper = simUserDetailsMapper;
    }
    public List<OutputDetails> getOutputDetails(UserInput userInput) {
        String simNumber = userInput.getSimNumber();
        List<SimUserDetailsEntity> simUserDetailsEntities = simUserDetailsRepository.userData(simNumber);
        List<OutputDetails> outputDetailsList = new ArrayList<>();

        if (userInput.isUserDetails()) {
            for (SimUserDetailsEntity simUserDetailsEntity : simUserDetailsEntities) {
                OutputDetails outputDetails = simUserDetailsMapper.entityToResponse(simUserDetailsEntity);
                outputDetailsList.add(outputDetails);
            }
        }

        return outputDetailsList;
    }

}