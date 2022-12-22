package org.rest;

import org.rest.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class Communication {

    private final String URL = "http://94.198.50.185:7081/api/users";

    @Autowired
    private RestTemplate restTemplate;

//    @Autowired
//    public Communication(RestTemplate restTemplate) {
//        this.restTemplate = restTemplate;
//    }

    public List<User> getAllUsers(){
        ResponseEntity<List<User>> listResponseEntity = restTemplate.exchange(URL, HttpMethod.GET, null, //реквест энтити тело к http рекквест
                new ParameterizedTypeReference<List<User>>() {
        });
       List<User> allUsers = listResponseEntity.getBody();

        return allUsers;
    }

    public User getUser(Long id){

        return null;
    }

    public void saveUser(User user){


    }

    public void deleteUser(Long id){

    }

}
