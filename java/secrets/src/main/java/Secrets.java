public class Secrets {
    public static int shiftBack(int value, int amount) {
        // 오른쪽으로 비트를 시프트하여 원래 비트의 위치 복원
        return value >>> amount;
    }

    public static int setBits(int value, int mask) {
        // 마스크에서 1인 비트를 value에서 1로 설정
        return value | mask;
    }

    public static int flipBits(int value, int mask) {
        // 마스크에 따라 value의 비트를 반전
        return value ^ mask;
    }

    public static int clearBits(int value, int mask) {
        // 마스크에서 1인 비트를 value에서 0으로 설정
        return value & ~mask;
    }
}