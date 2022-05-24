package com.example.employeepayrollapp.dto;

import lombok.Data;

public class ResponseDTO {
    @Data
    private String message;
    private Object data;
    public ResponseDTO(String message, Object data) {
        this.message = message;
        this.data = data;
    }

}
