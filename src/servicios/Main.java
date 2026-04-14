import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import modelo.Camion;
import modelo.MotocicletasDeReparto;
import modelo.Vehiculo;
import modelo.Furgones;


package servicios;


public class Main {
    public static void main(String[] args) {

        int opcion = 0;
        boolean activo = true;

        do {
            mostrarMenu();

            switch (opcion){

                case 1 -> { Camion c1 = new Camion("ABCD12", "Volvo", "FH16", 20000, true, 6);
                    c1.mostrarDetalle();

                }
                default -> System.out.println("Opción no válida");
            }


        } while (activo);


    }

    static void mostrarMenu(){
        System.out.println("=== SISTEMA DE VEHÍCULOS DE REPARTO ===");
        System.out.println("1. Registrar camión");
        System.out.println("2. Registrar furgón");
        System.out.println("3. Registrar moto de reparto");
        System.out.println("4. Mostrar todos los vehículos");
        System.out.println("5. Mostrar vehículos disponibles");
        System.out.println("6. Marcar vehículo como no disponible");
        System.out.println("7. Mostrar reporte general");
        System.out.println("8. Salir");
    }




}
