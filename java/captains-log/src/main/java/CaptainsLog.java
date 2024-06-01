import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[] { 'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y' };

    private Random random;

    // 생성자를 통해 Random 인스턴스 초기화
    CaptainsLog(Random random) {
        this.random = random;
    }

    // 무작위 행성 클래스 문자 반환
    char randomPlanetClass() {
        return PLANET_CLASSES[random.nextInt(PLANET_CLASSES.length)];
    }

    // 무작위 우주선 등록 번호 생성
    String randomShipRegistryNumber() {
        return "NCC-" + (random.nextInt(9000) + 1000);
    }

    // 무작위 스타데이트 생성
    double randomStardate() {
        return 41000.0 + (random.nextDouble() * 1000.0);
    }
}
