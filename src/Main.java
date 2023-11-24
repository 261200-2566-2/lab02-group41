// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AirP air = new AirP();
        int aqi = air.aqiinput(scanner);

        air.AQIcalculator(aqi);
        air.setbrand("HEE");
        air.setsn("77777");
        air.setaqi(500);
        air.turn_off();
        air.savepowermode_on();
        air.displaystatus();

        System.out.println(air.getMostPopularBrand());
        
    }
}