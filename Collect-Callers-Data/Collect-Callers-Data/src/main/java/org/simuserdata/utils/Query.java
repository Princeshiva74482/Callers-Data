package org.simuserdata.utils;

public class Query {
    public Query() {
    }

    public static final String USER_DETAILS = "SELECT SIM_NMBE, SIM_NETWORK, SIM_USR_NAME, EMAIL, SIM_TYP, SIM_PLAN, SIM_USER_ADRS "
            + "FROM SIM_USR_DTLS "
            + "WHERE SIM_NMBE = ?1";

}
