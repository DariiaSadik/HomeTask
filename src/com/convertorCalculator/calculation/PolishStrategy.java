package com.convertorCalculator.calculation;

import com.convertorCalculator.exceptions.WrongCalculationOperator;
import com.convertorCalculator.moduls.Currency;
import com.convertorCalculator.operators.*;

import java.util.LinkedList;

public class PolishStrategy {
    static boolean isDelim(char c) { // тру если пробел
        return c == ' ';
    }
    static boolean isOperator(char c) { // возвращяем тру если один из символов ниже
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
    static int priority(char op) {
        switch (op) { // при + или - возврат 1, при * / 2 иначе -1
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }

    static boolean isNotCurrency(char c){
        return isOperator(c) || c == '(' || c == ')' || c == ' ';
    }
    static void processOperator(LinkedList<Object> st, char op) throws WrongCalculationOperator {
        Object r = st.removeLast(); // выдёргиваем из упорядоченного листа последний элемент
        Object l = st.removeLast(); // также
        switch (op) { // выполняем действие между l и r в зависимости от оператора в кейсе и результат валим в st
            case '+':
//                st.add(l + r);
                break;
            case '-':
//                st.add(l - r);
                break;
            case '*':
                st.add(calculate(r, l, new Multiplication()));
                break;
            case '/':
//                st.add(l / r);
                break;
        }
    }
    static Currency calculate (Object o1, Object o2, StandardMathOperator op) throws WrongCalculationOperator {
        if(o1 instanceof Currency && o2 instanceof Currency) {
            return op.eval((Currency) o1, (Currency) o2);
        }
        else if(o1 instanceof Currency && o2 instanceof Double) {
            return op.eval((Currency) o1, (Double) o2);
        }
        return  op.eval((Double) o1, (Currency) o2);
    }
    public static int eval(String s) { // вводим выражение
        LinkedList<Object> st = new LinkedList<Object>(); // сюда наваливают цифры
        LinkedList<Character> op = new LinkedList<>(); // сюда опрераторы и st и op в порядке поступления
        for (int i = 0; i < s.length(); i++) { // парсим строку с выражением и вычисляем
            char c = s.charAt(i);
            if (isDelim(c))
                continue;
            if (c == '(')
                op.add('(');
            else if (c == ')') {
                while (op.getLast() != '(')
//                    processOperator(st,op.removeLast());
                op.removeLast();
            } else if (isOperator(c)) {
                while (!op.isEmpty() && priority(op.getLast()) >= priority(c))
//                    processOperator(st, op.removeLast());
                op.add(c);
            } else {
                String value = "";
                String type = "";
                while (i < s.length() && isNotCurrency(s.charAt(i))){
                    if(Character.isDigit(s.charAt(i)) || s.charAt(i) == '.'){
                        value += s.charAt(i++);
                    } else {
                        type += s.charAt(i++);
                    }
                }
                if (type.isEmpty()) {
                    Double operand = Double.parseDouble(value);
                  st.add(operand);
                } else {
                    Currency currency = new Currency(Double.parseDouble(value), type);
                }
                --i;
//                st.add();
            }
        }
//        while (!op.isEmpty())
//            processOperator(st, op.removeLast());
        return 3; //st.get(0);  // возврат результата
    }

    public static void main(String[] args) {
        System.out.println(eval("(3+2)*100+(10-1)"));
    }
}
