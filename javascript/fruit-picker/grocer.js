/**
 * @param {GrocerQuery} query
 * @param {GrocerOnSuccessCallback} onSuccess
 * @param {GrocerOnErrorCallback} onError
 * @return void
 */
export function order(query, onSuccess, onError) {
  if (query.quantity > 0) {
    onSuccess(); // 성공 콜백 호출
  } else {
    onError(); // 오류 콜백 호출
  }
}
