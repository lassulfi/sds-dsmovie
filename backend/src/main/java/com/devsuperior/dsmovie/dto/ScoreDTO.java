package com.devsuperior.dsmovie.dto;

import io.swagger.annotations.ApiModelProperty;

public class ScoreDTO {

    @ApiModelProperty(name = "Movie Id", example = "99")
    private Long movieId;

    @ApiModelProperty(name = "User email", example = "user@email.com")
    private String email;

    @ApiModelProperty(value = "Movie score", example = "4.0")
    private Double score;

    public ScoreDTO() {
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
