package com.interview.pagenation.controller;

import com.interview.pagenation.model.Actor;
import com.interview.pagenation.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

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

    /**
     * Provide offset and limit http://localhost:8080/actor/entities?offset=5&limit=5
     * @param offset
     * @param limit
     * @return
     */
    @GetMapping("/entities")
    public Object getEntitiesWithOffsetAndLimit(
            @RequestParam(defaultValue = "0") int offset,
            @RequestParam(defaultValue = "10") int limit) {
        return actorService.getByOffsetLimit(offset, limit);
    }

    @GetMapping("/id/{id}")
    public Object getActorById(@PathVariable short id){
        return actorService.getActorById(id);
    }

    @GetMapping("/pageable")
    public Page<Actor> getAllEntities(
            @RequestParam(defaultValue = "0") Integer page,
            @RequestParam(defaultValue = "10") Integer size) {
        return actorService.getAllEntities(PageRequest.of(page, size));
    }

}
