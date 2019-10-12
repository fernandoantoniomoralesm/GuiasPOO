/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * No de cuenta, Obtener No de cuenta, Asignar monto y Obtener monto.
 */
package Guia5;

/**
 *
 * @author Usuario
 */
public abstract class Banco {
    private int NCuenta;
    private double Monto;

    public Banco(int NCuenta, double Monto) {
        this.NCuenta = NCuenta;
        this.Monto = Monto;
    }

    public int getNCuenta() {
        return NCuenta;
    }

    public void setNCuenta(int NCuenta) {
        this.NCuenta = NCuenta;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
    }
  public abstract double Retirar( );
  public abstract double Depositar( );

}
