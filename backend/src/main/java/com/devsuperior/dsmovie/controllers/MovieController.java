package com.devsuperior.dsmovie.controllers;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.services.MovieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "/movies")
@Api(value = "/movies", tags = "Movies")
public class MovieController {

    @Autowired
    private MovieService service;

    @GetMapping
    @ResponseStatus(HttpStatus.PARTIAL_CONTENT)
    @ApiOperation(
        value = "Returns a paginated list of movies",
        notes = "This operation returns a paginated list of movies",
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ApiResponses(value = {
        @ApiResponse(code = 206, message = "Partial Content")
    })
    public Page<MovieDTO> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(
        value = "Find a movie by id",
        notes = "Given a value movie id, this operation returns the data of the specific movie",
        response = MovieDTO.class,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK", response = MovieDTO.class)
    })
    public MovieDTO findById(@PathVariable(name = "movie-id") Long id) {
        return service.findById(id);
    }
}
