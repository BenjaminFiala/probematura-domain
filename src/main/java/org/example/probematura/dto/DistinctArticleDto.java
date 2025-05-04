package org.example.probematura.dto;

import java.time.LocalDateTime;

public record DistinctArticleDto(
    Integer number,
    String name,
    LocalDateTime date,
    String firstName,
    String lastName
) {

}
