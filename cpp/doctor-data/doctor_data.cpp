#include "doctor_data.h"

namespace heaven
{
    // 생성자: 이름, 세대, 시스템 초기화
    Vessel::Vessel(std::string name, int generation, star_map::System current_system)
        : name{std::move(name)}, generation{generation}, current_system{current_system}, busters{0} {}

    // 복제 메서드: 새로운 이름과 세대 증가로 새로운 Vessel 생성
    Vessel Vessel::replicate(std::string name) const
    {
        return Vessel{std::move(name), this->generation + 1, this->current_system};
    }

    // 버스터 생성 메서드: 버스터 수 증가
    void Vessel::make_buster()
    {
        ++busters;
    }

    // 버스터 발사 메서드: 버스터가 있을 경우 하나 감소시키고 true 반환
    bool Vessel::shoot_buster()
    {
        if (busters > 0)
        {
            --busters;
            return true;
        }
        return false;
    }

    // 더 오래된 세대의 이름을 반환하는 함수
    std::string get_older_bob(const Vessel &a, const Vessel &b)
    {
        return a.generation < b.generation ? a.name : b.name;
    }

    // 두 Vessel이 같은 시스템에 있는지 확인하는 함수
    bool in_the_same_system(const Vessel &a, const Vessel &b)
    {
        return a.current_system == b.current_system;
    }
}
