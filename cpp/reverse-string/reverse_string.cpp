#include "reverse_string.h"

namespace reverse_string
{
    std::string reverse_string(std::string line)
    {
        char *reversed = new char[line.length() + 1];
        int c = 0;
        for (int i = line.length() - 1; i >= 0; i--)
        {
            reversed[c++] = line[i];
        }

        reversed[c] = '\0';
        std::string cc = reversed;
        return cc;
    }
} // namespace reverse_string
