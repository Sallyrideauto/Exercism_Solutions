public class CarsAssemble {

    private static final int PRODUCTION_PER_SPEED_UNIT = 221;

    public double productionRatePerHour(int speed) {
        double faultRate;
        if (speed >= 1 && speed <= 4) {
            faultRate = 0.0; // 고장율 0%
        } else if (speed >= 5 && speed <= 8) {
            faultRate = 0.10; // 고장율 10%
        } else if (speed == 9) {
            faultRate = 0.20; // 고장율 20%
        } else {
            faultRate = 0.23; // 고장율 23%
        }

        double successProduct = speed * PRODUCTION_PER_SPEED_UNIT * (1 - faultRate);
        return successProduct;
    }

    public int workingItemsPerMinute(int speed) {
        double productionRate = productionRatePerHour(speed);
        int realProductPerMin = (int) Math.floor(productionRate / 60); // 소수점 아래 절삭
        return realProductPerMin;
    }
}