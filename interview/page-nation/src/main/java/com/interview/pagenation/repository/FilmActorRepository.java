package com.interview.pagenation.repository;

import com.interview.pagenation.model.FilmActor;
import com.interview.pagenation.model.FilmActorId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created on 28/04/2018.
 *
 * @author Cesardl
 */
@Transactional
public interface FilmActorRepository extends CrudRepository<FilmActor, FilmActorId> {
}
