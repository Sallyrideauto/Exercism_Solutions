EXPECTED_BAKE_TIME = 40

def bake_time_remaining(passed_time):
    """Calculate the remaining bake time.

    :param passed_time: int - the time already spent baking.
    :return: int - the remaining bake time.
    """
    
    return EXPECTED_BAKE_TIME - passed_time

def preparation_time_in_minutes(number_of_layers):
    """Calculate the preparation time.

    :param number_of_layers: int - the number of layers in the lasagna.
    :return: int - the total preparation time.
    """

    return number_of_layers * 2

def elapsed_time_in_minutes(number_of_layers, elapsed_bake_time):
    """Calculate the elapsed cooking time.

    :param number_of_layers: int - the number of layers in the lasagna.
    :param elapsed_bake_time: int - elapsed cooking time.
    :return: int - total time elapsed (in minutes) preparing and cooking.

    This function takes two integers representing the number of lasagna layers and the
    time already spent baking and calculates the total elapsed minutes spent cooking the
    lasagna.
    """
    
    layer_minutes = preparation_time_in_minutes(number_of_layers)
    return layer_minutes + elapsed_bake_time