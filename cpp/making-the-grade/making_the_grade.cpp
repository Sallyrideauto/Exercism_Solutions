#include <array>
#include <string>
#include <vector>
#include <algorithm>

// Round down all provided student scores.
std::vector<int> round_down_scores(std::vector<double> student_scores)
{
    // TODO: Implement round_down_scores
    std::vector<int> rounded_scores;
    std::transform(student_scores.begin(), student_scores.end(), std::back_inserter(rounded_scores), [](double score)
                   { return static_cast<int>(score); });
    return rounded_scores;
}

// Count the number of failing students out of the group provided.
int count_failed_students(std::vector<int> student_scores)
{
    // TODO: Implement count_failed_students
    return std::count_if(student_scores.begin(), student_scores.end(), [](int score)
                         { return score <= 40; });
}

// Determine how many of the provided student scores were 'the best' based on the provided threshold.
std::vector<int> above_threshold(std::vector<int> student_scores, int threshold)
{
    // TODO: Implement above_threshold
    std::vector<int> best_scores;
    std::copy_if(student_scores.begin(), student_scores.end(), std::back_inserter(best_scores), [threshold](int score)
                 { return score >= threshold; });
    return best_scores;
}

// Create a list of grade thresholds based on the provided highest grade.
std::array<int, 4> letter_grades(int highest_score)
{
    // TODO: Implement letter_grades
    static const int FAILING_SCORE = 40;
    int grade_increment = (highest_score - FAILING_SCORE) / 4;
    std::array<int, 4> letter_scores;
    for (int i = 0; i < letter_scores.size(); ++i)
    {
        letter_scores[i] = ((FAILING_SCORE + grade_increment * i) + 1);
    }
    return letter_scores;
}

// Organize the student's rank, name, and grade information in ascending order.
std::vector<std::string> student_ranking(std::vector<int> student_scores, std::vector<std::string> student_names)
{
    // TODO: Implement student_ranking
    std::vector<std::string> formatted_scores;
    int rank = 1;
    std::transform(student_scores.begin(), student_scores.end(), student_names.begin(), std::back_inserter(formatted_scores), [&rank](int score, const std::string &name)
                   { return std::to_string(rank++) + ". " + name + " - " + std::to_string(score); });
    return formatted_scores;
}

// Create a string that contains the name of the first student to make a perfect score on the exam.
std::string perfect_score(std::vector<int> student_scores, std::vector<std::string> student_names)
{
    // TODO: Implement perfect_score
    std::string first_perfect_score_name;
    int i = 0;
    for (auto itr = student_scores.begin(); itr != student_scores.end(); ++itr, ++i)
    {
        if (*itr == 100)
        {
            return student_names.at(i);
        }
    }
    return "";
}
