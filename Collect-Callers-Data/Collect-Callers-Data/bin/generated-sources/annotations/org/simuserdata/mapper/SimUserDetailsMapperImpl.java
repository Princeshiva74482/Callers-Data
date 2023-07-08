package org.simuserdata.mapper;

import javax.annotation.processing.Generated;
import org.simuserdata.entity.SimUserDetailsEntity;
import org.simuserdata.response.OutputDetails;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-08T17:42:05+0530",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.35.0.v20230622-1425, environment: Java 17.0.7 (Eclipse Adoptium)"
)
@Component
public class SimUserDetailsMapperImpl implements SimUserDetailsMapper {

    @Override
    public OutputDetails entityToResponse(SimUserDetailsEntity simUserDetailsEntity) {
        if ( simUserDetailsEntity == null ) {
            return null;
        }

        OutputDetails outputDetails = new OutputDetails();

        outputDetails.setSimNumber( simUserDetailsEntity.getSIMNumber() );
        outputDetails.setSimNetwork( simUserDetailsEntity.getSIMNetwork() );
        outputDetails.setSimUserName( simUserDetailsEntity.getSIMUserName() );
        outputDetails.setSimType( simUserDetailsEntity.getSIMType() );
        outputDetails.setSimUserPlan( simUserDetailsEntity.getSIMUserPlan() );
        outputDetails.setSimUserAddress( simUserDetailsEntity.getSIMUserAddress() );

        return outputDetails;
    }
}
