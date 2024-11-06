package br.com.fujideia.iesp.tecback.model.dto;

import br.com.fujideia.iesp.tecback.model.CartaoCredito;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@RequiredArgsConstructor
@NoArgsConstructor

public class CartaoCreditoDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroCartao;

    private String nomeTitular;

    private String validade;

    private Integer cvv;

    private Double limite;

    private Double faturaAtual;


}
