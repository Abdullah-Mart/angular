package com.djs.f_yaml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

import java.io.IOException;

public class Yamler {

    String someString = "aaaaaaaaaaaaaaaaaaaa\n\taaaaaaaaaaaaaaaaaa";


    public static String asYaml(String jsonString) throws JsonProcessingException, IOException {
        // parse JSON
        JsonNode jsonNodeTree = new ObjectMapper()
                .readTree(jsonString);
        // save it as YAML
        String jsonAsYaml = new YAMLMapper()
                .writeValueAsString(jsonNodeTree);
        return jsonAsYaml;
    }


    public static String asJson(String yamlString) throws JsonProcessingException, IOException {
        // parse YAML
        JsonNode yamlNodeTree = new YAMLMapper()
                .readTree(yamlString);
        // save it as JSON
        String yamlAsJson = new ObjectMapper()
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(yamlNodeTree);
        return yamlAsJson;
    }

    public static void main(String[] args) {

        String jsonString1 = "{\"name\":\"mkyong\",\"age\":38,\"skills\":[\"java\",\"python\"]}";
        String jsonString2 =
                """
                {
                    "name": "mkyong",
                    "age": 38,
                    "skills": [
                        "java",
                        "python"
                    ]
                }
                """;
        String yamlString1 =
                """
                        version: "3.7"
                       
                        networks:
                           appnet:
                       
                        services:
                        
                          app-service:
                            build: .
                            ports:\s
                              - "8881:8080"
                            environment:
                              SPRING_DATASOURCE_URL: jdbc:mysql://mysql-service:3306/mydb
                              SPRING_DATASOURCE_USERNAME: djs
                              SPRING_DATASOURCE_PASSWORD: djs
                            depends_on:
                              mysql-service:
                                condition: service_healthy
                            networks:
                              - appnet
                       
                          mysql-service:
                            image: mysql:latest
                            healthcheck:
                              test: [ "CMD", "mysqladmin", "ping", "-h", "localhost" ]
                              interval: 10s
                              timeout: 5s
                              retries: 5
                            ports:\s
                              - "3306:3306"
                            expose:
                              - "3306"
                            environment:
                              MYSQL_ROOT_PASSWORD: root
                              MYSQL_USER: djs
                              MYSQL_PASSWORD: djs
                              MYSQL_DATABASE: mydb
                            networks:
                              - appnet
                        """;

        try {
            String yamlString = Yamler.asYaml(jsonString2);
            System.out.println(yamlString);

            String jsonString = Yamler.asJson(yamlString1);
            System.out.println(jsonString);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }







    }
}