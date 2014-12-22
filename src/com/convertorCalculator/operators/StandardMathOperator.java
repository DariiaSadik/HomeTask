package com.convertorCalculator.operators;

import com.convertorCalculator.exceptions.WrongCalculationOperator;
import com.convertorCalculator.moduls.Currency;


public interface StandardMathOperator {
    Currency eval (Currency cur1, Currency cur2) throws WrongCalculationOperator;
    Currency eval (Double cur1, Currency cur2) throws WrongCalculationOperator;
    Currency eval (Currency cur1, Double cur2) throws WrongCalculationOperator;
}
