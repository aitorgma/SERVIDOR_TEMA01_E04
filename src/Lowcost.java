
public class Lowcost extends Habitacion {

public Lowcost(int num){
    super(num, 50.0, "Lowcost");
    
}

@Override
public double calcularPrecio(long diasEstancia){
    return diasEstancia * tarifa;
}

}

