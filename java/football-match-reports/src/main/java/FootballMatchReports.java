public class FootballMatchReports {
    public static String onField(int shirtNum) {
        switch (shirtNum) {
            case 1:
                return "goalie";
            case 2:
                return "left back";
            case 3, 4:
                return "center back"; // 3번 또는 4번은 center back
            case 5:
                return "right back";
            case 6, 7, 8:
                return "midfielder"; // 6번, 7번, 8번은 midfielder
            case 9:
                return "left wing";
            case 10:
                return "striker";
            case 11:
                return "right wing";
            default:
                throw new IllegalArgumentException("Invalid shirt number: " + shirtNum);
        }
    }
}
