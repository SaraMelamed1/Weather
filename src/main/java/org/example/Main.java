package org.example;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
        try {
            GetRequest getRequest = Unirest.get("");
            HttpResponse<String> response = getRequest.asString();
            System.out.println("Code:");
            System.out.println(response.getStatus());
            System.out.println("---------");
            System.out.println("JSON:");
            String json= response.getBody();
            ObjectMapper objectMapper=new ObjectMapper();
            List<Weather> weather=objectMapper.readValue(json,new TypeReference<>(){});
            for(Weather weather1:weather){
                System.out.println(weather1.getCity());
            }

        } catch (UnirestException e) {
throw new RuntimeException(e);
        }

    }
}