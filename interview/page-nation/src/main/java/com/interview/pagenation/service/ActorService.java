package com.interview.pagenation.service;

import com.interview.pagenation.model.Actor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ActorService {
    Object getAllActors();

    Object getByOffsetLimit(int offset, int limit);

    Object getActorById(short id);

    Page<Actor> getAllEntities(Pageable pageable);
}
