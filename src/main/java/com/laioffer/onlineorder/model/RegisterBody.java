package com.laioffer.onlineorder.model;


import com.fasterxml.jackson.annotation.JsonProperty;


public record RegisterBody(
        String email,
        String password,
        String firstName,
        String lastName
) {
}

