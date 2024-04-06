#import <Foundation/Foundation.h>

NS_ASSUME_NONNULL_BEGIN

@interface DifferenceOfSquares : NSObject
@property(nonatomic, assign) int squareOfSum;
@property(nonatomic, assign) int sumOfSquares;
@property(nonatomic, assign) int differenceOfSquares;

- (DifferenceOfSquares *)initWithMax:(int)n;

@end

NS_ASSUME_NONNULL_END