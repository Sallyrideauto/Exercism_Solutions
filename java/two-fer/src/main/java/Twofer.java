public class Twofer {
    public String twofer(String name) {
        // 삼항 연산자를 사용하여 name이 null이거나 빈 문자열이면 "you"를 사용하도록 함
        return "One for " + (name == null || name.isEmpty() ? "you" : name) + ", one for me.";
    }
}
