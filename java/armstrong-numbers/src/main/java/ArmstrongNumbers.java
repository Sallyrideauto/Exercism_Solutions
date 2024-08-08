class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        String numberAsString = String.valueOf(numberToCheck);
        int power = numberAsString.length();
        int sum = 0;
        for (int i = 0; i < numberAsString.length(); i++) {
            sum += Math.pow(Character.getNumericValue(numberAsString.charAt(i)), power);
        }
        return sum == numberToCheck;
    }

}
