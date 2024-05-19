#include "pangram.h"
#include <string>
#include <unordered_set>
#include <cctype>

namespace pangram
{
    bool is_pangram(const std::string &sentence)
    {
        std::unordered_set<char> letters;
        for (char ch : sentence)
        {
            if (std::isalpha(ch))
            {
                letters.insert(std::tolower(ch));
            }
        }
        return letters.size() == 26; // 영문 알파벳은 총 26개의 글자로 구성
    }
} // namespace pangram
