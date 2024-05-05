#include "lasagna_master.h"

namespace lasagna_master
{
    int preparationTime(std::vector<std::string> layers, int time)
    {
        return layers.size() * time;
    }

    amount quantities(std::vector<std::string> layers)
    {
        amount amnt;
        amnt.noodles = count(layers.begin(), layers.end(), "noodles") * 50;
        amnt.sauce = count(layers.begin(), layers.end(), "sauce") * 0.2;
        return amnt;
    }

    void addSecretIngredient(std::vector<std::string> &myList, const std::vector<std::string> &friendsList)
    {
        myList.back() = friendsList.back();
    }

    // Scales quantities based on the number of portions
    std::vector<double> scaleRecipe(std::vector<double> quantities, double num)
    {
        for (double &i : quantities)
        {
            i *= num / 2;
        }
        return quantities;
    }

    void addSecretIngredient(std::vector<std::string> &myList, const std::string secretIngredient)
    {
        myList.back() = secretIngredient;
    }
} // namespace lasagna_master
