#import "Bob.h"

@implementation Bob

// 메서드 구현
- (NSString *)responseToInput:(NSString *)input {
    // 입력에 따라 다른 응답 반환
    if ([input hasSuffix:@"?"]) {
        // 질문일 경우
        return @"Sure.";
    } else if ([input isEqualToString:[input uppercaseString]] && [input stringByTrimmingCharactersInSet:[NSCharacterSet whitespaceCharacterSet]].length > 0) {
        // 대문자로만 이루어지는 경우(소리치는 경우)
        return @"Whoa, chill out!";
    } else if ([input hasSuffix:@"?"] && [input isEqualToString:[input uppercaseString]] && [input stringByTrimmingCharactersInSet:[NSCharacterSet whitespaceCharacterSet]].length > 0) {
        // 질문을 소리치는 경우
        return @"Calm down, I know what I'm doing!";
    } else if ([[input stringByTrimmingCharactersInSet: [NSCharacterSet whitespaceCharacterSet]] length] == 0) {
        // 아무것도 없는 경우
        return @"Fine. Be that way!";
    } else {
        // 기타 경우
        return @"Whatever.";
    }
}

@end
