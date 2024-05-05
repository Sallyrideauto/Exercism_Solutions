#include <string>
#include <vector>

namespace election
{

    // The election result struct is already created for you:

    struct ElectionResult
    {
        // Name of the candidate
        std::string name{};
        // Number of votes the candidate has
        int votes{};
    };

    // TODO: Task 1
    // vote_count takes a reference to an `ElectionResult` as an argument and will
    // return the number of votes in the `ElectionResult.

    int vote_count(ElectionResult &elect)
    {
        return elect.votes;
    }

    // TODO: Task 2
    // increment_vote_count takes a reference to an `ElectionResult` as an argument
    // and a number of votes (int), and will increment the `ElectionResult` by that
    // number of votes.

    void increment_vote_count(ElectionResult &elect, int votes)
    {
        elect.votes += votes;
    }

    // TODO: Task 3
    // determine_result receives the reference to a final_count and returns a
    // reference to the `ElectionResult` of the new president. It also changes the
    // name of the winner by prefixing it with "President". The final count is given
    // in the form of a `reference` to `std::vector<ElectionResult>`, a vector with
    // `ElectionResults` of all the participating candidates.

    ElectionResult &determine_result(std::vector<ElectionResult> &final_count)
    {
        int max_votes = 0;
        size_t index = 0; // 배열 인덱싱을 할 경우 음수가 발생하지 않도록 size_t로 선언

        for (size_t i = 0; i < final_count.size(); i++)
        {
            int current_votes = final_count[i].votes; // final_count[i].votes를 변수로 저장하여 중복 연산 최소화
            if (current_votes > max_votes)
            {
                max_votes = current_votes;
                index = i;
            }
        }

        final_count[index].name = "President " + final_count[index].name;
        return final_count[index];
    }

} // namespace election