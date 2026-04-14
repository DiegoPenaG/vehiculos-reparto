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
        System.out.println("===== DETALLES DE LA MOTO DE REPARTO =====");
        System.out.printf("Patente: %s%n", getPatente());
        System.out.printf("Marca: %s%n", getMarca());
        System.out.printf("Modelo: %s%n", getModelo());
        System.out.printf("Capacidad de Carga: %.2f kg%n", getCapacidadCarga());
        System.out.printf("Disponible: %s%n", isDisponible() ? "Sí" : "No");
        System.out.printf("Caja Térmica: %s%n", tieneCajaTermica ? "Sí" : "No");
        System.out.println("===========================================");
    }
}