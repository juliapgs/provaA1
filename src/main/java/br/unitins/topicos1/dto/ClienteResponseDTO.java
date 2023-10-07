package br.unitins.topicos1.dto;

import java.util.List;
import br.unitins.topicos1.model.Cliente;

public record ClienteResponseDTO(
        Long id,
        String nome,
        String email,
        String senha,
        List<TelefoneDTO> listaTelefone) {

    public static ClienteResponseDTO valueOf(Cliente cliente) {

        return new ClienteResponseDTO(
                cliente.getId(),
                cliente.getNome(),
                cliente.getEmail(),
                cliente.getSenha(),
                cliente.getListaTelefone()
                        .stream()
                        .map(t -> TelefoneDTO.valueOf(t))
                        .toList());
    }
}