class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        // Operation cannot be null
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }

        // Operation cannot be empty
        if (operation.isEmpty()) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }

        try {
            int result;
            switch (operation) {
                case "+":
                    result = operand1 + operand2;
                    break;
                case "-":
                    throw new IllegalOperationException("Operation '-' does not exist"); // 예외 발생
                case "*":
                    result = operand1 * operand2;
                    break;
                case "/":
                    if (operand2 == 0) {
                        throw new ArithmeticException("Division by zero is not allowed"); // 0으로 나누기 예외
                    }
                    result = operand1 / operand2;
                    break;
                default:
                    throw new IllegalOperationException("Operation '" + operation + "' does not exist");
            }
            return String.format("%d %s %d = %d", operand1, operation, operand2, result);
        } catch (ArithmeticException e) {
            throw new IllegalOperationException("Division by zero is not allowed", e);
        } catch (IllegalArgumentException | IllegalOperationException e) {
            throw e; // 예외를 다시 발생시켜 테스트 프레임워크에서 캐치할 수 있도록 함
        } catch (Exception e) {
            return "An unexpected error occurred"; // 그 외 예상치 못한 예외 처리
        }
    }
}