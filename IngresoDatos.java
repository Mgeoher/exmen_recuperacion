import java.util.Scanner;

public class IngresoDatos extends RegistroYMuestraDatos{

    Scanner sc = new Scanner(System.in);
    public void departamentos () {
        System.out.println("Ingrese un numero para codigo de identificacion");
        codigo1 = sc.nextLine();
        System.out.println("Ingresa nombre del Departamento");
        departamento = sc.nextLine();
        System.out.println("Ingresa la Cantidad de municipios");
        municipios = sc.nextLine();
        System.out.println("Ingresa el nombre de la cabecera");
        cabecera = sc.nextLine();
        System.out.println("Ingrese Region que pertenese");
        region = sc.nextLine();


        lista.add(codigo1);
        lista.add(departamento);
        lista.add(municipios);
        lista.add(cabecera);
        lista.add(region);

        this.registrarDatosVectores();

    }


}
