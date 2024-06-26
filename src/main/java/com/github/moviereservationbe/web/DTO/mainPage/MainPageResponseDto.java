package com.github.moviereservationbe.web.DTO.mainPage;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Getter
@Setter
@NoArgsConstructor
public class MainPageResponseDto {
    @JsonProperty("movie-poster")
    private String moviePoster;
    @JsonProperty("title-korean")
    private String titleKorean;
    @JsonProperty("ticket-sales")
    private Double ticketSales;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("release-date")
    private Date releaseDate;
    @JsonProperty("score-avg")
    private Double scoreAvg;
    @JsonProperty("D-day")
    private Integer dDay;

    public MainPageResponseDto(String moviePoster, String titleKorean, Double ticketSales, Date releaseDate, Double scoreAvg, Integer dDay) {
        this.moviePoster = moviePoster;
        this.titleKorean = titleKorean;
        this.ticketSales = Double.isNaN(ticketSales)? 100: ticketSales;
        this.releaseDate = releaseDate;
        this.scoreAvg = Double.isNaN(scoreAvg) ? 10: scoreAvg;
        this.dDay = dDay;
    }
}
