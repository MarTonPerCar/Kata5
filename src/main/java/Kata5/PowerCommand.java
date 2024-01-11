package Kata5;

import static java.lang.Integer.parseInt;

public class PowerCommand implements Command{
    @Override
    public Output execute(Input input) {
        try {
            return power(input.key("value"), input.key("number"));
        } catch (NumberFormatException e) {
            return Command.output(400, "Algun valor proporcionado no es valido");
        }
    }

    private Output power(String value, String number) {
        try {
            int v = parseInt(value);
            int n = parseInt(number);
            return powerOperation(v, n);
        } catch (NumberFormatException e) {
            return Command.output(400, "Algun valor proporcionado no es valido");
        }
    }

    private Output powerOperation(int v, int n) {
        if (v > 10 || n > 1000 || v < -10 || n < -1000) {
            return Command.output(400, "Algun valor proporcionado es demasiado grande o pequeño para hacer los calculos (Limites: Valor: -1000-1000| Potencia: -10-10)");
        }
        double power = Math.pow(v, n);
        return Command.output(200, String.valueOf(power));
    }
}
