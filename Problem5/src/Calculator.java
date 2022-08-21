import java.util.Scanner;

public class Calculator {
    public Calculator() {
        Scanner input = Utilities.getScanner();
        int result = 0;

        Utilities.expression();
        String userInput = Utilities.getString(input);

        String[] tokens = Utilities.getTokens(userInput);

        result = Utilities.getResult(result, tokens);
        Utilities.getPrintln(result, userInput);

    }

}