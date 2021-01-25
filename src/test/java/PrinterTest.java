import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(60, 100);
    }

    @Test
    public void printerHasSheets(){
        assertEquals(60, printer.getSheets());
    }

    @Test
    public void canPrint(){
        printer.print(3, 5);
        assertEquals(45, printer.getSheets());
    }

    @Test
    public void wontPrintIfNotEnoughPaper(){
        printer.print(20, 40);
        assertEquals(60, printer.getSheets());
    }

    @Test
    public void hasToner(){
        assertEquals(100, printer.getToner());
    }

    @Test
    public void printingReducesToner(){
        printer.print(3, 5);
        assertEquals(85, printer.getToner());
    }
}
