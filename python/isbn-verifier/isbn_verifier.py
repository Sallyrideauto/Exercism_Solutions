def is_valid(isbn):
    # ISBN에서 하이픈 제거
    isbn = isbn.replace('-', '').upper()

    # 길이가 10이 아니면 유효하지 않음
    if len(isbn) != 10:
        return False
    
    # 마지막 문자 확인 (숫자 또는 X)
    if isbn[-1] == 'X':
        last = 10
    elif isbn[-1].isdigit():
        last = int(isbn[-1])
    else:
        return False
    
    for i in isbn[:-1]:
        # 숫자가 아니면 유효하지 않음
        if not i.isdigit():
            return False
        
    # ISBN 계산
    isbn_sum = sum(int(isbn[i]) * (10 - i) for i in range(9)) + last
    

    # 유효성 검사 결과 반환
    return isbn_sum % 11 == 0