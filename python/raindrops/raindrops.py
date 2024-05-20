def convert(number):
    result = ""

    # 3으로 나누어 떨어지면 Pling 추가
    if number % 3 == 0:
        result += "Pling"
        
    # 5로 나누어 떨어지면 Plang 추가
    if number % 5 == 0:
        result += "Plang"

    # 7로 나누어 떨어지면 Plong 추가
    if number % 7 == 0:
        result += "Plong"

    # 3, 5, 7로 나누어 떨어지지 않으면 number를 문자열로 변환하여 추가
    if result == "":
        result = str(number)

    return result   # 모든 검사 후 최종 문자열 반환