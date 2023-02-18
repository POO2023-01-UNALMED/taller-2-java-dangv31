package test;

public class asiento {
    String color;
    long precio;
    int registro;

    void cambiarColor(String newcolor){
        if (newcolor=="rojo" || newcolor=="verde" || newcolor=="amarillo" || newcolor=="negro" || newcolor=="blanco" ){
            color=newcolor;
        }
        else System.out.println("Color invalido");
    }
}
