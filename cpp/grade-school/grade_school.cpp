#include "grade_school.h"
#include <algorithm>

namespace grade_school
{

    void school::add(const std::string &name, int grade)
    {
        // 학생 이름이 해당 학년의 리스트에 없으면 추가
        if (std::find(students_[grade].begin(), students_[grade].end(), name) == students_[grade].end())
        {
            students_[grade].push_back(name);
            // 학생 이름을 사전순으로 정렬
            std::sort(students_[grade].begin(), students_[grade].end());
        }
    }

    std::vector<std::string> school::grade(int grade) const
    {
        // 해당 학년의 학생 목록 반환, 학년이 없으면 빈 벡터 반환
        auto it = students_.find(grade);
        if (it != students_.end())
        {
            return it->second;
        }
        return {};
    }

    std::map<int, std::vector<std::string>> school::roster() const
    {
        // 전체 등록부를 반환
        return students_;
    }

} // namespace grade_school
