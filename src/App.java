import  java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
   
        Hotel hotel = new  Hotel();
        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("MARQUE UNA DE LAS SIGUIENTES OPCIONES: ");
            System.out.println("1. Listar habitaciones libres");
            System.out.println("2. Listar habitaciones ocupadas");
            System.out.println("3. Hacer Check-In");
            System.out.println("4. Hacer Check-Out");
            System.out.println("5. Salir");

            int opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    hotel.listarHabitaLibres();
                    break;
                case 2: 
                    hotel.listarHabitaOcupadas();
                    break;
                case 3:
                    System.out.println("Marque el número de la habitación a ocupar: ");
                    int numHabAdjudicada = teclado.nextInt();
                    hotel.hacerCheckIn(numHabAdjudicada);
                    break;
                case 4:
                    System.out.println("Marque el número de la habitación a liberar: ");
                    int numHabOcupada = teclado.nextInt();
                    hotel.hacerCheckOut(numHabOcupada);
                    break;
                case 5:
                continuar =false;

                default:
                    System.out.println("Opción no válida. Pruebe de nuevo");
            }
        }
        teclado.close();
    }
}
