def score(x, y):
    # (x, y) 좌표로부터 원점까지의 거리 계산
    distance = (x ** 2 + y ** 2) ** 0.5

    # 각 원의 변경에 따라 점수를 계산
    if distance > 10:
        return 0    # 타겟 밖
    elif distance > 5:
        return 1    # 바깥 원
    elif distance > 1:
        return 5    # 중간 원
    else:
        return 10   # 안쪽 원