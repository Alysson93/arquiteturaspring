package com.example.arquiteturaspring.montadora;

public class HondaHRV extends Carro {
    
    public HondaHRV(Motor motor) {
        super(motor);
        setModelo("Hrv");
        setCor("Preto");
        setMontadora(Montadora.HONDA);
    }

}
