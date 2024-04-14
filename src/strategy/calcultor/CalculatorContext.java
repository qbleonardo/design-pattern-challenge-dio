package strategy.calcultor;

public class CalculatorContext {

    private OperationStrategy operation;

    public void setOperation(OperationStrategy operation) {
        this.operation = operation;
    }

    public double performOperation(double num1, double num2) {
        return operation.execute(num1, num2);
    }
}
