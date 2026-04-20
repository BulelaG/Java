class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation)
            throws IllegalOperationException {

        // 1. Validate operation
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }

        if (operation.isEmpty()) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }

        int result;

        try {
            // 2. Perform calculation
            switch (operation) {
                case "+":
                    result = operand1 + operand2;
                    break;

                case "*":
                    result = operand1 * operand2;
                    break;

                case "/":
                    result = operand1 / operand2; // may throw ArithmeticException
                    break;

                default:
                    throw new IllegalOperationException(
                        "Operation '" + operation + "' does not exist"
                    );
            }

        } catch (ArithmeticException e) {
            // 3. Handle division by zero
            throw new IllegalOperationException(
                "Division by zero is not allowed", e
            );
        }

        // 4. Return formatted string
        return operand1 + " " + operation + " " + operand2 + " = " + result;
    }
}