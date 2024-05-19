class NeedForSpeed {
    // 모든 필드를 private으로 변경하여 캡슐화를 강화
    private int battery = 100;
    private int batteryDrain;
    private int speed;
    private int distance;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    // 배터리가 방전되었는지 확인하는 메소드 
    public boolean batteryDrained() {
        return battery <= 0;
    }

    // 주행 거리를 반환하는 메소드
    public int distanceDriven() {
        return distance;
    }

    // 주행 메소드, 배터리가 방전되지 않았을 때만 주행
    public void drive() {
        if (!batteryDrained()) {
            this.distance += this.speed;
            this.battery -= this.batteryDrain;
        }
    }

    // 니트로 버전의 자동차 생성
    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    // 외부에서 접근 가능한 필드의 값을 안전하게 가져오는 메소드 추가
    public int getBattery() {
        return battery;
    }

    public int getBatteryDrain() {
        return batteryDrain;
    }

    public int getSpeed() {
        return speed;
    }
}

class RaceTrack {
    private int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    // 주어진 자동차로 트랙을 완주할 수 있는지 시도하는 메소드
    public boolean tryFinishTrack(NeedForSpeed car) {
        int distanceCanDrive = 0;
        int battery = car.getBattery();
        while (battery > 0 && distanceCanDrive < this.distance) {
            distanceCanDrive += car.getSpeed();
            battery -= car.getBatteryDrain();
        }
        return distanceCanDrive >= this.distance;
    }
}
