package model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Carteira {
    public Carteira() {
    }

    public Carteira(Float saldo, Float pontos) {
        this.saldo = saldo;
        this.pontos = pontos;
    }

    @Column(name = "SALDO", nullable = false)
    private Float saldo;

    @Column(name = "PONTOS", nullable = false)
    private Float pontos;

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public Float getPontos() {
        return pontos;
    }

    public void setPontos(Float pontos) {
        this.pontos = pontos;
    }
}
