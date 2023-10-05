import java.util.Scanner;
public class WearForTheWeather {

    public static void main(String[] args) {

//        Prompt user to input the weather & the temperature
//        Collect user input
        System.out.println("What is the weather like today?");
        Scanner reader = new Scanner(System.in);
        String weather = reader.nextLine();
        System.out.println("What is the average temperature today in degrees?");
        int temperature = reader.nextInt();

        if (weather.equals("Sunny") && temperature > 20){
            System.out.println("Wear a hat & sunglasses. Don't forget your sunscreen!");
        }
        else if (weather.equals("Cloudy") && temperature < 20){
            System.out.println("Take a light jacket or scarf with you.");
        }
        else if (weather.equals("Rainy") && temperature < 12){
            System.out.println("Wear a waterproof raincoat.");
        }
        else if (weather.equals("Snow") && temperature < 0){
            System.out.println("Wear lots of warm layers & boots.");
        }
    }
}
