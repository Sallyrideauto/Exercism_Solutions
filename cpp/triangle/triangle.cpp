#include "triangle.h"

namespace triangle
{
    flavor kind(double a, double b, double c)
    {
        // 삼각형 성립 조건 검사
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a)
        {
            throw std::domain_error("Not a triangle");
        }

        // 삼각형 유형 판별
        if (a == b && b == c)
        {
            return flavor::equilateral;
        }
        else if (a == b || b == c || a == c)
        {
            return flavor::isosceles;
        }
        else
        {
            return flavor::scalene;
        }
    }
} // namespace triangle
