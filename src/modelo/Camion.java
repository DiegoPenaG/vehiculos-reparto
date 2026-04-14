package modelo;

public class Camion extends Vehiculo {
    // Atributo propio del Camion
    private int numeroEjes;
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
        System.out.println("===== DETALLES DEL CAMIÓN =====");
        System.out.printf("Patente: %s%n", getPatente());
        System.out.printf("Marca: %s%n", getMarca());
        System.out.printf("Modelo: %s%n", getModelo());
        System.out.printf("Capacidad de Carga: %.2f kg%n", getCapacidadCarga());
        System.out.printf("Disponible: %s%n", isDisponible() ? "Sí" : "No");
        System.out.printf("Número de Ejes: %d%n", numeroEjes);
        System.out.println("=================================");
    }
}