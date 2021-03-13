package com.calc.operations;

public enum OperationBasedCalc {
    SUM {
        public int action(int x, int y) {
            return x + y;
        }
    },
    SUBTRACTION {
        public int action(int x, int y) {
            return x - y;
        }
    },
    DIVISION {
        public int action(int x, int y) {
            return x / y;
        }
    },
    MULTIPLICATION {
        public int action(int x, int y) {
            return x * y;
        }
    };

    public abstract int action(int x, int y);
}
