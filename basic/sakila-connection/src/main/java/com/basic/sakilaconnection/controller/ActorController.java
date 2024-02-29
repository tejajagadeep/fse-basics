package com.basic.sakilaconnection.controller;

import com.basic.sakilaconnection.dao.model.Actor;
import com.basic.sakilaconnection.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.objenesis.ObjenesisHelper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/actor")
public class ActorController {

    private final ActorService actorService;

    @Autowired
    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }


    @GetMapping("")
    public Object getAllActors(){
        return actorService.getAllActors();
    }


}
