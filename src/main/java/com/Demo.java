package com;

import com.calc.base.BaseCalc;
import com.calc.function.FunctionBasedCalc;
import com.calc.enums.EnumCalc;

public class Demo {
    public static void main(String[] args) {
        System.out.println(new BaseCalc().divide(5, 0));
        System.out.println(new FunctionBasedCalc().sum(2, 3));
        System.out.println(new EnumCalc().sum(2, 3));
    }
}
