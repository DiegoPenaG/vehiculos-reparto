import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import modelo.Camion;
import modelo.MotocicletasDeReparto;
import modelo.Vehiculo;
import modelo.Furgones;


package servicios;

import java.util.ArrayList; // Importa interfaz ArrayList
import java.util.List; //Importa interfaz List
import java.util.Scanner; // Importa Scanner para entrada por consola

public class Main { // Clase principal del programa

    public static void main(String[] args) { // Método principal donde inicia el programa

        Scanner sc = new Scanner(System.in); // Scanner para leer datos del usuario

        List<Vehiculo> vehiculos = new ArrayList<>();
        // Lista donde se guardarán todos los vehículos (polimorfismo)

        int opcion; // Variable para controlar el menú

        do {

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

                case 1 -> { Camion c1 = new Camion("ABCD12", "Volvo", "FH16", 20000, true, 6);
                    c1.mostrarDetalle();

                }
                default -> System.out.println("Opción no válida");
            }

            switch (opcion) { // Evalúa la opción seleccionada
                case 1: //Registrar camión
                    System.out.print("Ingrese patente: ");
                    String patenteCamion = sc.nextLine();
                    // 1. Creamos el objeto con los datos capturados
                    System.out.println("Ingrese capacidad de carga (kg): ");
                    double capacidadCamion = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Ingrese marca del vehiculo: ");
                    String marcaCamion = sc.nextLine();

                    System.out.println("Ingrese modelo del vehiculo");
                    String modeloCamion = sc.nextLine();

                    Camion nuevoCamion = new Camion (patenteCamion, capacidadCamion, marcaCamion, modeloCamion);
                    vehiculos.add(nuevoCamion);

                    System.out.println("✔ Camión registrado con éxito");
                    break;

                case 2: //Registrar Furgon
                    System.out.print("Ingrese patente: ");
                    String patenteFurgon = sc.nextLine();// Para ingresa la patente del vehiculo

                    // 1. Creamos el objeto con los datos capturados
                    System.out.println("Ingrese capacidad de carga (kg): ");
                    double capacidadFurgon = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Ingrese marca del vehiculo: ");
                    String marcaFurgon = sc.nextLine();

                    System.out.println("Ingrese modelo del vehiculo");
                    String modeloFurgon = sc.nextLine();

                    Furgon nuevoFurgon = new Furgon (patenteFurgon, capacidadFurgon, marcaFurgon,modeloFurgon);

                    vehiculos.add(nuevoFurgon);

                    System.out.println("✔ Furgon registrado con éxito");
                    break;

                case 3: //Registrar Moto de Reparto
                    System.out.print("Ingrese patente: ");
                    String patenteMotoReparto = sc.nextLine();

                    // 1. Creamos el objeto con los datos capturados

                    System.out.println("Ingrese capacidad de carga (kg): ");
                    double capacidadMoto = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Ingrese marca del vehiculo: ");
                    String marcaMotoReparto = sc.nextLine();

                    System.out.println("Ingrese modelo del vehiculo");
                    String modeloMotoReparto = sc.nextLine();

                    MotoReparto nuevoMotoReparto = new MotoReparto (patenteMotoReparto, capacidadMoto, marcaMotoReparto, modeloMotoReparto);

                    vehiculos.add(nuevoMotoReparto);

                    System.out.println("✔ Moto registrada con éxito");
                    break;

                case 4: // Mostrar todos los vehículos

                    for (Vehiculo v : vehiculos) { // Recorre la lista de vehículos

                        v.mostrarDetalle(); // Llama método polimórfico
                        System.out.println("-------------------");
                    }

                    break;

                case 5: // Mostrar solo vehículos disponibles

                    for (Vehiculo v : vehiculos) { // Recorre lista

                        if (v.isDisponible()) { // Filtra solo disponibles
    case 4: // Mostrar todos los vehículos

            for (Vehiculo v : vehiculos) { // Recorre la lista de vehículos

        v.mostrarDetalle(); // Llama método polimórfico
        System.out.println("-------------------");
    }

                    break;

                case 5: // Mostrar solo vehículos disponibles

                        for (Vehiculo v : vehiculos) { // Recorre lista

        if (v.isDisponible()) { // Filtra solo disponibles

            v.mostrarDetalle(); // Muestra detalle
            System.out.println("-------------------");
        }
    }

                    break;

                case 6: // Marcar vehículo como no disponible

                        System.out.print("Ingrese patente: "); // Pide patente
    String patente = sc.nextLine(); // Lee patente

    boolean encontrado = false; // Control de búsqueda

                    for (Vehiculo v : vehiculos) { // Recorre lista

        if (v.getPatente().equalsIgnoreCase(patente)) {
            // Compara patente ignorando mayúsculas

            v.setDisponible(false); // Cambia estado a no disponible
            System.out.println("✔ Vehículo marcado como no disponible"); // Mensaje éxito

            encontrado = true; // Marca como encontrado
            break; // Sale del ciclo
        }
    }

                    if (!encontrado) { // Si no se encontró

        System.out.println("❌ Vehículo no encontrado"); // Mensaje error
    }

                    break;

                case 7: // REPORTE GENERAL (TU PARTE MÁS IMPORTANTE)

    int total = vehiculos.size(); // Total de vehículos
    int camiones = 0; // Contador camiones
    int furgones = 0; // Contador furgones
    int motos = 0; // Contador motos
    int disponibles = 0; // Contador disponibles

                    for (Vehiculo v : vehiculos) { // Recorre lista completa

        if (v instanceof Camion) camiones++;     // Verifica si es Camion

        if (v instanceof Furgon) furgones++;     // Verifica si es Furgon

        if (v instanceof MotoReparto) motos++;   // Verifica si es MotoReparto

        if (v.isDisponible()) disponibles++;    // Cuenta disponibles
    }

                    System.out.println("===== REPORTE GENERAL =====");
                    System.out.println("Total vehículos: " + total);
                    System.out.println("Camiones: " + camiones);
                    System.out.println("Furgones: " + furgones);
                    System.out.println("Motos: " + motos);
                    System.out.println("Disponibles: " + disponibles);
                    System.out.println("No disponibles: " + (total - disponibles));

                    break;

                case 8: // Salir del sistema

                        System.out.println("Saliendo del sistema..."); // Mensaje salida
                    break;

    default: // Opción inválida

            System.out.println("❌ Opción inválida"); // Mensaje error
}

        } while (opcion != 8); // Repite mientras no sea opción 8

        sc.close();
    }
            }

