// @ts-check
//
// The line above enables type checking for this file. Various IDEs interpret
// the @ts-check directive. It will give you helpful autocompletion when
// implementing this exercise.

/**
 * Calculates the total bird count.
 *
 * @param {number[]} birdsPerDay
 * @returns {number} total bird count
 */
export function totalBirdCount(birdsPerDay) {
  let countedBirds = 0;
  
  for (let i = 0; i < birdsPerDay.length; i++) {
    countedBirds += birdsPerDay[i];
  }
  return countedBirds;
}

/**
 * Calculates the total number of birds seen in a specific week.
 *
 * @param {number[]} birdsPerDay
 * @param {number} week
 * @returns {number} birds counted in the given week
 */
export function birdsInWeek(birdsPerDay, week) {
  const daysPerWeek = 7;
  let countedBirds = 0;

  // 주의 시작 인덱스 계산
  const startIndex = (week - 1) * daysPerWeek;
  // 주의 끝 인덱스 계산
  const endIndex = startIndex + daysPerWeek;

  // 해당하는 주의 새의 수 합산하기
  for (let i = startIndex; i < endIndex; i++) {
    countedBirds += birdsPerDay[i];
  }

  return countedBirds;
}

/**
 * Fixes the counting mistake by increasing the bird count
 * by one for every second day.
 *
 * @param {number[]} birdsPerDay
 * @returns {number[]} corrected bird count data
 */
export function fixBirdCountLog(birdsPerDay) {
  for (let i = 0; i < birdsPerDay.length; i++) {
    if (i % 2 === 0) {
      birdsPerDay[i]++;
    }
  }
  return birdsPerDay;
}
