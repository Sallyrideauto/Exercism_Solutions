def equilateral(sides):
    a, b, c = sides[0], sides[1], sides[2]
    s = (a + b - c) * (a + c - b) * (b + c - a)
    if ((a + b >= c) and (a + c >= b) and (b + c >= a)) and s != 0:
        if (a == b and b == c):
            return True
        else:
            return False
    else:
        return False

def isosceles(sides):
    a, b, c = sides[0], sides[1], sides[2]
    s = (a + b - c) * (a + c - b) * (b + c - a)
    if ((a + b >= c) and (a + c >= b) and (b + c >= a)) and s != 0:
        if (a == b or b == c or a == c):
            return True
        else:
            return False
    else:
        return False


def scalene(sides):
    a, b, c = sides[0], sides[1], sides[2]
    s = (a + b - c) * (a + c - b) * (b + c - a)
    if ((a + b >= c) and (a + c >= b) and (b + c >= a)) and s != 0:
        if (a != b and b != c and a != c):
            return True
        else:
            return False
    else:
        return False