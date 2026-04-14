package modelo;

public class Furgon extends Vehiculo { // Clase Furgon que hereda de Vehiculo (herencia)

    private double volumenInterior; // Atributo propio del furgón (volumen en m³)

    public Furgon(String patente, String marca, String modelo, double capacidadCarga, double volumenInterior) { // Constructor
        super(patente, marca, modelo, capacidadCarga); // Llama al constructor de la clase padre para inicializar atributos comunes
        setVolumenInterior(volumenInterior); // Asigna el volumen usando el setter (con validación)
    }

    public double getVolumenInterior() { // Método getter para obtener el volumen interior
        return volumenInterior; // Retorna el valor almacenado en el atributo
    }

    public void setVolumenInterior(double volumenInterior) { // Método setter para asignar volumen
        if (volumenInterior > 0) { // Verifica que el volumen sea válido (mayor que 0)
            this.volumenInterior = volumenInterior; // Guarda el valor en el atributo del objeto
        } else { // Si el volumen es inválido
            System.out.println("Volumen inválido"); // Muestra mensaje de error al usuario
            // No se asigna ningún valor, se mantiene el anterior (o 0 por defecto)
        }
    }

    @Override // Indica que este método sobrescribe uno definido en la clase padre
    public void mostrarDetalle() { // Método que muestra la información del furgón (polimorfismo)
        System.out.println("===== DETALLES DEL FURGÓN ====="); // Imprime el tipo de vehículo
        System.out.printf("Patente: %s%n", getPatente()); // Muestra la patente usando getter (encapsulación)
        System.out.printf("Marca: %s%n", getMarca()); // Muestra la marca usando getter
        System.out.printf("Modelo: %s%n", getModelo()); // Muestra el modelo usando getter
        System.out.printf("Capacidad de Carga: %.2f kg%n", getCapacidadCarga()); // Muestra la capacidad de carga usando getter
        System.out.printf("Volumen Interior: %.2f m³%n", getVolumenInterior()); // Muestra el volumen con unidad usando getter
        System.out.printf("Disponible: %s%n", isDisponible() ? "Sí" : "No"); // Muestra si el vehículo está disponible
        System.out.println("=================================");
    }
}
