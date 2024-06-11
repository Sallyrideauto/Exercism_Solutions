#include "collatz_conjecture.h"
#include <stdexcept> // 예외 처리를 위해 필요

namespace collatz_conjecture
{
    int steps(int n)
    {
        if (n <= 0)
        {
            throw std::domain_error("Input must be a positive integer."); // 양의 정수가 아니면 예외 발생
        }

        int count = 0; // 단계 수를 세기 위한 변수
        while (n != 1)
        {
            if (n % 2 == 0)
            {
                n /= 2; // n이 짝수일 때
            }
            else
            {
                n = 3 * n + 1; // n이 홀수일 때
            }
            count++; // 단계 수 증가
        }
        return count; // 총 단계 수 반환
    }
} // namespace collatz_conjecture
