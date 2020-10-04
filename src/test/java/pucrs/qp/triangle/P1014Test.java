package pucrs.qp.triangle;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class P1014Test {


    @Test
    public void teste14286(){
     String actual = P1014.Consumption(500, (float) 35.0);
     String expected = "14.286 km/l";
     assertEquals(expected,actual);
    }

    @Test
    public void teste18119(){
        String actual = P1014.Consumption(2254, (float) 124.4);
        String expected = "18.119 km/l";
        assertEquals(expected,actual);
    }

    @Test
    public void teste9802(){
        String actual = P1014.Consumption(4554, (float) 464.6);
        String expected = "9.802 km/l";
        assertEquals(expected,actual);
    }
}

// 500/35.0   14.286 km/l
//2254/124.4   18.119 km/l
//4554/464.6    9.802 km/l