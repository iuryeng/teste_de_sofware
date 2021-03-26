package com.atividade3.vacinapb.dominio;

import lombok.extern.apachecommons.CommonsLog;

import javax.persistence.*;

@Entity
@Table(name= "USUARIO")
public class Usuario {

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getGrupoPrioritario() {
        return grupoPrioritario;
    }

    public void setGrupoPrioritario(String grupoPrioritario) {
        this.grupoPrioritario = grupoPrioritario;
    }


    private Long id;

    //@Column(name = "NOME")
    private String nome;

    //@Column(name="CPF")
    private String CPF;

    //@Column(name="DATA_NASCIMENTO")
    private String dataNascimento;

    //@Column(name="GRUPO_PRIORITARIO")
    private String grupoPrioritario;

    //@Column(name="SENHA")
    private String senha;





}

