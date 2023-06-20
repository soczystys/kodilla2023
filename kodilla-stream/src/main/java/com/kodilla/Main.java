package com.kodilla;

import com.kodilla.stream.SaySomething;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class Main {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        expressionExecutor.executeExpression(3,4 , FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4 , FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3,4 , FunctionalCalculator::divideAByB);
        expressionExecutor.executeExpression(3,4 , FunctionalCalculator::multiplyAByB);
    }
}