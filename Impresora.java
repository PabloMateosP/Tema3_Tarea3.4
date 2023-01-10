package org.ieslosremedios.daw1.prog.ut3.interfaces;

public class Impresora implements Imprimible, Borrable{
    String pagina;
    @Override
    public void imprime() {
        System.out.println(pagina);
    }

    @Override
    public void establecerContenido() {
        pagina = this.pagina;
    }

    public Impresora(){
        pagina = Imprimible.TEXTO_POR_DEFECTO;
    }

    @Override
    public void Borrar() {
        System.out.println(" ");
    }
}