                            v.mostrarDetalle(); // Muestra detalle
                            System.out.println("-------------------");
                        }
                    }

                    break;

                case 6: // Marcar vehículo como no disponible

                    System.out.print("Ingrese patente: "); // Pide patente
                    String patente = sc.nextLine(); // Lee patente

                    boolean encontrado = false; // Control de búsqueda

                    for (Vehiculo v : vehiculos) { // Recorre lista

                        if (v.getPatente().equalsIgnoreCase(patente)) {
                            // Compara patente ignorando mayúsculas

                            v.setDisponible(false); // Cambia estado a no disponible
                            System.out.println("✔ Vehículo marcado como no disponible"); // Mensaje éxito

                            encontrado = true; // Marca como encontrado
                            break; // Sale del ciclo
                        }
                    }

                    if (!encontrado) { // Si no se encontró

                        System.out.println("❌ Vehículo no encontrado"); // Mensaje error
                    }

                    break;

                case 7: // REPORTE GENERAL (TU PARTE MÁS IMPORTANTE)

                    int total = vehiculos.size(); // Total de vehículos
                    int camiones = 0; // Contador camiones
                    int furgones = 0; // Contador furgones
                    int motos = 0; // Contador motos
                    int disponibles = 0; // Contador disponibles

                    for (Vehiculo v : vehiculos) { // Recorre lista completa

                        if (v instanceof Camion) camiones++;     // Verifica si es Camion

                        if (v instanceof Furgon) furgones++;     // Verifica si es Furgon

                        if (v instanceof MotoReparto) motos++;   // Verifica si es MotoReparto

                        if (v.isDisponible()) disponibles++;    // Cuenta disponibles
                    }

                    System.out.println("===== REPORTE GENERAL =====");
                    System.out.println("Total vehículos: " + total);
                    System.out.println("Camiones: " + camiones);
                    System.out.println("Furgones: " + furgones);
                    System.out.println("Motos: " + motos);
                    System.out.println("Disponibles: " + disponibles);
                    System.out.println("No disponibles: " + (total - disponibles));

                    break;

                case 8: // Salir del sistema

                    System.out.println("Saliendo del sistema..."); // Mensaje salida
                    break;

                default: // Opción inválida

                    System.out.println("❌ Opción inválida"); // Mensaje error
            }

        } while (opcion != 8); // Repite mientras no sea opción 8

        sc.close();
    }
}
