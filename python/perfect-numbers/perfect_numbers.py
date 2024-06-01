def classify(number):
    """ A perfect number equals the sum of its positive divisors.

    :param number: int a positive integer
    :return: str the classification of the input integer
    """
    if number < 1:
        raise ValueError("Classification is only possible for positive integers.")
    
    sum_of_divisors = 0
    # 1부터 number의 절반까지 확인하여 약수를 찾고 합 구하기
    for i in range(1, number // 2 + 1):
        if number % i == 0:
            sum_of_divisors += i
            
    # 완전수인 경우
    if sum_of_divisors == number:
        return "perfect"
    # 과잉수인 경우
    elif sum_of_divisors > number:
        return "abundant"
    # 부족수인 경우
    else:
        return "deficient"