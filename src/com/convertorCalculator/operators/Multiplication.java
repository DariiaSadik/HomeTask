package com.convertorCalculator.operators;

import com.convertorCalculator.exceptions.WrongCalculationOperator;
import com.convertorCalculator.moduls.Currency;


public class Multiplication implements StandardMathOperator {
    @Override
    public Currency eval(Currency cur1, Currency cur2) throws WrongCalculationOperator {
        throw new WrongCalculationOperator("Multiplication cannot be done for Currency");
    }

    @Override
    public Currency eval(Double cur1, Currency cur2) {
        return new Currency((cur2.getValue() * cur1), cur2.getType());
    }

    @Override
    public Currency eval(Currency cur1, Double cur2) {
        return new Currency((cur1.getValue() * cur2), cur1.getType());
    }
}
