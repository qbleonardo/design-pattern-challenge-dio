package strategy.calcultor;

public class SubtractOperationStrategyImpl implements OperationStrategy {
    @Override
    public double execute(double num1, double num2) {
        return num1 - num2;
    }
}
