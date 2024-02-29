package com.interview.pagenation.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ActorDto {
    private Short actorId;

    private String firstName;

    private String lastName;

    private Date lastUpdate;
}
