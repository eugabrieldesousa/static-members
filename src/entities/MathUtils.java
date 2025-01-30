package entities;

public class MathUtils {

    // Constante estática para o número de Euler
    public static final double EULER_NUMBER = 2.71828;

    /**
     * Calcula a potência de um número.
     * @param base A base da potência.
     * @param expoente O expoente (pode ser negativo).
     * @return O resultado da potência.
     */
    public static double powUtil(double base, int expoente) {
        if (expoente == 0) {
            return 1; // Qualquer número elevado a 0 é 1
        }

        double resultado = 1;
        for (int i = 0; i < Math.abs(expoente); i++) {
            resultado *= base;
        }

        // Se o expoente for negativo, retorna o inverso
        return expoente < 0 ? 1 / resultado : resultado;
    }
}