package SistemaSolar;

import SistemaSolar.CuerpoCeleste.PlanetaGaseoso;
import SistemaSolar.CuerpoCeleste.PlanetaRocoso;
import SistemaSolar.Planeta.Planeta;

import java.util.ArrayList;
import java.util.List;

public class SistemaSolar {

    public static void main(String[] args) {
        List<Planeta> planetas = new ArrayList<>();
        SimuladorService simulador = new SimuladorService();

        try {
            planetas.add(new PlanetaRocoso("Tierra", 12742, 149.6, 1, "Silicatos"));
            planetas.add(new PlanetaGaseoso("Júpiter", 139820, 778.5, 95, true));

            System.out.println("=== LISTADO DE PLANETAS REGISTRADOS ===");
            for (Planeta p : planetas) {
                System.out.printf("Planeta: %-8s | Tipo: %-8s | Año: %7.2f días | Lunas: %d\n",
                        p.getNombre(), p.getTipo(), p.calcularAno(), p.getNumeroLunas());
            }

            if (planetas.size() >= 2) {
                simulador.compararPlanetas(planetas.get(0), planetas.get(1)); // Tierra vs Júpiter
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}