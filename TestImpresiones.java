package org.ieslosremedios.daw1.prog.ut3.interfaces;

public class TestImpresiones {
    public static void main(String[] args) {
        Imprimible impresora=new Impresora();
        impresora.imprime();
        Imprimible consola=new Consola();
        consola.imprime();
        Borrable deImpresora=new Impresora();
        deImpresora.Borrar();
        Borrable deConsola=new Consola();
        deConsola.Borrar();
        Imprimible nuevo=new Impresora();
        nuevo.imprime();
        Imprimible nuevoConsola = new Consola();
        nuevoConsola.imprime();
    }
}
