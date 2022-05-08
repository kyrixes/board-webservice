package com.webservice.board.web;

import com.webservice.board.web.dto.BasicResponseDto;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BasicResponseDtoTest {

    @Test
    public void lombokTest() {
        // given
        String name = "test";
        int amount = 1000;

        // when
        BasicResponseDto dto = new BasicResponseDto(name, amount);

        // then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);

    }
}
