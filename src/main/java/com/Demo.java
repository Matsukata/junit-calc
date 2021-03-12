package com;

import com.base.BaseCalc;
import com.function.FunctionBasedCalc;
import com.operations.OperationBasedCalc;

public class Demo {
    private static BaseCalc baseCalc = new BaseCalc();
    private static FunctionBasedCalc functionBasedCalc = new FunctionBasedCalc();
    private static OperationBasedCalc operationBasedCalc = OperationBasedCalc.DIVISION;

    public static void main(String[] args) {
        System.out.println(baseCalc.divide(5,2));
        System.out.println(functionBasedCalc.getMap().get(OperationBasedCalc.SUM).apply(6,2));
        System.out.println(operationBasedCalc.action(5,2));

    }
}
