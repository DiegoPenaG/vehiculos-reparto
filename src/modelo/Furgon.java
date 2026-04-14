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
        System.out.println("=== FURGÓN ==="); // Imprime el tipo de vehículo
        System.out.println("Patente: " + getPatente()); // Muestra la patente usando getter (encapsulación)
        System.out.println("Marca: " + getMarca()); // Muestra la marca usando getter
        System.out.println("Modelo: " + getModelo()); // Muestra el modelo usando getter
        System.out.println("Capacidad: " + getCapacidadCarga() + " kg"); // Muestra la capacidad de carga usando getter
        System.out.println("Volumen: " + getVolumenInterior() + " m³"); // Muestra el volumen con unidad usando getter
        System.out.println("Disponible: " + isDisponible()); // Muestra si el vehículo está disponible
    }
}
