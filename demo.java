public class demo {
    public static void main(String[] args) {
        // Coefficients of the polynomial (from highest to lowest degree)
        double[] coefficients = {1, -3, 2}; // Example: x^2 - 3x + 2

        // Create a PolynomialFunction from the coefficients
        PolynomialFunction polynomial = new PolynomialFunction(coefficients);

        // Use LaguerreSolver to find the roots
        Polynomialsolver solver = new LaguerreSolver();
        double[] roots = solver.solveAllComplex(polynomial, 0.0);

        System.out.println("Roots of the polynomial: " + java.util.Arrays.toString(roots));
    }
}