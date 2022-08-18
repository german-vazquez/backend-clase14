package playground.composicion;

public class Main {
    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta();
        cuenta.setSaldo(2000);
        cuenta.setNumero(1101);
        cuenta.setEstrategia(new EstrategiaCajaAhorro());

        cuenta.extraer(100);
        System.out.println(cuenta.getSaldo());

        cuenta.setEstrategia(new EstrategiaCuentaCorriente());
        cuenta.extraer(2000);
        System.out.println(cuenta.getSaldo());
    }

}
