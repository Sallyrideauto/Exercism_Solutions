#include "vehicle_purchase.h"

namespace vehicle_purchase {

    bool needs_license(std::string kind){
        if (kind == "car") {
            return true;
        } else if (kind == "truck") {
            return true;
        } else {
            return false;
        }
    }

    std::string choose_vehicle(std::string option1, std::string option2) {
        if (option1 < option2) {
            std::string best_choice_1 = option1 + " is clearly the better choice.";
            return best_choice_1;
        } else {
            std::string best_choice_2 = option2 + " is clearly the better choice.";
            return best_choice_2;
        }
    }

    double calculate_resell_price(double original_price, double age) {
        if (age < 3) {
            double discount_rate = 0.20;
            double discounted_price = original_price - (original_price * discount_rate);
            return discounted_price;
        } else if (age >= 3 && age < 10) {
            double discount_rate = 0.30;
            double discounted_price = original_price - (original_price * discount_rate);
            return discounted_price;
        } else {
            double discount_rate = 0.50;
            double discounted_price = original_price - (original_price * discount_rate);
            return discounted_price;
        }
    }

}