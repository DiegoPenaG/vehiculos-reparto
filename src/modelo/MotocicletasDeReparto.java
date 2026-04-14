package modelo;

public class MotocicletasDeReparto extends Vehiculo {

    private boolean tieneCajaTermica;

    public MotocicletasDeReparto(String patente, String marca, String modelo,
                                 double capacidadCarga, boolean disponible, boolean tieneCajaTermica) {
        super(patente, marca, modelo, capacidadCarga, disponible);
        this.tieneCajaTermica = tieneCajaTermica;
    }

    public boolean isTieneCajaTermica() {
        return tieneCajaTermica;
    }

    public void setTieneCajaTermica(boolean tieneCajaTermica) {
        this.tieneCajaTermica = tieneCajaTermica;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Patente: " + getPatente()
                + " | Tipo: Moto de reparto"
                + " | Marca: " + getMarca()
                + " | Modelo: " + getModelo()
                + " | Capacidad: " + getCapacidadCarga()
                + " | Disponible: " + (isDisponible() ? "Sí" : "No")
                + " | Caja térmica: " + (tieneCajaTermica ? "Sí" : "No"));
    }
}