package Kata5;

import spark.Request;
import spark.Response;
import spark.Spark;

public class Main {
    public static void main (String[] args) {
        Spark.port(8081);
        Spark.get("/factorial", ((request, response) -> "Potencia de los dos valores de la URL: " +
                new CommandExecutor(request, response).execute(new PowerCommand())));
    }
}
