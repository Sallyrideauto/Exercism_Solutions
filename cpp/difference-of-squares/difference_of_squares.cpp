#include "difference_of_squares.h"

namespace difference_of_squares
{
    // 합의 제곱을 계산
    long square_of_sum(int n)
    {
        long sum = n * (n + 1) / 2; // 등차수열의 합 공식
        return sum * sum;
    }

    // 제곱의 합을 계산
    long sum_of_squares(int n)
    {
        return n * (n + 1) * (2 * n + 1) / 6; // 제곱의 합 공식
    }

    // 두 값의 차이를 계산
    long difference(int n)
    {
        return square_of_sum(n) - sum_of_squares(n);
    }
} // namespace difference_of_squares
