package br.unitins.topicos1.dto;

import br.unitins.topicos1.model.CategoriaProduto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ProdutoDTO {

    @NotBlank(message = "O campo marca não pode ser nulo.")
    private final String marca;
    
    @NotBlank(message = "O campo modelo não pode ser nulo.")
    private final String modelo;
    
    @NotNull(message = "A categoria do produto não pode ser nula.")
    private final CategoriaProduto categoriaProduto;
    
    @NotBlank(message = "O campo cor não pode ser nulo.")
    private final String cor;
    
    private final Integer tamanho;
    
    @NotNull(message = "O valor não pode ser nulo.")
    private final Double valor;

    public ProdutoDTO(String marca, String modelo, CategoriaProduto categoriaProduto, String cor, Integer tamanho, Double valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.categoriaProduto = categoriaProduto;
        this.cor = cor;
        this.tamanho = tamanho;
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public CategoriaProduto getCategoriaProduto() {
        return categoriaProduto;
    }
    public String getCor() {
        return cor;
    }
    public Integer getTamanho() {
        return tamanho;
    }
    public Double getValor() {
        return valor;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((marca == null) ? 0 : marca.hashCode());
        result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
        return result;
    }

}
