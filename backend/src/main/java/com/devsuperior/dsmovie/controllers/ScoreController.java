package com.devsuperior.dsmovie.controllers;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.dto.ScoreDTO;
import com.devsuperior.dsmovie.services.ScoreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "/scores")
@Api(value = "/scores", tags = "Scores")
public class ScoreController {

    @Autowired
    private ScoreService service;

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(
        value = "Save a score to a given movie",
        notes = "Given an user identified by its email, a movie identified by its id," +  
        "this operation creates a score or updates an existing score",
        response = MovieDTO.class,
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ApiResponses(value = {
        @ApiResponse(code = 201, message = "Created", response = MovieDTO.class)
    })
    public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
        MovieDTO movieDTO = service.saveScore(dto);
        return movieDTO;
    }
}
