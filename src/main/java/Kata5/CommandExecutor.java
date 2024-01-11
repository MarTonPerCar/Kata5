package Kata5;

import spark.Request;
import spark.Response;

public record CommandExecutor(Request request, Response response) {
    public String execute(Command command) {
        Command.Output output = command.execute(input());
        response.status(output.code());
        return output.Resul();
    }

    private Command.Input input() {
        return new Command.Input() {
            @Override
            public String key(String value) {
                if (request.params(value) == null) {
                    return request.queryParams(value);
                } else {
                    return request.params(value);
                }
            }
        };
    }
}
