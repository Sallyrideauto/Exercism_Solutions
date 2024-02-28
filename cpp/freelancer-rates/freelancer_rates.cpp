#include <cmath>

// daily_rate calculates the daily rate given an hourly rate
double daily_rate(double hourly_rate) {
    return hourly_rate * 8;
}

// apply_discount calculates the price after a discount
double apply_discount(double before_discount, double discount) {
    // 할인율을 퍼센트에서 실수로 변환
    double discount_rate = discount / 100.0;
    // 할인된 가격 계산
    double discounted_price = before_discount - (before_discount * discount_rate);
    return discounted_price;
}

// monthly_rate calculates the monthly rate, given an hourly rate and a discount
// The returned monthly rate is rounded up to the nearest integer.
int monthly_rate(double hourly_rate, double discount) {
    double monthly_before = daily_rate(hourly_rate) * 22;
    double monthly_after = apply_discount(monthly_before, discount);
    return ceil(monthly_after); // 반올림하여 정수 반환
}

// days_in_budget calculates the number of workdays given a budget, hourly rate,
// and discount The returned number of days is rounded down (take the floor) to
// the next integer.
int days_in_budget(int budget, double hourly_rate, double discount) {
    double daily_rate_after_discount = apply_discount(hourly_rate * 8, discount);
    int days = floor(budget / daily_rate_after_discount);
    return days;
}