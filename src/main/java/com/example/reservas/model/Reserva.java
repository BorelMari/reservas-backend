
package com.example.reservas.model;

public class Reserva {

    // Atributos
    private int codigo;
    private String nomeResponsavel;
    private String sala;
    private String data;
    private String horario;
    private int quantidadePessoas;

    // Construtor vazio
    public Reserva() {
    }

    // Construtor com todos os atributos
    public Reserva(int codigo, String nomeResponsavel,
                   String sala, String data, String horario,
                   int quantidadePessoas) {

        this.codigo = codigo;
        this.nomeResponsavel = nomeResponsavel;
        this.sala = sala;
        this.data = data;
        this.horario = horario;
        this.quantidadePessoas = quantidadePessoas;
    }

    // Getters e Setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    // Método toString
    @Override
    public String toString() {
        return "Reserva{" +
                "codigo=" + codigo +
                ", nomeResponsavel='" + nomeResponsavel + '\'' +
                ", sala='" + sala + '\'' +
                ", data='" + data + '\'' +
                ", horario='" + horario + '\'' +
                ", quantidadePessoas=" + quantidadePessoas +
                '}';
    }
}
