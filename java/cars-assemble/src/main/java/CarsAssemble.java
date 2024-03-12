public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        if (speed >= 1 && speed <= 4) {
            double success_product = speed * 221;
            return success_product;
        } else if (speed >= 5 && speed <= 8) {
            double fault_rate = 0.10;
            double success_product = speed * 221;
            double real_success_product = success_product - (success_product * fault_rate);
            return real_success_product;
        } else if (speed == 9) {
            double fault_rate = 0.20;
            double success_product = speed * 221;
            double real_success_product = success_product - (success_product * fault_rate);
            return real_success_product;            
        } else {
            double fault_rate = 0.23;
            double success_product = speed * 221;
            double real_success_product = success_product - (success_product * fault_rate);
            return real_success_product;            
        }
    }

    public int workingItemsPerMinute(int speed) {
        // https://www.w3schools.com/java/java_type_casting.asp
        int productionRatePerHour = (int) productionRatePerHour(speed);
        int real_product_per_min = productionRatePerHour / 60;
        return real_product_per_min;
    }
}
