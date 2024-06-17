//
// This is only a SKELETON file for the 'Resistor Color' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

// 색상 코드 배열을 상수로 정의
export const COLORS = ['black', 'brown', 'red', 'orange', 'yellow', 'green', 'blue', 'violet', 'grey', 'white'];

export const colorCode = (color) => {
  return COLORS.indexOf(color.toLowerCase());
};