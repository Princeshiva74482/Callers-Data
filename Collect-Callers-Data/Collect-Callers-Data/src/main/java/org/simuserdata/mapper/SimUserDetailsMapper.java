package org.simuserdata.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.simuserdata.entity.SimUserDetailsEntity;
import org.simuserdata.response.OutputDetails;

@Mapper(componentModel = "spring")
public interface SimUserDetailsMapper {

    @Mapping(source = "SIMNumber", target = "simNumber")
    @Mapping(source = "SIMNetwork", target = "simNetwork")
    @Mapping(source = "SIMUserName", target = "simUserName")
    @Mapping(source = "SIMType", target = "simType")
    @Mapping(source = "SIMUserPlan", target = "simUserPlan")
    @Mapping(source = "SIMUserAddress", target = "simUserAddress")
    OutputDetails entityToResponse(SimUserDetailsEntity simUserDetailsEntity);
}
