def is_armstrong_number(number):
    # 숫자를 문자열로 변환하여 각 자리수를 얻고, 각 자리수를 정수로 다시 변환
    digits = [int(digit) for digit in str(number)]

    # 자릿수의 길이
    num_digits = len(digits)

    # 각 자릿수를 자릿수의 길이만큼 거듭제곱하여 합산
    sum_of_powers = sum(digit ** num_digits for digit in digits)

    # 걔산된 합과 원래 수를 비교
    return sum_of_powers == number