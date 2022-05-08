package com.webservice.board.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BasicResponseDto {
    private final String name;
    private final int amount;
}
