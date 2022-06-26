import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroYMuestraDatos {

    List lista = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    protected String departamento;
    protected String municipios;
    protected String cabecera;
    protected String region;
    protected String codigo1;

    String[] vectorDepartametos;
    String[] vectorCabecera;

    String[] restoVector;

    protected int indice;

    public RegistroYMuestraDatos() {
        this.vectorDepartametos = new String[10];
        this.vectorCabecera = new String[10];
        this.restoVector = new String[10];
        this.indice = 0;
    }

    public void mostrarLista() { // muestra el historial en lista
        for (int i = 0; i < this.lista.size(); i++) {
            System.out.println("codigo:" + (i + 1) + " " + this.lista.get(i));
        }

    }

    public void busquedaLista() { // es la busuqeda de los datos en la lista
        System.out.println("Ingrese el nombre del departamento para la busqueda");
        String busqueda = sc.nextLine();
        int indice = lista.indexOf(busqueda);
        if (indice != -1) {
            System.out.println("El elemento " + busqueda + " fue ingresado");
        } else {
            System.out.println("El elemento " + busqueda + " no existe");
        }
    }

    public void busquedaListaNumero() { // es la busuqeda de los datos en la lista por numero
        System.out.println("Ingrese el numero del departamento para la busqueda");
        codigo1 = sc.nextLine();

        if (lista.contains(codigo1)) {
            System.out.println("El departamento existe");
        } else {
            System.out.println("No Existe ");
            lista.add(codigo1);
        }
    }

    public void registrarDatosVectores() { // registra los datos con vectores

        this.vectorDepartametos[indice] = departamento;
        this.vectorCabecera[indice] = cabecera;
        this.restoVector[indice] = "Codigo: " + codigo1 + " --> " + "Numero de municipios: " + municipios + " --> " + "Region: " + region;

        this.indice = this.indice + 1;


    }

    public void mostrarDatosVectores() { // muestra el historial con vectores


        for (int i = 0; i < this.vectorDepartametos.length; i++) {
            if (this.vectorDepartametos[i] != null) {
                System.out.println("departamento:");
                System.out.println(vectorDepartametos[i]);
            }
        }
        for (int i = 0; i < this.vectorCabecera.length; i++) {
            if (this.vectorCabecera[i] != null) {
                System.out.println("cabecera departamental:");
                System.out.println(vectorCabecera[i]);
            }
        }

        for (int i = 0; i < this.restoVector.length; i++) {
            if (this.restoVector[i] != null) {
                System.out.println(restoVector[i]);
            }
        }

    }

    public static int busquedaVectorDepartamento(String[] arreglo, String buscar) {
        for (int i = 0; i < arreglo.length; i++) {
            if (buscar.equals(arreglo[i])) {
                return i;
            }
        }
        return -1;
    }

    public void buscarVectordepartamento() {
        System.out.println("Ingresa el nombre del departamneto a buscar");
        String buscar = sc.nextLine();

        int posicion = busquedaVectorDepartamento(vectorDepartametos, buscar);
        if (posicion != -1) {
            System.out.println("El elemento " + buscar + " existe en la posición: " + posicion);
        } else {
            System.out.println("El elemento  " + buscar + "  NO existe en el arreglo");
        }
    }

    public void buscarLetra() {

        String palabra = String.valueOf(this.vectorDepartametos) + departamento;
        System.out.println("Ingrese una letra");
        String letraIngresada = sc.nextLine();
        char[] vector = palabra.toCharArray();
        for (int a = 0; a < palabra.length(); a++) {
            String letra = String.valueOf(vector[a]);
            if (letraIngresada.equalsIgnoreCase(letra)) {
                System.out.println("correcto ");
            }
        }
    }

    static int datosParImpar(String[] t, int pos) {

        int res;
        if (pos < t.length) {
            if (pos % 2 == 0) {

                System.out.println(t[pos] + " esta en una posicion par");

            } else {
                //System.out.println(t[pos] + " esta en una pocision impar");
            }
            datosParImpar(t, pos + 1);
        }
        return 1;

    }

    static int datosParImpar(String[] t) {
        return (datosParImpar(t, 0));


    }

    public void paresImpares() {
        datosParImpar(vectorDepartametos);
    }

    public static int busquedaVectorCabecera(String[] arreglo, String buscar) {
        for (int i = 0; i < arreglo.length; i++) {
            if (buscar.equals(arreglo[i])) {
                return i;
            }
        }
        return -1;
    }

    public void buscarVectorCabecera() {
        System.out.println("Ingresa el nombre de la cabecera departamental a buscar");
        String buscar = sc.nextLine();

        int posicion = busquedaVectorCabecera(vectorCabecera, buscar);
        if (posicion != -1) {
            System.out.println("El elemento " + buscar + " existe en la posición: " + posicion);
        } else {
            System.out.println("El elemento  " + buscar + "  NO existe en el arreglo");
        }
    }

    static int datosParImpar1(String[] t, int pos) {

        int res;
        if (pos < t.length) {
            if (pos % 2 == 0) {

                //System.out.println(t[pos] + " esta en una posicion par");

            } else {
                System.out.println(t[pos] + " esta en una pocision impar");
            }
            datosParImpar1(t, pos + 1);
        }
        return 1;

    }

    static int datosParImpar1(String[] t) {
        return (datosParImpar1(t, 0));


    }

    public void paresImpares1() {
        datosParImpar1(vectorDepartametos);

    }
}



