import java.util.Scanner;

public class Utilities {
    public static void getPrintln(int result, String input) {
        System.out.println(input + " = " + result);
    }

    public static int getResult(int result, String[] tokens) {
        boolean isFirst = true;

        for (int i = 0; i < tokens.length - 1; i++) {
            int multiply = 1;
            if((i-2) > 0 && tokens[i-2].trim().charAt(0) == '-') multiply = - 1 ;
            switch (tokens[i].trim().charAt(0)) {
                case '*':
                    if(isFirst){
                        result += (Integer.parseInt(tokens[i-1].trim())
                                * Integer.parseInt(tokens[i+1].trim())) * multiply;
                        isFirst = false;
                    }else{
                        result *= Integer.parseInt(tokens[i+1]);
                    }

                    break;
                case '/':
                    if(isFirst){
                        result += (Integer.parseInt(tokens[i-1].trim())
                                / Integer.parseInt(tokens[i+1].trim())) * multiply;
                        isFirst = false;
                    }else{
                        result /= Integer.parseInt(tokens[i+1].trim());
                    }
                    break;
            }
        }

        for (int j = 0; j <= tokens.length - 1 ; j++) {
            int multiply = 1;
            if((j-1) > 0 && tokens[j-1].trim().charAt(0) == '-') multiply = - 1 ;
            boolean pmp = true;
            if((j+1) < tokens.length && (tokens[j+1].trim().charAt(0) == '*'
                    || tokens[j+1].trim().charAt(0) == '/')) pmp = false;
            else if((j-1) > 0 && (tokens[j-1].trim().charAt(0) == '*'
                    || tokens[j-1].trim().charAt(0) == '/')) pmp = false;
            if(pmp && tokens[j].charAt(0) != '+' && tokens[j].charAt(0) != '-'
                    && (tokens[j].charAt(0) != '*' && tokens[j].charAt(0) != '/')){
                result += Integer.parseInt(tokens[j].trim()) * multiply;
            }
        }
        return result;
    }

    public static String[] getTokens(String userInput) {
        //String[] tokens = userInput.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");
        String[] tokens = userInput.split("(?<=[-+*/(),])(?=.)|(?<=.)(?=[-+*/(),])");
        return tokens;
    }

    public static String getString(Scanner input) {
        return input.nextLine();
    }

    public static Scanner getScanner() {
        return new Scanner(System.in);
    }

    public static void expression() {
        System.out.print("Please enter an expression to calculate: ");
    }

}
