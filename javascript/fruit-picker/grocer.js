/**
 * @param {GrocerQuery} query
 * @param {GrocerOnSuccessCallback} onSuccess
 * @param {GrocerOnErrorCallback} onError
 * @return void
 */
export function order(query, onSuccess, onError) {
  if (query.quantity > 0) {
    onSuccess("{ message: 'SUCCESS' }");
  } else {
    onError("{ message: 'ERROR' }");
  }
}
