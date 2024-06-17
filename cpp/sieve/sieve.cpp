#include "sieve.h"

namespace sieve
{
    std::vector<int> primes(int limit)
    {
        std::vector<bool> is_prime(limit + 1, true);
        std::vector<int> primes;
        for (int p = 2; p * p <= limit; p++)
        {
            if (is_prime[p])
            {
                for (int i = p * p; i <= limit; i += p)
                {
                    is_prime[i] = false;
                }
            }
        }

        for (int p = 2; p <= limit; p++)
        {
            if (is_prime[p])
            {
                primes.push_back(p);
            }
        }

        return primes;
    }
} // namespace sieve
