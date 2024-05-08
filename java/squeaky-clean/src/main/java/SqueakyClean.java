class SqueakyClean {
        static String clean(String identifier) {
                // 공백을 '_'로 변환하고, 알파벳, 숫자, '_', '-' 이외 문자 제거
                String tmpIdentifier = identifier.replaceAll("\\s", "_").replaceAll("[^\\w-]", "");

                // '-' 뒤의 문자를 대문자로 변경하는 로직 개선
                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < tmpIdentifier.length(); i++) {
                        if (tmpIdentifier.charAt(i) == '-' && i + 1 < tmpIdentifier.length()) {
                                // 다음 문자를 대문자로 변환하고 '-'는 제외
                                builder.append(Character.toUpperCase(tmpIdentifier.charAt(i + 1)));
                                i++; // 다음 문자는 이미 처리했으므로 인덱스 증가
                        } else {
                                builder.append(tmpIdentifier.charAt(i));
                        }
                }

                // 숫자를 해당 문자로 치환
                return builder.toString()
                                .replace("4", "a")
                                .replace("3", "e")
                                .replace("0", "o")
                                .replace("7", "t")
                                .replace("1", "l");
        }
}