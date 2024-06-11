public class GameMaster {

    // TODO: define a 'describe' method that returns a description of a Character
    public String describe(Character character) {
        return String.format("You're a level %d %s with %d hit points.", character.getLevel(),
                character.getCharacterClass(), character.getHitPoints());
    }

    // TODO: define a 'describe' method that returns a description of a Destination
    public String describe(Destination destination) {
        return String.format("You've arrived at %s, which has %d inhabitants.", destination.getName(),
                destination.getInhabitants());
    }

    // TODO: define a 'describe' method that returns a description of a TravelMethod
    public String describe(TravelMethod travelmethod) {
        String travel = travelmethod == TravelMethod.WALKING ? "by walking" : "on horseback";
        return String.format("You're traveling to your destination %s.", travel);
    }

    // TODO: define a 'describe' method that returns a description of a Character,
    // Destination and TravelMethod
    public String describe(Character character, Destination destination, TravelMethod travelmethod) {
        return String.format("%s %s You've arrived at %s, which has %d inhabitants.",
                describe(character), describe(travelmethod), destination.getName(), destination.getInhabitants());
    }

    // TODO: define a 'describe' method that returns a description of a Character
    // and Destination
    public String describe(Character character, Destination dest) {
        return String.format(
                "%s You're traveling to your destination by walking. You've arrived at %s, which has %d inhabitants.",
                describe(character),
                dest.getName(), dest.getInhabitants());
    }
}
