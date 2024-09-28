
import java.time.LocalDate;
import java.time.Month;

public class Doble extends Habitacion {

public Doble (int num){
super (num, 100.0, "Doble");
}

@Override
public double calcularPrecio(long diasEstancia){
LocalDate fechaCheckOut = LocalDate.now();
double precioFinal = diasEstancia * tarifa;
//Incremento del 20% en abri, julio o agosto
    if (fechaCheckOut.getMonth() == Month.APRIL || fechaCheckOut.getMonth()== Month.JULY || fechaCheckOut.getMonth()==Month.AUGUST) {
            precioFinal *=1.20;
        }
return  precioFinal;
}

}