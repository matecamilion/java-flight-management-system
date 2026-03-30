import java.util.Scanner;

public class Menu {

    public static void printIniciarRegistrar(){
        System.out.println("\n\t\t Iniciar Sesion     |     Registrarse ");
        System.out.println("\t\t         1                       2      ");
    }

    public static void printIniciarSesion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t\t Mail: ");
        String email = sc.nextLine();
        System.out.println("\n\t\t Contraseña: ");
        String contraseña = sc.nextLine();
    }

    public static void printResgristrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un nombre del usuario: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese un apellido del usuario: ");
        String apellido = sc.nextLine();
        System.out.println("Ingrese DNI del usuario: ");
        String dni = sc.nextLine();
        sc.nextLine();
        System.out.println("Ingrese el mail del usuario: ");
        String mail = sc.nextLine();
        System.out.println("Ingrese tipo de usuario: (1-Administrador 2-Cliente) ");
        int tipo = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la contraseña del usuario: ");
        String contraseña = sc.nextLine();
        System.out.println("Ingrese de nuevo la contraseña: ");
        String confirmarcontraseña = sc.nextLine();
        if( contraseña == confirmarcontraseña){
            System.out.println("La cuenta ha sido creada");
        } else {
            System.out.println("Las contraseñas no coinciden");

        }
    }

    public static void menuIniciarSesionRegistrar(int x){
        if(x == 1){
            Menu.printIniciarSesion();
        } else if (x == 2){
            Menu.printResgristrar();
        } else{
            System.out.println("Ingrese una opcion valida");
        }
    }

    public void menuadministrador (String mail, String contraseña){
        int valor = 0;
        Scanner sc = new Scanner(System.in);
        char seguir = 's';
        while (seguir == 's')
        {
            System.out.println("Que funcion quiere realizar: \n ");
            valor = sc.nextInt();
            sc.nextLine();
            switch (valor){


            case 1:

                break;

            }
                System.out.println("Quiere realizar otra funcion? ");
                seguir = sc.next().charAt(0);
                sc.nextLine();


        }


    }
}
