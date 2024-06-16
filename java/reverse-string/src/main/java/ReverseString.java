class ReverseString {

    String reverse(String inputString) {
        // StringBuilder 객체를 생성하고 입력 문자열을 전달
        StringBuilder sb = new StringBuilder(inputString);
        // reverse 메소드를 호출하여 문자열을 뒤집음
        sb.reverse();
        // 뒤집힌 문자열을 String으로 변환하여 반환
        return sb.toString();
    }

}
