package com.devsuperior.dsmovie.dto;

import com.devsuperior.dsmovie.entities.Movie;

import io.swagger.annotations.ApiModelProperty;

public class MovieDTO {

    @ApiModelProperty(value = "Movie ID", example = "99")
    private Long id;

    @ApiModelProperty(value = "Movie title", example = "TRON")
    private String title;

    @ApiModelProperty(value = "Movie score", example = "4.0")
    private Double score;

    @ApiModelProperty(value = "Number of evaluations", example = "200")
    private Integer count;

    @ApiModelProperty(value = "Movie thumb image url", example = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/wlHzvzXE9AvMgrVsKHg2PweC3aC.jpg")
    private String image;

    public MovieDTO() {
    }

    public MovieDTO(Long id, String title, Double score, Integer count, String image) {
        this.id = id;
        this.title = title;
        this.score = score;
        this.count = count;
        this.image = image;
    }

    public MovieDTO(Movie movie) {
        id = movie.getId();
        title = movie.getTitle();
        score = movie.getScore();
        count = movie.getCount();
        image = movie.getImage();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
