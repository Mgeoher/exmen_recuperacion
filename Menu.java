
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
            System.out.println("1-Ingresar Datos "+"2-Historial de Datos en forma de lista ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                   this.departamentos();
                    break;
                case 2:
                  this.mostrarLista();
                    do {
                        System.out.println("se encuentra el dato? "+ "1-si regresar " + "2- no " );
                        int op1 = sc.nextInt();
                        switch (op1){
                            case 1: regresar = false;
                                break;
                            case 2:this.busquedaLista();
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
