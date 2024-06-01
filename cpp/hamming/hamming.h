#if !defined(HAMMING_H)
#define HAMMING_H

#include <string> // string 클래스 사용을 위해 필요

namespace hamming
{
    int compute(const std::string &dna1, const std::string &dna2);
} // namespace hamming

#endif // HAMMING_H