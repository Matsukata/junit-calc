package com.operations;

public enum OperationBasedCalc {
    SUM {
        private int sum(int x, int y) {
            return x + y;
        }
    },
    SUBTRACTION {
        private int subtract(int x, int y) {
            return x - y;
        }
    },
    DIVISION {
        private double divide(int x, int y) {
            return (double) x / y;
        }
    },
    MULTIPLICATION {
        private int multiply(int x, int y) {
            return x * y;
        }
    }
}
