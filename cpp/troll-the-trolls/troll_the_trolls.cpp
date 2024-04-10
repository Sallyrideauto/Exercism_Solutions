// 열거형(enumeration) 참고 링크
// https://learn.microsoft.com/ko-kr/cpp/cpp/enumerations-cpp?view=msvc-170
// https://www.programiz.com/cpp-programming/enumeration
// https://boycoding.tistory.com/179
// https://en.cppreference.com/w/cpp/language/enum

namespace hellmath
{

    // TODO: Task 1 - Define an `AccountStatus` enumeration to represent the four
    // account types: `troll`, `guest`, `user`, and `mod`.
    enum class AccountStatus
    {
        troll,
        guest,
        user,
        mod
    };

    // TODO: Task 1 - Define an `Action` enumeration to represent the three
    // permission types: `read`, `write`, and `remove`.
    enum class Action
    {
        read,
        write,
        remove
    };

    // TODO: Task 2 - Implement the `display_post` function, that gets two arguments
    // of `AccountStatus` and returns a `bool`. The first argument is the status of
    // the poster, the second one is the status of the viewer.
    // The function should return `true` if the viewer can see the post, and `false`
    // otherwise.
    bool display_post(AccountStatus poster, AccountStatus viewer)
    {
        if (poster == AccountStatus::troll && viewer != AccountStatus::troll)
        {
            return false;
        }
        return true;
    }

    // TODO: Task 3 - Implement the `permission_check` function, that takes an
    // `Action` as a first argument and an `AccountStatus` to check against. It
    // should return a `bool`.
    bool permission_check(Action action, AccountStatus status)
    {
        if (status == AccountStatus::guest)
        {
            if (action == Action::read)
            {
                return true;
            }
            return false;
        }
        if (status == AccountStatus::user || status == AccountStatus::troll)
        {
            if (action == Action::read || action == Action::write)
            {
                return true;
            }
            return false;
        }
        if (status == AccountStatus::mod)
        {
            return true;
        }
        return false;
    }

    // TODO: Task 4 - Implement the `valid_player_combination` function that
    // checks if two players can join the same game. The function has two parameters
    // of type `AccountStatus` and returns a `bool`.
    bool valid_player_combination(AccountStatus player1, AccountStatus player2)
    {
        if (player1 == AccountStatus::troll && player2 != AccountStatus::troll)
        {
            return false;
        }
        else if (player1 != AccountStatus::troll && player2 == AccountStatus::troll)
        {
            return false;
        }
        else if (player1 == AccountStatus::guest || player2 == AccountStatus::guest)
        {
            return false;
        }
        return true;
    }

    // TODO: Task 5 - Implement the `has_priority` function that takes two
    // `AccountStatus` arguments and returns `true`, if and only if the first
    // account has a strictly higher priority than the second.
    bool has_priority(AccountStatus status1, AccountStatus status2)
    {
        return status1 > status2;
    }

} // namespace hellmath