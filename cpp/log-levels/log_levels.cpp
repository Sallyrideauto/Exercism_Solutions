#include <string>

namespace log_line {
    std::string message(std::string line) {
        size_t content_start = line.find(" ");
        std::string content = line.substr(content_start + 1); // Skip the space
        return content;
    }

    std::string log_level(std::string line) {
        size_t closed_index = line.find("]");
        std::string closing = line.substr(1, closed_index - 1); // Skip the '['
        return closing;
    }

    std::string reformat(std::string line) {
        std::string rearranged = message(line) + " (" + log_level(line) + ")";
        return rearranged;
    }
}