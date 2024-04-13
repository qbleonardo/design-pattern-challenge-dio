package strategy;

import java.util.Scanner;

public class ExecuteOperationStrategy {

    public static void executeImpl(){
        Scanner scanner = new Scanner(System.in);

        OperationStrategy addOperation = new AddOperationStrategyImpl();
        OperationStrategy subtractOperation = new SubtractOperationStrategyImpl();
        OperationStrategy multiplyOperation = new MultiplyOperationStrategyImpl();
        OperationStrategy divideOperation = new DivideOperationStrategyImpl();

        // Criando a calculadora
        CalculatorContext calculator = new CalculatorContext();

        // Obtendo os números do usuário
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        // Obtendo a operação desejada
        String operationChoice = scanner.next();

        // Configurando a operação na calculadora
        switch (operationChoice) {
            case "+":
                calculator.setOperation(addOperation);
                break;
            case "-":
                calculator.setOperation(subtractOperation);
                break;
            case "*":
                calculator.setOperation(multiplyOperation);
                break;
            case "/":
                calculator.setOperation(divideOperation);
                break;
            default:
                System.out.println("Operação inválida.");
                return;
        }

        // Realizando a operação e exibindo o resultado
        double result = calculator.performOperation(num1, num2);
        System.out.println(result);
    }
}
