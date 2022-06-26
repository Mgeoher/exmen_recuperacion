
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu extends IngresoDatos{

    Scanner sc = new Scanner(System.in);
    public boolean salir = false;
    public boolean regresar = true;


    List lista = new ArrayList<>();
    public void menu(){
        do {
            System.out.println("Escibe una opcion");
            System.out.println("1-Ingresar Datos "+"2-Historial de Datos en forma de lista "+ "3-busqueda de datos en lista "+ "4-Mostrar datos por medio de Vectores");
            System.out.println("5-Busqueda de datos por vectores ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                   this.departamentos();
                    break;
                case 2:
                  this.mostrarLista();

                    break;
                case 3: do {
                    System.out.println( "1-busqueda por nombre " + "2-busqueda por numero " + "0-regresar");
                    int op1 = sc.nextInt();
                    switch (op1){
                        case 0: regresar = false;
                            break;
                        case 1:
                            this.busquedaLista();
                            break;
                        case 2:
                            this.busquedaListaNumero();
                        break;
                        default: System.out.println("Solo numeros 1 y 2");
                    }
                }while (regresar);
                    break;
                case 4:
                    this.mostrarDatosVectores();
                    break;
                case 5: do {
                    System.out.println( "1-busqueda por nombre " + "2-busqueda por letra " + "0-regresar");
                    int op1 = sc.nextInt();
                    switch (op1){
                        case 0: regresar = false;
                            break;
                        case 1:
                            this.buscarVectordepartamento();
                            break;
                        case 2:
                            this.buscarLetra();
                            break;
                        default: System.out.println("Solo numeros 1 y 2");
                    }

                }while (regresar);
                    break;
                case 0:
                    System.out.println("Vuelva pronto");
                    salir = true;
                    break;
                default:
                    System.out.println("Intente de nuevo");

            }
        }while (!salir);
    }
}
