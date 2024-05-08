import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone(); // 배열의 깊은 복사를 수행하여 외부 수정으로부터 독립성 보장
    }

    public int[] getLastWeek() {
        return birdsPerDay.clone(); // 배열의 복사본을 반환
    }

    public int getToday() {
        if (birdsPerDay.length == 0) {
            return 0; // 배열이 비어있는 경우 0 반환
        }
        return birdsPerDay[birdsPerDay.length - 1]; // 마지막 요소 반환, 배열이 비었을 때 예외 방지
    }

    public void incrementTodaysCount() {
        if (birdsPerDay.length > 0) {
            birdsPerDay[birdsPerDay.length - 1]++; // 배열이 비어 있지 않을 때만 오늘의 새 수 증가
        }
    }

    public boolean hasDayWithoutBirds() {
        for (int day : birdsPerDay) {
            if (day == 0) {
                return true; // 하루도 새가 없는 날이 있으면 true 반환
            }
        }
        return false; // 모든 날에 적어도 하나의 새가 있으면 false 반환
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        for (int i = 0; i < numberOfDays && i < birdsPerDay.length; i++) {
            sum += birdsPerDay[i]; // 첫 번째 날부터 지정된 일 수까지 새 수 합산
        }
        return sum;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int day : birdsPerDay) {
            if (day >= 5) {
                busyDays++; // 하루에 5마리 이상인 경우 busyDays 증가
            }
        }
        return busyDays;
    }
}
