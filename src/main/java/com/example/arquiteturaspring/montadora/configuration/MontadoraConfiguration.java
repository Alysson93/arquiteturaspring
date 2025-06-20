package com.example.arquiteturaspring.montadora.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.arquiteturaspring.montadora.Motor;
import com.example.arquiteturaspring.montadora.TipoMotor;

@Configuration
public class MontadoraConfiguration {
    
    @Bean(name = "motorAspirado")
    @Primary
    Motor motorAspirado() {
        var motor = new Motor();
        motor.setModelo("XPTO-0");
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setLitragem(2.0);
        motor.setTipoMotor(TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean(name = "motorEletrico")
    Motor motorEletrico() {
        var motor = new Motor();
        motor.setModelo("XPTO-0");
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setLitragem(2.0);
        motor.setTipoMotor(TipoMotor.ELETRICO);
        return motor;
    }

    @Bean(name = "motorTurbo")
    Motor motorTurbo() {
        var motor = new Motor();
        motor.setModelo("XPTO-0");
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setLitragem(2.0);
        motor.setTipoMotor(TipoMotor.TURBO);
        return motor;
    }

}
