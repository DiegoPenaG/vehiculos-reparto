//Abrimos la clase principal del arcrhivo Vehiculo
public class Vehiculo {

    // 1. Atributos encapsulados (privados) [cite: 317, 332]
    private String patente;
    private String marca;
    private String modelo;
    private double capacidadCarga;
    private boolean disponible;

    // Constructor
    public Vehiculo(String patente, String marca, String modelo, double capacidadCarga) {
        // Usamos los setters en el constructor para aprovechar las validaciones desde el momento de la creación
        setPatente(patente);
        setMarca(marca);
        this.modelo = modelo; 
        setCapacidadCarga(capacidadCarga);
        this.disponible = true; // Un vehículo nuevo suele registrarse como disponible inicialmente [cite: 338]
    }

    // ==========================================
    // 2. Getters, Setters y Validaciones [cite: 333]
    // ==========================================

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        // Validación: La patente no puede venir vacía.
        if (patente == null || patente.trim().isEmpty()) {
            throw new IllegalArgumentException("Error: La patente no puede estar vacía.");
        }
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        // Validación: La marca no puede venir vacía.
        if (marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("Error: La marca no puede estar vacía.");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        // Validación: La capacidad de carga no puede ser negativa.
        if (capacidadCarga < 0) {
            throw new IllegalArgumentException("Error: La capacidad de carga no puede ser negativa.");
        }
        this.capacidadCarga = capacidadCarga;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // ==========================================
    // 3. Método para Polimorfismo.
    // ==========================================
    
    // Todas las clases hijas deben sobrescribir este método común,
    public void mostrarDetalle() {
        String estado = disponible ? "Sí" : "No";
        System.out.printf("Patente: %s | Marca: %s | Modelo: %s | Capacidad: %.2f kg | Disponible: %s%n", 
                          patente, marca, modelo, capacidadCarga, estado);
    }
}
