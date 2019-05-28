package com.sparta.siq;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.siq.EsportsDTOMappers.LeagueDTO;
import com.sparta.siq.EsportsDTOMappers.MatchesDTO;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class EsportsDeserialiser {

    private MatchesDTO matchesMappedDTO;
    private LeagueDTO[] leagueDTOS;
    private Map<Integer, LeagueDTO> leagueMap;

    public EsportsDeserialiser(String filePath)
    {
        ObjectMapper esportsObject = new ObjectMapper();
        esportsObject.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        try
        {
            leagueDTOS = esportsObject.readValue(filePath,LeagueDTO[].class);
            leagueMap = new HashMap<>();
            //leagueMap = esportsObject.readValue(filePath,MatchesDTO.class);
            for(LeagueDTO leaguesDTOS : leagueDTOS)
            {
                leagueMap.put(leaguesDTOS.getId(),leaguesDTOS);
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public Map<Integer,LeagueDTO> getLeaguesMappedDTO()
    {
        return leagueMap;
    }
}
