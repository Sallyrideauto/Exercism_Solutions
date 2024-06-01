#include "hamming.h"
#include <stdexcept> // std::domain_error 사용을 위해 필요(예외 처리)

namespace hamming
{
    int compute(const std::string &dna1, const std::string &dna2)
    {
        if (dna1.size() != dna2.size())
        {
            throw std::domain_error("Strings must be of equal length.");
        }

        int distance = 0;
        for (size_t i = 0; i < dna1.size(); ++i)
        {
            if (dna1[i] != dna2[i])
            {
                distance += 1;
            }
        }

        return distance;
    }
} // namespace hamming
