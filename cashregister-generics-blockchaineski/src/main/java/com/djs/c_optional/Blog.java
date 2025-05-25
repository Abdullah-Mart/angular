package com.djs.c_optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Blog {

    private Map<String, Topic> topics = new HashMap<>();

    public void addTopic (String keyWord, Topic topic) {
        topics.put( keyWord, topic);
    }

    public Optional<Topic> getTopic(String keyWord){

        return Optional.ofNullable( topics.get( keyWord));
    }
}
