#pragma once
#include <string>

namespace star_map
{
    enum class System
    {
        BetaHydri,
        Sol,
        EpsilonEridani,
        AlphaCentauri,
        DeltaEridani,
        Omicron2Eridani,
    };
}

namespace heaven
{
    class Vessel
    {
    public:
        std::string name;                // public으로 변경
        int generation;                  // public으로 변경
        star_map::System current_system; // public으로 변경
        int busters;                     // public으로 변경

        Vessel(std::string name, int generation, star_map::System current_system = star_map::System::Sol);
        Vessel replicate(std::string name) const;
        void make_buster();
        bool shoot_buster();
    };

    std::string get_older_bob(const Vessel &a, const Vessel &b);
    bool in_the_same_system(const Vessel &a, const Vessel &b);
}
