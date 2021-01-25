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
        int prevSheets = this.sheets;
        int prevToner = this.toner;
        if (this.sheets >= sheetsToPrint){
            this.toner = prevToner - sheetsToPrint;
            this.sheets = prevSheets - sheetsToPrint;
        }
    }
}
