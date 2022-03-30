public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }
    public int remainingMinutesInOven(int actual){
        int i = expectedMinutesInOven() - actual;
        return i;
    }
    public int preparationTimeInMinutes(int layers){
        return layers*2;
    }
    public int totalTimeInMinutes(int layers, int actual){
        int i = layers * 2;
        return i + actual;
    }
}
