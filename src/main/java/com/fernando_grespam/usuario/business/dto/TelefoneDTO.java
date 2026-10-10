package com.fernando_grespam.usuario.business.dto;

import jakarta.persistence.Column;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TelefoneDTO {

    private String numero;
    private String ddd;



}
