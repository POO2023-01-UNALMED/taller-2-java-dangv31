package test;

public class Motor {
	int numerosCilindros;
    String tipo;
    int registro;

    void cambiarRegistro(int registro){
        this.registro=registro;
    }
    void asignarTipo(String tipo){
        if (tipo=="electrico" || tipo=="gasolina") {
        	this.tipo=tipo;
        }
    }	
}
