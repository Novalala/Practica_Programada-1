package SistemaSolar.PlanetaGaseoso;

import SistemaSolar.CuerpoCeleste.CuerpoCeleste;

public class PlanetaGaseoso extends CuerpoCeleste {

    private boolean tieneAnillos;

    public PlanetaGaseoso(String nombre, double tamano, double distanciaAlSol,
                          int numeroLunas, boolean tieneAnillos) {

        super(nombre, tamano, distanciaAlSol, numeroLunas);

        if (tamano <= 0 || distanciaAlSol <= 0 || numeroLunas < 0) {
            throw new IllegalArgumentException("Los valores numéricos no pueden ser inválidos.");
        }

        this.tieneAnillos = tieneAnillos;
    }

    public boolean isTieneAnillos() {
        return tieneAnillos;
    }

    public void setTieneAnillos(boolean tieneAnillos) {
        this.tieneAnillos = tieneAnillos;
    }
}
