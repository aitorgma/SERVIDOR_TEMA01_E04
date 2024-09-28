

public class Suite extends Habitacion {

public Suite(int num){
    super(num, 200.0, "Suite");
}



@Override
public double calcularPrecio(long diasEstancia){
double precioFinal= diasEstancia * tarifa;
//Dto 20% para estáncias >=10 días
if (diasEstancia >= 10){
    precioFinal *=0.8;}
return precioFinal;
}
}