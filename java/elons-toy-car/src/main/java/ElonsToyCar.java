// 클래스 학습 자료
// https://devuna.tistory.com/4
// https://wikidocs.net/214

public class ElonsToyCar {
    private int distanceDriven = 0; // 차량이 주행한 거리를 미터 단위로 저장, 초기값은 0
    private int batteryPercentage = 100; // 배터리 잔량을 퍼센트 단위로 저장, 초기값은 100%

    // 새로운 ElonsToyCar 객체를 생성
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    // 주행 거리를 사용자에게 보여주는 메서드
    public String distanceDisplay() {
        return String.format("Driven %d meters", distanceDriven);
    }

    // 배터리 잔량을 사용자에게 보여주는 메서드
    public String batteryDisplay() {
        if (this.batteryPercentage == 0) {
            return "Battery empty";
        }
        return String.format("Battery at %d%%", batteryPercentage);
    }

    // 차량을 운전하는 메서드, 배터리가 남아 있어야 동작 가능
    public void drive() {
        if (batteryPercentage > 0) { // 배터리 잔량이 0% 이상일 때만 운전 가능
            distanceDriven += 20; // 주행 거리 증가
            batteryPercentage -= 1; // 배터리 소모
        }
    }
}
