package br.com.ada.currencyapi.domain;

import lombok.*;
import org.springframework.context.annotation.Bean;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AwesomeApiResponse {

    private String high;
}