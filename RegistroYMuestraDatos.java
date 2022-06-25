import java.util.ArrayList;
import java.util.List;

public class RegistroYMuestraDatos {

    List lista = new ArrayList<>();

    protected String departamento;
    protected String municipios;
    protected String cabecera;
    protected String region;

    public void mostrarLista (){ // muestra el historial en lista
        for(int i=0; i<this.lista.size(); i++){
            System.out.println("" + (i+1) + "" + this.lista.get(i)); }

       /* for (int i = 0; i <= lista.size() - 1; i++) {
            System.out.println(lista.get(i));
        }

        */
    }
}
