def is_isogram(string):
    seen = set()    # 이미 본 문자를 저장할 집합
    for char in string.lower(): # 소문자로 변환하여 반복
        if char.isalpha() and char in seen: # 문자가 알파벳이고 이미 본 문자라면
            return False    # 아이소그램이 아님
        seen.add(char)  # 문자 집합에 추가
    return True # 반복 문자 없음