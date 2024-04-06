#import "DifferenceOfSquares.h"

@implementation DifferenceOfSquares

static int _differenceOfSquares; + (int)differenceOfSquares {
    return _differenceOfSquares;
} + (void)setDifferenceOfSquares:(int)newDifferenceOfSquares {
    _differenceOfSquares = differenceOfSquares;
}

static int _squareOfSum; + (int)squareOfSum {
    return _squareOfSum;
} + (void)setSquareOfSum:(int)newSquareOfSum {
    _squareOfSum = newSquareOfSum;
}

static int _sumOfSquares; + (int)sumOfSquares {
    return _sumOfSquares;
} + (void)setSumOfSquares:(int)newSumOfSquares {
    _sumOfSquares = newSumOfSquares;
}

- (DifferenceOfSquares *)initWithMax:(int)n {

    int i;
    double doubleRes1 = 0;
    double doubleRes2 = 0;

    for (i = 1; i <= n; i++) {
        doubleRes1 += i;
        doubleRes2 += pow(i, 2);
    }

    _squareOfSum = (int)pow(doubleRes1, 2);
    _sumOfSquares = (int)doubleRes2;
    _differenceOfSquares = abs(_squareOfSum - _sumOfSquares);

    return self;
}


@end