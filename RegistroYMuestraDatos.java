import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroYMuestraDatos {

    List lista = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    protected String codigo;
    protected String departamento;
    protected String municipios;
    protected String cabecera;
    protected String region;

    public void mostrarLista (){ // muestra el historial en lista
        for(int i=0; i<this.lista.size(); i++){
            System.out.println("" + (i+1) + " " + this.lista.get(i)); }

       /* for (int i = 0; i <= lista.size() - 1; i++) {
            System.out.println(lista.get(i));
        }
        */
    }
    public void busquedaLista(){ // es la busuqeda de los datos en la lista
        System.out.println("Ingrese el nombre del departamento para la busqueda");
        String busqueda = sc.nextLine();
        int indice = lista.indexOf(busqueda);
        if (indice != -1) {
            System.out.println("El elemento "+ busqueda +" fue ingresado");
        } else {
            System.out.println("El elemento " + busqueda + " no existe");
        }
    }

}
