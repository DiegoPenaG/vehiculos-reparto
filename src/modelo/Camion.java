package modelo;

public class Camion extends Vehiculo {
    // Atributo propio del Camion
    private int numeroEjes;
    // Constructor vacío
    public Camion() {
        super();
    }
    // Constructor con parámetros
    public Camion(String patente, String marca, String modelo,
                  double capacidadCarga, boolean disponible,
                  int numeroEjes) {
        super(patente, marca, modelo, capacidadCarga, disponible);
        this.numeroEjes = numeroEjes;
    }
    // Getter
    public int getNumeroEjes() {
        return numeroEjes;
    }
    // Setter con validación
    public void setNumeroEjes(int numeroEjes) {
        if (numeroEjes <= 0) {
            System.out.println("Número de ejes inválido");
        } else {
            this.numeroEjes = numeroEjes;
        }
    }
    // POLIMORFISMO: sobrescritura del método del padre
    @Override
    public void mostrarDetalle() {
        System.out.println("===== CAMIÓN =====");
        System.out.println("Patente: " + getPatente());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Capacidad: " + getCapacidadCarga());
        System.out.println("Disponible: " + isDisponible());
        System.out.println("Ejes: " + numeroEjes);
        System.out.println("==================");
    }
}