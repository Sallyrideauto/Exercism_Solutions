#include "grains.h"

namespace grains
{
    uint64_t square(int n)
    {
        return static_cast<uint64_t>(1) << (n - 1);
    }

    uint64_t total()
    {
        return (static_cast<uint64_t>(1) << 63) * 2 - 1;
    }
} // namespace grains
