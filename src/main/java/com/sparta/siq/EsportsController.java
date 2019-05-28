package com.sparta.siq;

public class EsportsController {

    public void esportsMatchesService()
    {
        HTTPManager esports = new HTTPManager();
        esports.makeAllMatchesCall();
        EsportsDeserialiser esportsDeserialiser = new EsportsDeserialiser(esports.getResponseBody());

        //System.out.println(esportsDeserialiser.getLeaguesMappedDTO());
    }




}
