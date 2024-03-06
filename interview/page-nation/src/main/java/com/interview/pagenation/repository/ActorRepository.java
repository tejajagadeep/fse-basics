package com.interview.pagenation.repository;

import com.interview.pagenation.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created on 21/04/2018.
 * We extends from JpaRepository because that interface support pagination and sorting methods.
 *
 * @author Cesardl
 */
@Transactional
public interface ActorRepository extends JpaRepository<Actor, Short> {

    /**
     * This method will find an DTOActor instance in the database by its last name.
     * Note that this method is not implemented and its working code will be
     * automatically generated from its signature by Spring Data JPA.
     */
    Actor findByLastName(String lastName);

    /**
     *
     * This method will find the actors with page nation with using OFFSET and LIMIT
     * instead of pageable
     *
     * @param offset
     * @param limit
     * @return
     */
    @Query(value = "SELECT * FROM Actor ORDER BY actor_id LIMIT ?2 OFFSET ?1", nativeQuery = true)
    List<Actor> findActorsWithOffsetAndLimit(int offset, int limit);
    @Query(value = "SELECT * FROM Actor ORDER BY actor_id LIMIT :lim OFFSET :off", nativeQuery = true)
    List<Actor> findActorsWithOffsetAndLimit2(@Param("off") int offset,@Param("lim") int limit);
}
