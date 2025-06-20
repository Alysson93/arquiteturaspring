package com.example.arquiteturaspring.montadora;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Carro {
    
    private String modelo;
    private String cor;
    private Motor motor;
    private Montadora montadora;

    public Carro(Motor motor) {
        this.motor = motor;
    }

    public CarroStatus darIgnicao(Chave chave) {
        if (chave.getMontadora() == this.montadora) {
            return new CarroStatus("Carro ligado. Rodando com o motor " + motor.toString());
        }
        return new CarroStatus("Não é possível ligar o carro com esta chave.");
    }

}
