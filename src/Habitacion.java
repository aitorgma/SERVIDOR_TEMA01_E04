import java.time.Duration;
import java.time.LocalDateTime;

public abstract class Habitacion {
    protected int num;
    protected String nombre;
    protected boolean ocupada;
    protected double tarifa;
    protected LocalDateTime fechaCheckIn;

    public Habitacion(int num, double tarifa, String nombre) {
        this.num = num;
        this.tarifa = tarifa;
        this.nombre = nombre;
        this.ocupada = false;
    }

    public int getNum() {
        return this.num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getOcupada() {
        return this.ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public double getTarifa() {
        return this.tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public LocalDateTime getFechaCheckIn() {
        return this.fechaCheckIn;
    }

    public void setFechaCheckIn(LocalDateTime fechaCheckIn) {
        this.fechaCheckIn = fechaCheckIn;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void hacerCheckIn() {
        this.ocupada = true;
        this.fechaCheckIn = LocalDateTime.now();
    }

    public double hacerCheckOut() {
        this.ocupada = false;
        LocalDateTime fechaCheckOut = LocalDateTime.now();
        long diasEstancia = Duration.between(fechaCheckIn, fechaCheckOut).getSeconds(); 
        return calcularPrecio(diasEstancia);
    }

    
    public abstract double calcularPrecio(long diasEstancia);
}