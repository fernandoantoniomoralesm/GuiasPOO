/*
 * To change this license header, choose License Headers in Project Properties.
2.	Crear una subclase con el nombre transacción a partir de la superclase banco, que posea los métodos:
Deposito y Retiro. Debe asegurarse que no se pueda retirar una cantidad mayor al monto de la cuenta.
 * and open the template in the editor.
 */
package Guia5;

/**
 *
 * @author Usuario
 */
public class Transaccion extends Banco{
    private double dinero;
    
    
    public Transaccion(int NCuenta, double Monto) {
        super(NCuenta, Monto);
    }

    public Transaccion(double dinero, int NCuenta, double Monto) {
        super(NCuenta, Monto);
        this.dinero = dinero;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = (dinero>this.getMonto() ? 0: dinero);//Validar cantidad no sea menor que cero

    }

    @Override
    public double Retirar( ) {
      return this.getMonto()-this.dinero;

    }

 
    @Override
    public double Depositar() {
       return this.getMonto()+this.dinero;

    }
    
}
