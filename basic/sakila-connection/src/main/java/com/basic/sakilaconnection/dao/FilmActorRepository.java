package com.basic.sakilaconnection.dao;

import com.basic.sakilaconnection.dao.model.FilmActor;
import com.basic.sakilaconnection.dao.model.FilmActorId;
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
