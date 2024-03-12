import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay.clone(); // 배열의 복사본을 반환
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1]; // 마지막 요소 반환
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++; // 오늘의 새 수 증가
    }

    public boolean hasDayWithoutBirds() {
        for (int day : birdsPerDay) {
            if (day == 0) {
                return true; // 0이 있는 경우 true 반환
            }
        }
        return false; // 0이 없는 경우 false 반환
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
                busyDays++; // 5마리 이상인 경우 busyDays 증가
            }
        }
        return busyDays;
    }
}
