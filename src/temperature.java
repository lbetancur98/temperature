import java.util.Scanner;

public class temperature {

    private static String nextLine;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String origin;
        String destination;
        double nowTemperature = -1;

        
       
        do {
            System.out.print("Enter an origin scale: ");
            origin = in.nextLine();
            

        } while (!(origin.equals("K")) && !(origin.equals("C")) && !(origin.equals("F")) );
        
        
        
        do {
            System.out.print("Enter a destination scale: ");
            destination = in.nextLine();
           

        } while (!(destination.equals("K")) && !(destination.equals("C")) && !(destination.equals("F") ));

        
        
        System.out.print("Enter a temperature: ");
        double temperature = in.nextDouble() ;
        in.nextLine();

        if(origin.equals("F") && destination.equals("C")){
            nowTemperature = (temperature - 32) * (5/9);
        } else if (origin.equals("C") && destination.equals("F")){
            nowTemperature = (temperature * (9/5)) + 32;
        } else if (origin.equals("F") && destination.equals("K")){
            nowTemperature = ((temperature - 32) * (5/9)) + 273.15;
        } else if (origin.equals("K") && destination.equals("F")){
            nowTemperature = ((temperature-273.15) * (9/5)) + 32;
        } else if (origin.equals("C") && destination.equals("K")){
            nowTemperature = temperature + 273.15;
        } else if(origin.equals("K") && destination.equals("C")){
            nowTemperature = temperature - 273.15;
        }


        
        System.out.printf("%,.1f\u00b0 " + origin + " equals %.1f\u00b0" + destination, temperature, nowTemperature);





    }
}

