package com.tugas;

abstract class Saldo {
    private double saldo;
    public abstract double minSaldo();

    void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    double getSaldo() {
        return saldo;
    }

    public double konSaldo(double s) {
        return s;
    }
}
