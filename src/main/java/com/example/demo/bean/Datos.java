package com.example.demo.bean;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Datos {


    private int muertesConfirmadas;
    private int muertesAyer;
    private int casosConfirmados;
    private int diferenciaCasosAyer;
    private int diferenciaMuertesAyer;
    private int diferenciaConfirmadosAyer;
    private int recuperados;

    //Getters y Setters de las propiedades

    public int getMuertesConfirmadas() {
        return muertesConfirmadas;
    }

    public Datos setMuertesConfirmadas(int muertesConfirmadas) {
        this.muertesConfirmadas = muertesConfirmadas;
        return this;
    }

    public int getMuertesAyer() {
        return muertesAyer;
    }

    public Datos setMuertesAyer(int muertesAyer) {
        this.muertesAyer = muertesAyer;
        return this;
    }

    public int getCasosConfirmados() {
        return casosConfirmados;
    }

    public Datos setCasosConfirmados(int casosConfirmados) {
        this.casosConfirmados = casosConfirmados;
        return this;
    }

    public int getDiferenciaCasosAyer() {
        return diferenciaCasosAyer;
    }

    public Datos setDiferenciaCasosAyer(int diferenciaCasosAyer) {
        this.diferenciaCasosAyer = diferenciaCasosAyer;
        return this;
    }

    public int getDiferenciaMuertesAyer() {
        return diferenciaMuertesAyer;
    }

    public Datos setDiferenciaMuertesAyer(int diferenciaMuertesAyer) {
        this.diferenciaMuertesAyer = diferenciaMuertesAyer;
        return this;
    }

    public int getDiferenciaConfirmadosAyer() {
        return diferenciaConfirmadosAyer;
    }

    public Datos setDiferenciaConfirmadosAyer(int diferenciaConfirmadosAyer) {
        this.diferenciaConfirmadosAyer = diferenciaConfirmadosAyer;
        return this;
    }

    public int getRecuperados() {
        return recuperados;
    }

    public Datos setRecuperados(int recuperados) {
        this.recuperados = recuperados;
        return this;
    }

    @Override
    public String toString() {
        return "Datos{" +
                "muertesConfirmadas=" + muertesConfirmadas +
                ", muertesAyer=" + muertesAyer +
                ", casosConfirmados=" + casosConfirmados +
                ", diferenciaCasosAyer=" + diferenciaCasosAyer +
                ", diferenciaMuertesAyer=" + diferenciaMuertesAyer +
                ", diferenciaConfirmadosAyer=" + diferenciaConfirmadosAyer +
                ", recuperados=" + recuperados +
                '}';
    }
}
