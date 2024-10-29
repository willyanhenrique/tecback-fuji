package br.com.fujideia.iesp.tecback.Client;

import br.com.fujideia.iesp.tecback.model.dto.EnderecoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient (name = "viacepclient",
            url = "https://Viacep.com.br/ws")
public interface ViaCepClient {

    @GetMapping("/{cep}/json")
    EnderecoDTO buscarEnderecoPorCep
            (@PathVariable("cep")String cep);
}
