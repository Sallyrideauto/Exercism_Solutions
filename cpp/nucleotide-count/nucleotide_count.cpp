#include "nucleotide_count.h"

namespace nucleotide_count
{
    counts count(const std::string &dna)
    {
        counts total;
        total['A'] = total['C'] = total['G'] = total['T'] = 0;
        for (char c : dna)
        {
            if (c != 'A' && c != 'C' && c != 'G' && c != 'T')
                throw std::invalid_argument("bad DNA base");
            total[c] += 1;
        }
        return total;
    }
} // namespace nucleotide_count

#if !defined(NUCLEOTIDE_COUNT_H)
#define NUCLEOTIDE_COUNT_H
#include <map>
#include <stdexcept>
#include <string>

namespace nucleotide_count
{
    using counts = std::map<char, int>;
    counts count(const std::string &dna);
} // namespace nucleotide_count

#endif // NUCLEOTIDE_COUNT_H