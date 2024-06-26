// @ts-check

/**
 * Determine how many cards of a certain type there are in the deck
 *
 * @param {number[]} stack
 * @param {number} card
 *
 * @returns {number} number of cards of a single type there are in the deck
 */
export function cardTypeCheck(stack, card) {
  let count = 0;
  for (let i = 0; i < stack.length; i++) {
    if (stack[i] === card) {
      count++;
    }
  }
  return count;
}

/**
 * Determine how many cards are odd or even
 *
 * @param {number[]} stack
 * @param {boolean} type the type of value to check for - odd or even
 * @returns {number} number of cards that are either odd or even (depending on `type`)
 */
export function determineOddEvenCards(stack, type) {
  let count = 0;
  for (const card of stack) {
    if (type && card % 2 === 0) {
      // type이 true이고, 카드가 짝수일 때
      count++;
    } else if (!type && card % 2 !== 0) {
      // type이 false이고, 카드가 홀수일 때
      count++;
    }
  }
  return count;
}