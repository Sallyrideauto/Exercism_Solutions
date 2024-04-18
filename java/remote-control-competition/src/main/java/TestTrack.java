import java.util.List;
import java.util.stream.Collectors;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> unsortedCars) {
        return unsortedCars.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
