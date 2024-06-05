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