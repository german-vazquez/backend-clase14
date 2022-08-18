package playground.herencia;

import playground.herencia.Cuenta;
import playground.herencia.CuentaCorriente;

public class Main {
    public static void main(String[] args) {

        //vinculacion dinámica
        Cuenta cuenta = new CuentaCorriente();
        cuenta.setSaldo(1000);
        //Polimorfismo
        cuenta.extraer(1100);

        System.out.println(cuenta.getSaldo());
    }

}
