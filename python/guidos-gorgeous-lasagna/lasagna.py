# This module defines functions to calculate the baking and preparation times for lasagna.

EXPECTED_BAKE_TIME = 40 # Expected baking time in minutes for the lasagna.

def bake_time_remaining(passed_time):
    """
    Calculate the remaining bake time for the lasagna.

    :param passed_time: int - the time already spent baking in minutes.
    :return: int - the remaining bake time in minutes.
    """
    
    return EXPECTED_BAKE_TIME - passed_time

def preparation_time_in_minutes(number_of_layers):
    """
    Calculate the preparation time based on the number of lasagna layers.

    :param number_of_layers: int - the number of layers in the lasagna.
    :return: int - the total preparation time in minutes, assuming 2 minutes per layer.
    """

    return number_of_layers * 2

def elapsed_time_in_minutes(number_of_layers, elapsed_bake_time):
    """
    Calculate the total elapsed cooking time for lasagna.

    :param number_of_layers: int - the number of layers in the lasagna.
    :param elapsed_bake_time: int - elapsed cooking time in minutes.
    :return: int - total time elapsed in minutes preparing and cooking the lasagna.
    """
    
    layer_minutes = preparation_time_in_minutes(number_of_layers)
    return layer_minutes + elapsed_bake_time