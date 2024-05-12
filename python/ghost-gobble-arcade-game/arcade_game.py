# This module implements the game logic for the "Ghost Gobble Arcade Game."
# It includes functions such as eating ghosts, scoring, determining game loss, and checking win conditions.

def eat_ghost(power_pellet_active, touching_ghost):
    """Eat ghost function: If the player is touching a ghost while the power pellet is active, the ghost is eaten."""
    return power_pellet_active and touching_ghost

def score(touching_power_pellet, touching_dot):
    """Scoring function: The player earns points by touching either power pellets or dots."""
    return touching_power_pellet or touching_dot

def lose(power_pellet_active, touching_ghost):
    """Loss determination function: The player loses if they touch a ghost without an active power pellet."""
    return not power_pellet_active and touching_ghost

def win(has_eaten_all_dots, power_pellet_active, touching_ghost):
    """Win determination function: The player wins if all dots are eaten and the loss condition is not met."""
    return has_eaten_all_dots and not lose(power_pellet_active, touching_ghost)
