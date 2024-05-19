def response(hey_bob):
    hey_bob = hey_bob.strip()   # 입력받은 문자열의 양쪽 공백 제거
    if hey_bob.isupper() and hey_bob.endswith("?"): # 대문자로 질문하는 경우
        return "Calm down, I know what I'm doing!"
    elif hey_bob.isupper(): # 대문자로 말하는 경우
        return "Whoa, chill out!"
    elif hey_bob.endswith("?"): # 질문하는 경우
        return "Sure."
    elif hey_bob == "": # 아무 말도 하지 않는 경우
        return "Fine. Be that way!"
    else:
        return "Whatever."  # 위의 경우에 해당하지 않는 모든 경우