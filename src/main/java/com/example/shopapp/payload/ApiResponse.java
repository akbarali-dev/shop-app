package com.example.shopapp.payload;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ApiResponse {

    private String message;

    private boolean isSuccess;

    private Object data;
}
