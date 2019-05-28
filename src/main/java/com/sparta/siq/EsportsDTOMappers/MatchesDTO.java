package com.sparta.siq.EsportsDTOMappers;

import java.util.ArrayList;
import java.util.Map;

public class MatchesDTO {

    private int winner_id;
    private ArrayList<Map<String,Object>> winner;
    private ArrayList<Map<String,Object>> videogame_version;
    private ArrayList<Map<String,Object>> videogame;
    private int tournament_id;
    private ArrayList<Map<String,Object>> tournament;
    private String status;
    private String slug;
    private int serie_id;
    private ArrayList<Map<String,Object>> serie;
    private ArrayList<Map<String,Object>> results;
    private ArrayList<Map<String,Object>> opponents;
    private int number_of_games;
    private String name;
    private String modified_at;
    private String match_type;
    private ArrayList<Map<String,Object>> live;
    private int league_id;
    private ArrayList<Map<String,Object>> league;
    private int id;
    private ArrayList<Map<String,Object>> games;
    private boolean draw;
    private String begin_at;

}
