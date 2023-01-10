package org.ieslosremedios.daw1.prog.ut3.interfaces;

public class Consola implements Imprimible, Borrable{
    String pantalla;
    @Override
    public void imprime() {
        System.out.printf("$ " + pantalla);
    }

    @Override
    public void establecerContenido() {
        imprime();
    }

    @Override
    public void Borrar() {

    }
}
