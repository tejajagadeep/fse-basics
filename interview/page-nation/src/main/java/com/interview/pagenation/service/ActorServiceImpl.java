package com.interview.pagenation.service;

import ch.qos.logback.core.pattern.parser.OptionTokenizer;
import com.interview.pagenation.dto.ActorDto;
import com.interview.pagenation.repository.ActorRepository;
import com.interview.pagenation.model.Actor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ActorServiceImpl implements ActorService{

    private final ActorRepository actorRepository;

    private final ModelMapper modelMapper;

    @Autowired
    public ActorServiceImpl(ActorRepository actorRepository, ModelMapper modelMapper) {
        this.actorRepository = actorRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<ActorDto> getAllActors() {
        return actorRepository.findAll().stream()
                .map(actor -> modelMapper.map(actor, ActorDto.class))
                .toList();
    }

    @Override
    public Object getByOffsetLimit(int offset, int limit) {
        return actorRepository.findActorsWithOffsetAndLimit2(offset, limit).stream()
                .map(actor -> modelMapper.map(actor, ActorDto.class))
                .toList();
    }

    @Override
    public Object getActorById(short id) {
        return actorRepository.findById(id).get();
    }

    @Override
    public Page<Actor> getAllEntities(Pageable pageable) {
        return actorRepository.findAll(pageable);
    }
}
