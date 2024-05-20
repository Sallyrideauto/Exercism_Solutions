import java.util.Map;
import java.util.HashMap;

public class LogLine {
    private String logLine;
    private static final Map<String, LogLevel> logLevelMap = new HashMap<>();

    static {
        logLevelMap.put("ERR", LogLevel.ERROR);
        logLevelMap.put("DBG", LogLevel.DEBUG);
        logLevelMap.put("INF", LogLevel.INFO);
        logLevelMap.put("WRN", LogLevel.WARNING);
        logLevelMap.put("FTL", LogLevel.FATAL);
        logLevelMap.put("TRC", LogLevel.TRACE);
        logLevelMap.put("UNKNOWN", LogLevel.UNKNOWN);
    }

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String level = extractLogLevel(logLine);
        // 대소문자 무시하고 enum 값을 가져옴
        LogLevel logLevel = logLevelMap.getOrDefault(level.toUpperCase(), LogLevel.UNKNOWN);
        return logLevel;
    }

    public String getOutputForShortLog() {
        LogLevel logLevel = getLogLevel();
        // ':' 다음 첫 번째 문자로부터 메세지 추출
        int messageStartIndex = logLine.indexOf(":") + 1;
        String message = logLine.substring(messageStartIndex).trim(); // trim()으로 앞뒤 공백 제거
        return logLevel.getCode() + ":" + message;
    }

    private String extractLogLevel(String logLine) {
        int start = logLine.indexOf("[") + 1;
        int end = logLine.indexOf("]");
        if (start != -1 && end != -1 && start < end) {
            return logLine.substring(start, end).toUpperCase(); // 약어 매핑을 위해 추출 후 대문자 변환
        }
        return "";
    }
}
