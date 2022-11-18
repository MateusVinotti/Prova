package com.example.demo.dto;

public class clienteDTO {
    private String profissao;

    public clienteDTO() {
    }

    public clienteDTO(String profissao) {
        this.profissao = profissao;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }


}
