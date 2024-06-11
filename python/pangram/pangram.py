def is_pangram(sentence):
    # 알파벳의 모든 문자를 포함하는 집합을 생성
    alphabet = set('abcdefghijklmnopqrstuvwxyz')

    # 입력된 문장을 소문자로 변환한 후 집합으로 변환하여 고유한 문자만 추출
    sentence_set = set(sentence.lower())

    # 알파벳 집합이 입력된 문장의 문자 집합의 부분집합인지 확인
    return alphabet.issubset(sentence_set)