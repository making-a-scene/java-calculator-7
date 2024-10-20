package calculator;

import java.util.regex.Pattern;

public class Application {

    public static void main(String[] args) {
        UI ui = new UI();
        String input = ui.getInput();
        int output = run(input);
        ui.printOutput(output);
    }

    public static int run(String input) {
        if (input.isBlank()) {
            return 0;
        }

        InputString s = new InputString(input);
        s.setPattern();
        s.setTokens();
        return s.calculate();
    }
}