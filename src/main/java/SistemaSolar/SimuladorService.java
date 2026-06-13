package SistemaSolar;

import SistemaSolar.Planeta.Planeta;

public class SimuladorService {

    public void compararPlanetas(Planeta p1, Planeta p2) {
        System.out.println("\n--- COMPARANDO: " + p1.getNombre() + " VS " + p2.getNombre() + " ---");

        // Comparar tamaño
        if (p1.getTamano() > p2.getTamano()) {
            System.out.println("-> " + p1.getNombre() + " es más grande.");
        } else if (p1.getTamano() < p2.getTamano()) {
            System.out.println("-> " + p2.getNombre() + " es más grande.");
        } else {
            System.out.println("-> Ambos tienen el mismo tamaño.");
        }

        // Comparar distancia al Sol
        if (p1.getDistanciaAlSol() < p2.getDistanciaAlSol()) {
            System.out.println("-> " + p1.getNombre() + " está más cerca del Sol.");
        } else if (p1.getDistanciaAlSol() > p2.getDistanciaAlSol()) {
            System.out.println("-> " + p2.getNombre() + " está más cerca del Sol.");
        } else {
            System.out.println("-> Están a la misma distancia del Sol.");
        }
    }
}