import java.util.Scanner;

public class Calculator {
    public static void main(String[] arg) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a mathematical expression (ex. 1+2 , -200-100 , 2*5.5 , 10/2): ") ;

        String mathExpression = scan.nextLine() ;

        int operatorNumber = 0 ;
        boolean operatorNumberCondition = true ;
        boolean calculateResult = true ;

        String s = "" ;
        String s1 = "" ;
        String s3 = "" ;

        boolean plus ;
        if (mathExpression.contains("+")) plus = true ;
        else plus = false ;

        boolean minus ;
        if (mathExpression.contains("-")) minus = true ;
        else minus = false ;

        boolean multiplication ;
        if (mathExpression.contains("*")) multiplication = true ;
        else multiplication = false ;

        boolean division ;
        if (mathExpression.contains("/")) division = true ;
        else division = false ;

        if (mathExpression == "") {
            System.out.println("ERROR! You didn't enter any expression!") ;
            calculateResult = false ;
        } else if (!plus && !minus && !multiplication && !division) {
            System.out.println("ERROR! You did not enter a mathematical expression") ;
            calculateResult = false ;
        }

        for (int i = 0; i <= mathExpression.length() - 1; i++) {
            if (mathExpression.charAt(0) == '+' || mathExpression.charAt(0) == '-' ){
                break ;
            }
            if (mathExpression.charAt(i) == '+' || mathExpression.charAt(i) == '-' ||
                    mathExpression.charAt(i) == '*' || mathExpression.charAt(i) == '/') {
                operatorNumber++ ;
            }
            if (operatorNumber > 1) {
                System.out.println("ERROR! You entered more than one operator!");
                calculateResult = false ;
                break ;
            }
        }

        for (int j = mathExpression.length() - 1; j >= 0  ; j--) {
            if (mathExpression.charAt(j) == '+' || mathExpression.charAt(j) == '-' ||
                mathExpression.charAt(j) == '*' || mathExpression.charAt(j) == '/') {

                s = mathExpression.substring(0, j) ;
                s1 = mathExpression.substring(j + 1) ;


                if (s == "" || s1 == "") {
                    System.out.println("Not enough operads") ;
                    operatorNumberCondition = false ;
                    calculateResult = false ;
                     break ;
                }
                break ;
            }
        }


        if (operatorNumberCondition) {
            for (int k = 0; k <= mathExpression.length() - 1; k++) {
                if (mathExpression.charAt(k) == '/') {

                    s3 = mathExpression.substring(k + 1) ;

                    int s4 = Integer.parseInt(s3) ;

                    if (s4 == 0) {
                        System.out.println("ERROR! Can not be divided by 0") ;
                        calculateResult = false ;
                        break ;
                    }
                }

            }
        }

        if (calculateResult == true){
            double result = 0 ;
            if (plus){
                result = Double.parseDouble(s) + Double.parseDouble(s1) ;
            }if (minus){
                     result = Double.parseDouble(s) - Double.parseDouble(s1) ;
            }if (multiplication){
                     result = Double.parseDouble(s) * Double.parseDouble(s1) ;
            }if (division){
                     result = Double.parseDouble(s) / Double.parseDouble(s1) ;
            }
                 System.out.println (result) ;
        }
    }

}
