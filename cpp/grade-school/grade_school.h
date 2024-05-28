#if !defined(GRADE_SCHOOL_H)
#define GRADE_SCHOOL_H

#include <string>
#include <vector>
#include <map>

namespace grade_school
{
    class school
    {
    public:
        void add(const std::string &name, int grade);           // 학생 추가
        std::vector<std::string> grade(int grade) const;        // 특정 학년의 학생 목록 반환
        std::map<int, std::vector<std::string>> roster() const; // 전체 목록 반환
    private:
        std::map<int, std::vector<std::string>> students_; // 내부 저장소: 학년과 학생 목록
    };
} // namespace grade_school

#endif // GRADE_SCHOOL_H