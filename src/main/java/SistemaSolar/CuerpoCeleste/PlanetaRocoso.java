package SistemaSolar.CuerpoCeleste;

public class PlanetaRocoso extends CuerpoCeleste {

    private String composicionCorteza;

    public PlanetaRocoso(String nombre, double tamano, double distanciaAlSol,
                         int numeroLunas, String composicionCorteza) {

        super(nombre, tamano, distanciaAlSol, numeroLunas);

        if (tamano <= 0 || distanciaAlSol <= 0 || numeroLunas < 0) {
            throw new IllegalArgumentException("Los valores numéricos no pueden ser inválidos.");
        }

        if (composicionCorteza == null || composicionCorteza.trim().isEmpty()) {
            throw new IllegalArgumentException("La composición de la corteza no puede estar vacía.");
        }

        this.composicionCorteza = composicionCorteza;
    }

    @Override
    public String getTipo() {
        return "Rocoso";
    }

    public String getComposicionCorteza() {
        return composicionCorteza;
    }

    public void setComposicionCorteza(String composicionCorteza) {
        this.composicionCorteza = composicionCorteza;
    }
}
