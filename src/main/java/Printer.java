public class Printer {

    private int sheets;
    private int toner;

    public Printer(int sheets, int toner){
        this.sheets = sheets;
        this.toner = toner;
    }

    public int getSheets(){
        return this.sheets;
    }

    public int getToner(){
        return this.toner;
    }

    public void print(int pages, int copies){
        int sheetsToPrint = pages * copies;
        if (this.sheets >= sheetsToPrint){
            this.toner -= sheetsToPrint;
            this.sheets -= sheetsToPrint;
        }
    }
}
