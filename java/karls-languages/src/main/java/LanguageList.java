import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    // 언어 목록이 비어 있는지 확인
    public boolean isEmpty() {
        return languages.isEmpty();
    }

    // 새 언어를 목록에 추가
    public void addLanguage(String language) {
        languages.add(language);
    }

    // 목록에서 특정 언어를 제거
    public void removeLanguage(String language) {
        languages.remove(language);
    }

    // 목록의 첫 번째 언어를 안전하게 반환
    public String firstLanguage() {
        if (isEmpty()) { // IndexOutOfBoundsException을 방지하기 위한 확인
            return null;
        }
        return languages.get(0);
    }

    // 목록에 있는 언어의 수 계산
    public int count() {
        return languages.size();
    }

    // 목록에 특정 언어가 포함되어 있는지 확인
    public boolean containsLanguage(String language) {
        return languages.contains(language);
    }

    // 목록에 "Java" 또는 "Kotlin"이 포함되어 있는지 확인
    public boolean isExciting() {
        return languages.contains("Java") || languages.contains("Kotlin");
    }
}
