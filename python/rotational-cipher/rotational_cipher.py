def rotate(text, key):
    result = ""
    for char in text:
        if char.isalpha():  # 문자가 알파벳인지 확인
            start = ord('a') if char.islower() else ord('A')
            offset = (ord(char) - start + key) % 26 # 알파벳의 순환을 고려한 이동
            result += chr(start + offset)
        else:
            result += char  # 비문자는 그대로 추가
    return result