import java.util.Scanner;
public class SCT_SD_1{
    public static float Celsius_to_fahrenheit(Float Temperature){
        return Temperature * (9.0f/5)+32; 
    }
    public static double Celsius_to_Kelvin(Float Temperature){
        return Temperature + 273.15;
    }
    public static float Fahrenheit_to_Celsius(Float Temperature){
        return (Temperature- 32) *(5.0f/9);
    }
    public static double Fahrenheit_to_Kelvin(Float Temperature){
        return (Temperature- 32) *(5.0f/9) + (273.15);
    }
    public static double Kelvin_to_Celsius(Float Temperature){
        return Temperature - 273.15;
    }
    public static double Kelvin_to_Fahrenheit(Float Temperature){
        return (Temperature- 273.15) *(9.0f/5) +32;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Temperature conversion");
        System.out.println("1. Calsius to Fahrenheit");
        System.out.println("2. Celsius to Kelvin");
        System.out.println("3. Fahrenheit to Celcius");
        System.out.println("4. Fahrenhiet to Kelvin");
        System.out.println("5. Kelvin to celcius");
        System.out.println("6. Kelvin to Fahrenhiet");
        System.out.println("Enter you choice: ");
        int choice = sc.nextInt();
        if (choice <1 || choice>6){
            System.out.println("Please enter valid choice!");
        }
        else {
            System.out.print("Enter the Temperature: ");
        Float Temperature= sc.nextFloat();
        double res = 0.0f;
        switch (choice) {
            case 1:
                res = Celsius_to_fahrenheit(Temperature);
                System.out.println("Fahrenheit: "+ res +"F");
                break;
            case 2:
                res = Celsius_to_Kelvin(Temperature);
                System.out.println("Kelvin: " + res +" K");
                break;
            case 3:
                res = Fahrenheit_to_Celsius(Temperature);
                System.out.println("Celcius: " + res +" C" );
                break;
            case 4:
                res = Fahrenheit_to_Kelvin(Temperature);
                System.out.println("Kelvin: " + res + " K");
                break;
            case 5:
                res = Kelvin_to_Celsius(Temperature);
                System.out.println("Celsius: " + res +" C");
                break;
            case 6:
                res = Kelvin_to_Fahrenheit(Temperature);
                System.out.println("Fahrenheit: " + res + " F");
                break;
        }
    }
        sc.close();
    }
}