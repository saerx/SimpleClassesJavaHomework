import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        this.waterBottle = new WaterBottle();
    }

    @Test
    public void volumeStarts100(){
        assertEquals(100, this.waterBottle.getVolume());
    }

    @Test
    public void drinkFunctionReducesBy10(){
        this.waterBottle.drink();
        this.waterBottle.drink();
        assertEquals(80, this.waterBottle.getVolume());
    }

    @Test
    public void emptyDrainsVolume(){
        this.waterBottle.empty();
        assertEquals(0, this.waterBottle.getVolume());
    }

    @Test

    public void fillReturnsTo100(){
        this.waterBottle.empty();
        this.waterBottle.fill();
        assertEquals(100, this.waterBottle.getVolume());
    }
}
