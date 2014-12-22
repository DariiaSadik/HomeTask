package com.convertorCalculator.operators;

import com.convertorCalculator.exceptions.WrongCalculationOperator;
import com.convertorCalculator.moduls.Currency;

public class Subtraction implements StandardMathOperator {
    @Override
    public Currency eval(Currency cur1, Currency cur2) throws WrongCalculationOperator {
        if (!cur1.getType().equals(cur2.getType()))
            throw new WrongCalculationOperator("Different currency cannot be subtracted");
        return new Currency(cur1.getValue() - cur2.getValue(), cur1.getType());
    }

    @Override
    public Currency eval(Double cur1, Currency cur2) throws WrongCalculationOperator {
        return null;
    }

    @Override
    public Currency eval(Currency cur1, Double cur2) throws WrongCalculationOperator {
        return null;
    }
}
