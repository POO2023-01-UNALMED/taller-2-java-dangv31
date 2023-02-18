package test;

public class Auto {
    String modelo;
    int precio;
    asiento asientos;
    String marca;
    motor Motor;
    int registro;
    public static int cantidadCreados;

    void cantidadAsientos(asiento asientos){
        this.asientos = asientos;
    }
    void verificarIntegridad(){
        if (Motor.registro!=registro || Motor.registro!=asientos.registro){
            System.out.println("Las piezas no son originales");
        }
        else System.out.println("Auto original");
    }
}
