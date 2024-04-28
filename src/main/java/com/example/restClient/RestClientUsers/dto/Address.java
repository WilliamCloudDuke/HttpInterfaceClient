package com.example.restClient.RestClientUsers.dto;

public record Address(
        String street,
        String suite,
        String city,
        String zipcode,
        Geo geo
) {
}
