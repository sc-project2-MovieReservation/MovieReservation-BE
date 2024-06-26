package com.github.moviereservationbe.web.DTO.myPage;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserUpdateRequestDto {
    @JsonProperty("name")
    private String name;
    @JsonProperty("my-id")
    private String myId;
    @JsonProperty("password")
    private String password;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("birthday")
    private Date birthday;
    @JsonProperty("phone-number")
    private String phoneNumber;

    public UserUpdateRequestDto(String password) {
        this.password = password;
    }
}
