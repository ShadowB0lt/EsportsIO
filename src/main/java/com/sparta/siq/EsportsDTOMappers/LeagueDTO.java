package com.sparta.siq.EsportsDTOMappers;


import java.util.ArrayList;
import java.util.Map;

public class LeagueDTO {

    private Map<String,Object> videogame;
    private String url;
    private String slug;
    private ArrayList<Map<String,Object>> series;
    private String name;
    private String modified_at;
    private boolean live_supported;
    private String image_url;
    private int id;

    public Map<String, Object> getVideogame() {
        return videogame;
    }
    //
    public void setVideogame(Map<String, Object> videogame) {
        this.videogame = videogame;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public ArrayList<Map<String, Object>> getSeries() {
        return series;
    }

    public void setSeries(ArrayList<Map<String, Object>> series) {
        this.series = series;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModified_at() {
        return modified_at;
    }

    public void setModified_at(String modified_at) {
        this.modified_at = modified_at;
    }

    public boolean isLive_supported() {
        return live_supported;
    }

    public void setLive_supported(boolean live_supported) {
        this.live_supported = live_supported;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public int getId() {
        return id;
    }

//    public String getStringID()
//    {
//
//    }

    public void setId(int id) {
        this.id = id;
    }
}

