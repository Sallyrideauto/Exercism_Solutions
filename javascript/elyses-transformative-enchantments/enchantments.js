// @ts-check

/**
 * Double every card in the deck.
 *
 * @param {number[]} deck
 *
 * @returns {number[]} deck with every card doubled
 */
export function seeingDouble(deck) {
  // map 메서드를 사용하여 각 요소룰 두 베로 만들기
  return deck.map(card => card * 2);
}

/**
 *  Creates triplicates of every 3 found in the deck.
 *
 * @param {number[]} deck
 *
 * @returns {number[]} deck with triplicate 3s
 */
export function threeOfEachThree(deck) {
  // reduce 메서드를 사용하여 3의 개수를 세고, 3이면 3개로 만들기
  return deck.reduce((result, card) => {
    if (card === 3) {
      // 카드가 3이면 3개로 만들기
      result.push(3, 3, 3);
    } else {
      // 아니면 그대로 추가
      result.push(card);
    }
    return result;
  }, []);
}

/**
 * Extracts the middle two cards from a deck.
 * Assumes a deck is always 10 cards.
 *
 * @param {number[]} deck of 10 cards
 *
 * @returns {number[]} deck with only two middle cards
 */
export function middleTwo(deck) {
  // 덱의 길이가 항상 10이므로 가운데 두 장의 인덱스를 직접 계산
  const midIndex = deck.length / 2 - 1;
  return deck.slice(midIndex, midIndex + 2);
}

/**
 * Moves the outside two cards to the middle.
 *
 * @param {number[]} deck with even number of cards
 *
 * @returns {number[]} transformed deck
 */

export function sandwichTrick(deck) {
  const midIndex = deck.length / 2;
  deck.splice(midIndex, 0, deck.pop());
  deck.splice(midIndex, 0, deck.shift());
  return deck;
}

/**
 * Removes every card from the deck except 2s.
 *
 * @param {number[]} deck
 *
 * @returns {number[]} deck with only 2s
 */
export function twoIsSpecial(deck) {
  // filter 메서드를 사용하여 2만 남기기
  return deck.filter(card => card === 2);
}

/**
 * Returns a perfectly order deck from lowest to highest.
 *
 * @param {number[]} deck shuffled deck
 *
 * @returns {number[]} ordered deck
 */
export function perfectlyOrdered(deck) {
  // sort 메서드를 사용하여 덱을 오름차순으로 정렬
  return deck.sort((a, b) => a - b);
  return deck;
}

/**
 * Reorders the deck so that the top card ends up at the bottom.
 *
 * @param {number[]} deck
 *
 * @returns {number[]} reordered deck
 */
export function reorder(deck) {
  deck.reverse();
  return deck;
}
