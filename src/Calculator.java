public class Calculator {
    double number1;
    double number2;

    public static void sum(double num1 , double num2){
        double s = num1+num2;
        System.out.println(s);
    }
    public static void subtract(double num1 , double num2){
        double s = num1-num2;
        System.out.println(s);
    }
    public static void divide(double num1 , double num2){
        double s = num1/num2;
        System.out.println(s);
    }
    public static void modulus(double num1, double num2){
        double s = num1%num2;
        System.out.println(s);
    }
    public static void sin(double num){
        double s = Math.sin(num);
        System.out.println(s);
    }
    public static void cos(double num){
        double s = Math.cos(num);
        System.out.println(s);
    }
    public static void tan(double num){
        double s = Math.tan(num);
        System.out.println(s);
    }

}
