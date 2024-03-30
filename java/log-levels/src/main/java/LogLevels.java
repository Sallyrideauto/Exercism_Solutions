public class LogLevels {
    
    public static String message(String logLine) {
        int startIndex = logLine.indexOf(": ") + 2; // ": " 다음 문자부터 시작
        return logLine.substring(startIndex).trim(); // 시작 위치부터 문자열 끝까지 추출하고 공백 제거
    }

    public static String logLevel(String logLine) {
        int endIndex = logLine.indexOf("]"); // "]" 이전까지의 인덱스 추출
        return logLine.substring(1, endIndex).toLowerCase(); // 대괄호를 제외한 부분을 추출하고 소문자로 변환
    }

    public static String reformat(String logLine) {
        String messageDetail = message(logLine);
        String logLevelDetail = logLevel(logLine);
        return messageDetail + " (" + logLevelDetail + ")"; // 메세지와 로그 레벨을 조합하여 반환
    }
}
