package com.tugas;

public class SaldoPengaturan extends Saldo {
    double minSaldoku;
    private double saldoKu;
    public double minSaldo(){
        minSaldoku= 50000;
        return minSaldoku;
    }

    @Override
    public double konSaldo(double s) {
        super.konSaldo(s);
        saldoKu = getSaldo();
        saldoKu -= s;
        return saldoKu;
    }
}
