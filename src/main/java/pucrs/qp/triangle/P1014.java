package pucrs.qp.triangle;

import java.io.IOException;

public class P1014 {

        public static String Consumption(int distance, float fuel){

            float Consumption = distance/fuel;

            return String.format("%.3f km/l", Consumption).replace(",",".");
    }

}
