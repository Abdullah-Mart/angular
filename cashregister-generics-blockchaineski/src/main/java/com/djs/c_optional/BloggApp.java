package com.djs.c_optional;

import java.util.Optional;

public class BloggApp {

    public static void main(String[] args) {

        Blog blogs = new Blog();
        blogs.addTopic( "weather", new Topic("It will rain all day"));
        blogs.addTopic( "business", new Topic("Albert Heijn is making more profit"));
        blogs.addTopic( "food", new Topic("Carrot's are healthy"));
        blogs.addTopic( "sport", new Topic("Spain beat Holland"));

        Optional<Topic> topic = blogs.getTopic("food1");
        if(topic.isPresent()){
            System.out.println( topic.get().getText());
        }

        System.out.println( topic.orElse( new Topic("No topic found")).getText());
        System.out.println( topic.orElseThrow().getText());

    }
}
