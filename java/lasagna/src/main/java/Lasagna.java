public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int spendedTime) {
        int ovenTime = expectedMinutesInOven();
        return ovenTime - spendedTime;
    }

    public int preparationTimeInMinutes(int layers) {
        return 2 * layers;
    }

    public int totalTimeInMinutes(int layers, int mininOven) {
        int timesofLayers = preparationTimeInMinutes(layers);
        return timesofLayers + mininOven;
    }
}
