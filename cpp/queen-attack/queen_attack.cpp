#include "queen_attack.h"
#include <cmath>
#include <stdexcept>

namespace queen_attack
{
    chess_board::chess_board(std::pair<int, int> white, std::pair<int, int> black)
        : white_position(white), black_position(black)
    {
        if (white == black)
        {
            throw std::domain_error("Queens cannot be placed on the same position");
        }
        if (white.first < 0 || white.first > 7 || white.second < 0 || white.second > 7 || black.first < 0 || black.first > 7 || black.second < 0 || black.second > 7)
        {
            throw std::domain_error("Queens position must be within the range of 0 to 7 for both axes");
        }
    }

    std::pair<int, int> chess_board::white() const
    {
        return white_position;
    }

    std::pair<int, int> chess_board::black() const
    {
        return black_position;
    }

    bool chess_board::can_attack() const
    {
        if (white_position.first == black_position.first || white_position.second == black_position.second || std::abs(white_position.first - black_position.first) == std::abs(white_position.second - black_position.second))
        {
            return true;
        }
        return false;
    }

} // namespace queen_attack
