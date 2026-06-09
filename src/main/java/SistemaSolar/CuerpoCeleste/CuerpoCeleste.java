package SistemaSolar.CuerpoCeleste;

import SistemaSolar.Planeta.Planeta;

    public abstract class CuerpoCeleste implements Planeta {
    private final String nombre;
    private final double tamano;
    private final double distanciaAlSol;
    private final int numeroLunas;


        public CuerpoCeleste(String nombre, double tamano, double distanciaAlSol, int numeroLunas) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.distanciaAlSol = distanciaAlSol;
        this.numeroLunas = numeroLunas;
        }

        @Override
        public String getNombre() {
            return this.nombre;
        }

        @Override
        public double getTamano() {
            return this.tamano;
        }

        @Override
        public double getDistanciaAlSol() {
            return this.distanciaAlSol;
        }

        @Override
        public int getNumeroLunas() {
            return this.numeroLunas;
        }


        @Override
        public double calcularAno() {
            // Conversión de la distancia de millones de km a Unidades Astronómicas (1 UA ≈ 149.6 millones de km)
            double distanciaEnUA = this.distanciaAlSol / 149.6;

            // Aplicación matemática de la ley: P = sqrt(a^3) en años terrestres
            double periodoEnAnosTerresres = Math.sqrt(Math.pow(distanciaEnUA, 3));

            // Conversión del periodo orbital final a días terrestres (1 año estándar = 365.25 días)
            return periodoEnAnosTerresres * 365.25;
        }
    }

