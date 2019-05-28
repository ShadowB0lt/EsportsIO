package com.sparta.siq;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HTTPManager {

    private CloseableHttpResponse fullResponse;

    public void makeAllMatchesCall()
    {
        try
        {
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpGet getMatches = new HttpGet(PropertiesReader.getBaseURL()
                    + PropertiesReader.getMatchesEndpoint()
                    + PropertiesReader.getApiAccessQuery()
                    + PropertiesReader.getApiKey());
            fullResponse = httpClient.execute(getMatches);

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }


    public String getResponseBody()
    {
        String bodyResult = null;

        try {
            bodyResult = EntityUtils.toString(fullResponse.getEntity());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return bodyResult;
    }
}
