
package br.com.marlin.model;

import java.util.Date;

public class Caixa {
    
    private Date data;
    private double saldoInicial;
    private double entradas;
    private double saidas;
    private double saldoFinal;
    private StatusCaixa status;

    public Caixa() {
        data = new Date();
        status = Caixa.StatusCaixa.ABERTO;
    }

    public Date getCaixaData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public enum StatusCaixa {
        ABERTO,FECHADO;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public double getEntradas() {
        return entradas;
    }

    public void setEntradas(double entradas) {
        this.entradas = entradas;
    }

    public double getSaidas() {
        return saidas;
    }

    public void setSaidas(double saidas) {
        this.saidas = saidas;
    }

    public double getSaldoFinal() {
        return saldoFinal;
    }

    public void setSaldoFinal(double saldoFinal) {
        this.saldoFinal = saldoFinal;
    }

    public StatusCaixa getStatus() {
        return status;
    }

    public void setStatus(StatusCaixa status) {
        this.status = status;
    }
    
    
    
}
