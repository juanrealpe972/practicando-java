import exceptions.CalculadoraExceptions;

public class Calculadora {

    public int dividir (int dividendo, int divisor) throws CalculadoraExceptions {
        if (divisor ==0) throw new CalculadoraExceptions("No se puede dividir por cero.");
        return dividendo / divisor;
    }

}
