import java.util.ArrayList;


public class Hotel {
private final ArrayList<Habitacion> habitaciones;

public Hotel() {
    //Añadir cada tipo de habitación a un arralist
    habitaciones= new ArrayList<>();
    
    //LowCost 3 habitaciones
    for (int i=1; i<=3; i++)
    habitaciones.add(new Lowcost(i));

    //Doble 10 habitaciones
    for (int i=4; i<=13; i++){
        habitaciones.add(new Doble(i));
    }

    //Suite 5 habitaciones
    for (int i=14; i<=18; i++){
        habitaciones.add(new Suite(i));
    }

}

public void listarHabitaLibres(){
    System.out.println("\nHabitaciones libres:");
    for (Habitacion h : habitaciones){
        if (!h.isOcupada()){
            System.out.println("Habitación "+ h.getNombre() + " : " + h.num);
        }
    }
}

public void listarHabitaOcupadas(){
    System.out.println("\nHabitaciones ocupadas:");
    for (Habitacion h : habitaciones){
        if (h.isOcupada()){
            System.out.println("Habitación "+ h.getNombre() + " : " + h.num);
        }
    }
}

public void hacerCheckIn(int numHabitacion) {
    Habitacion habitacion =habitaciones.get(numHabitacion - 1);
    if (!habitacion.isOcupada()){
        habitacion.hacerCheckIn();
        System.out.println("Check-in en la habitación "+ numHabitacion + "realizado.");
    }else {
        System.out.println("Habitación ocupada");
    }
    }

public void hacerCheckOut(int numHabitacion) {
    Habitacion habitacion = habitaciones.get(numHabitacion - 1);
    if (habitacion.isOcupada()){
        double total = habitacion.hacerCheckOut();
        System.out.println("Check-out en la habitación "+ numHabitacion + " realizado.");
        System.out.println("Total a pagar: "+ total + " euros.");
    }else {
        System.out.println("La habitación está libre");
    }

}

}

