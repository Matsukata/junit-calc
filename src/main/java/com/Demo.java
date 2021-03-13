package com;

import com.calc.base.BaseCalc;
import com.calc.function.FunctionBasedCalc;
import com.calc.operations.EnumCalc;

public class Demo {
    private static BaseCalc baseCalc = new BaseCalc();
    private static FunctionBasedCalc functionBasedCalc = new FunctionBasedCalc();
    private static EnumCalc enumCalc = new EnumCalc();

    public static void main(String[] args) {
        System.out.println(baseCalc.divide(5, 2));
        System.out.println(functionBasedCalc.sum(2, 3));
        System.out.println(enumCalc.sum(2, 3));
    }
}
