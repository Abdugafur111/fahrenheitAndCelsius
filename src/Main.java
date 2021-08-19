public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(celsiusToFahrenheit(221));
        System.out.println(fahrenheitToCelsius(455.4));
    }

    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0/5)*(celsius+32);
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0/9) * (fahrenheit - 32);
        return celsius;
    }
}
