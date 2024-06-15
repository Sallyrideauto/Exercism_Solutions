#include "nth_prime.h"
#include <stdexcept>

namespace nth_prime
{

    bool is_prime(int num)
    {
        if (num <= 1)
            return false;
        if (num <= 3)
            return true;
        if (num % 2 == 0 || num % 3 == 0)
            return false;
        for (int i = 5; i * i <= num; i += 6)
        {
            if (num % i == 0 || num % (i + 2) == 0)
                return false;
        }
        return true;
    }

    int nth(int n)
    {
        if (n < 1)
            throw std::domain_error("n must be positive integer");

        int count = 0, num = 2;
        while (true)
        {
            if (is_prime(num))
            {
                count++;
                if (count == n)
                    return num;
            }
            num++;
        }
    }
} // namespace nth_prime
