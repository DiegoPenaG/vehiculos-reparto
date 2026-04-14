package servicios;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import modelo.Camion;
import modelo.Furgon;
import modelo.MotocicletasDeReparto;
import modelo.Vehiculo;

public class Main { // Clase principal del programa que maneja el menú interactivo

    public static void main(String[] args) { // Método principal donde inicia el programa
        // Inicialización del Scanner para entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Lista polimórfica para almacenar todos los vehículos
        List<Vehiculo> vehiculos = new ArrayList<>();

        // Variable para controlar la opción del menú
        int opcion = 0;

        // Bucle do-while para mostrar el menú hasta que el usuario elija salir
        do {
            // Mostrar el menú principal
            System.out.println("=== SISTEMA DE VEHÍCULOS DE REPARTO ===");
            System.out.println("1. Registrar camión");
            System.out.println("2. Registrar furgón");
            System.out.println("3. Registrar moto de reparto");
            System.out.println("4. Mostrar todos los vehículos");
            System.out.println("5. Mostrar vehículos disponibles");
            System.out.println("6. Marcar vehículo como no disponible");
            System.out.println("7. Mostrar reporte general");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Consumir el newline después de nextInt()

            // Evaluar la opción seleccionada usando switch
            switch (opcion) {
                case 1: // Caso para registrar un camión
                    // Solicitar datos del camión al usuario
                    System.out.print("Ingrese patente: ");
                    String patenteCamion = sc.nextLine();
                    System.out.print("Ingrese marca del vehículo: ");
                    String marcaCamion = sc.nextLine();
                    System.out.print("Ingrese modelo del vehículo: ");
                    String modeloCamion = sc.nextLine();
                    System.out.print("Ingrese capacidad de carga (kg): ");
                    double capacidadCamion = sc.nextDouble();
                    System.out.print("Ingrese número de ejes: ");
                    int ejesCamion = sc.nextInt();
                    sc.nextLine();

                    // Crear instancia de Camion y agregarlo a la lista
                    Camion nuevoCamion = new Camion(patenteCamion, marcaCamion, modeloCamion, capacidadCamion, true, ejesCamion);
                    vehiculos.add(nuevoCamion);

                    System.out.println("✔ Camión registrado con éxito");
                    break;

                case 2: // Caso para registrar un furgón
                    // Solicitar datos del furgón
                    System.out.print("Ingrese patente: ");
                    String patenteFurgon = sc.nextLine();
                    System.out.print("Ingrese marca del vehículo: ");
                    String marcaFurgon = sc.nextLine();
                    System.out.print("Ingrese modelo del vehículo: ");
                    String modeloFurgon = sc.nextLine();
                    System.out.print("Ingrese capacidad de carga (kg): ");
                    double capacidadFurgon = sc.nextDouble();
                    System.out.print("Ingrese volumen interior (m³): ");
                    double volumenFurgon = sc.nextDouble();
                    sc.nextLine();

                    // Crear instancia de Furgon y agregarlo a la lista
                    Furgon nuevoFurgon = new Furgon(patenteFurgon, marcaFurgon, modeloFurgon, capacidadFurgon, volumenFurgon);
                    vehiculos.add(nuevoFurgon);

                    System.out.println("✔ Furgón registrado con éxito");
                    break;

                case 3: // Caso para registrar una moto de reparto
                    // Solicitar datos de la moto
                    System.out.print("Ingrese patente: ");
                    String patenteMoto = sc.nextLine();
                    System.out.print("Ingrese marca del vehículo: ");
                    String marcaMoto = sc.nextLine();
                    System.out.print("Ingrese modelo del vehículo: ");
                    String modeloMoto = sc.nextLine();
                    System.out.print("Ingrese capacidad de carga (kg): ");
                    double capacidadMoto = sc.nextDouble();
                    System.out.print("¿Tiene caja térmica? (true/false): ");
                    boolean cajaMoto = sc.nextBoolean();
                    sc.nextLine();

                    // Crear instancia de MotocicletasDeReparto y agregarlo a la lista
                    MotocicletasDeReparto nuevaMoto = new MotocicletasDeReparto(patenteMoto, marcaMoto, modeloMoto, capacidadMoto, true, cajaMoto);
                    vehiculos.add(nuevaMoto);

                    System.out.println("✔ Moto registrada con éxito");
                    break;

                case 4: // Caso para mostrar todos los vehículos
                    // Iterar sobre la lista y mostrar detalles usando polimorfismo
                    for (Vehiculo v : vehiculos) {
                        v.mostrarDetalle();
                        System.out.println("-------------------");
                    }
                    break;

                case 5: // Caso para mostrar solo vehículos disponibles
                    // Filtrar y mostrar solo los disponibles
                    for (Vehiculo v : vehiculos) {
                        if (v.isDisponible()) {
                            v.mostrarDetalle();
                            System.out.println("-------------------");
                        }
                    }
                    break;

                case 6: // Caso para marcar un vehículo como no disponible
                    // Solicitar patente y buscar el vehículo
                    System.out.print("Ingrese patente: ");
                    String patente = sc.nextLine();
                    boolean encontrado = false;
                    for (Vehiculo v : vehiculos) {
                        if (v.getPatente().equalsIgnoreCase(patente)) {
                            v.setDisponible(false);
                            System.out.println("✔ Vehículo marcado como no disponible");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("❌ Vehículo no encontrado");
                    }
                    break;

                case 7: // Caso para mostrar el reporte general
                    // Calcular estadísticas
                    int total = vehiculos.size();
                    int camiones = 0;
                    int furgones = 0;
                    int motos = 0;
                    int disponibles = 0;

                    // Contar tipos y disponibilidad usando instanceof
                    for (Vehiculo v : vehiculos) {
                        if (v instanceof Camion) camiones++;
                        if (v instanceof Furgon) furgones++;
                        if (v instanceof MotocicletasDeReparto) motos++;
                        if (v.isDisponible()) disponibles++;
                    }

                    // Mostrar el reporte
                    System.out.println("===== REPORTE GENERAL =====");
                    System.out.println("Total vehículos: " + total);
                    System.out.println("Camiones: " + camiones);
                    System.out.println("Furgones: " + furgones);
                    System.out.println("Motos: " + motos);
                    System.out.println("Disponibles: " + disponibles);
                    System.out.println("No disponibles: " + (total - disponibles));
                    break;

                case 8: // Caso para salir
                    System.out.println("Saliendo del sistema...");
                    break;

                default: // Opción inválida
                    System.out.println("❌ Opción inválida");
            }

        } while (opcion != 8); // Continuar hasta que se elija salir

        // Cerrar el Scanner
        sc.close();
    }
}
