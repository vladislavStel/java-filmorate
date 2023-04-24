package ru.yandex.practicum.filmorate.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.Date;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorResponse {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private Date timestamp;

    private int code;

    private String status;

    private String fieldName;

    private String message;

    private Long count;

    public ErrorResponse() {
        timestamp = new Date();
    }

    public ErrorResponse(HttpStatus httpStatus, String message) {
        this();

        this.code = httpStatus.value();
        this.status = httpStatus.name();
        this.message = message;
    }

    public ErrorResponse(HttpStatus httpStatus, String message, Long count) {
        this();

        this.code = httpStatus.value();
        this.status = httpStatus.name();
        this.message = message;
        this.count = count;
    }

    public ErrorResponse(HttpStatus httpStatus, String fieldName, String message) {
        this();

        this.code = httpStatus.value();
        this.status = httpStatus.name();
        this.fieldName = fieldName;
        this.message = message;
    }
}