package Kata5;

public interface Command {
    Output execute (Input input);

    interface Input {
        String key(String value);
    }

    interface Output {
        int code();
        String Resul();
    }

    static Output output(int code, String Resul) {
        return new Output() {
            @Override
            public int code() {
                return code;
            }

            @Override
            public String Resul() {
                return Resul;
            }
        };
    }
}
