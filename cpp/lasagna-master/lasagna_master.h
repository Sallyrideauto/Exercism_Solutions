#pragma once
#include <vector>
#include <string>
#include <algorithm>

namespace lasagna_master
{

    struct amount
    {
        int noodles;
        double sauce;
    };

    int preparationTime(std::vector<std::string> layers, int time = 2);
    amount quantities(std::vector<std::string> layers);
    std::vector<double> scaleRecipe(std::vector<double> quantities, double num);
    void addSecretIngredient(std::vector<std::string> &myList, const std::vector<std::string> friendsList);
    void addSecretIngredient(std::vector<std::string> &myList, const std::string secretIngredient);

} // namespace lasagna_master
