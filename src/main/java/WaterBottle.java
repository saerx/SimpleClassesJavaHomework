public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public void drink(){
        int prevVolume = this.volume;
        int newVolume = prevVolume - 10;
        this.volume = newVolume;
    }

    public void empty(){
        this.volume = 0;
    }

    public void fill(){
        this.volume = 100;
    }
}
