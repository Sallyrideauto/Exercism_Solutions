class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake; // 기사가 깨어 있지 않을 경우 빠른 공격이 가능
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake; // 세 명 중 한 명이라도 깨어 있으면 스파이 활동 가능
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake; // 궁수가 잠들어 있고 죄수가 깨어 있어야 죄수에게 신호 가능
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake,
            boolean petDogIsPresent) {
        // 죄수를 해방 가능한 조건은 애완견이 있을 때와 없을 때로 나뉨
        return (petDogIsPresent && !archerIsAwake)
                || (!petDogIsPresent && !knightIsAwake && !archerIsAwake && prisonerIsAwake);
    }
}
