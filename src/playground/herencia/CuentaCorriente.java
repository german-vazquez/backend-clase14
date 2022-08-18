package playground.herencia;

import playground.herencia.Cuenta;

public class CuentaCorriente extends Cuenta {

    @Override
    public boolean extraer(double monto) {
        setSaldo(getSaldo()- monto);
        return true;
    }
}
