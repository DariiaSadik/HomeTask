// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1

package com.sourceit.hometask.exceptions;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtilsImplements implements StringUtils{
    @Override
    public double div(String s, String s2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if ((s == null) && (s2 == null))
            throw new NullPointerException();
        Pattern pattern = Pattern.compile("^/[0-9]/$");
        Matcher matcher = pattern.matcher(s);
        Matcher matcher2 = pattern.matcher(s2);

        if ((!matcher.matches()) || (!matcher2.matches()))
            throw new NumberFormatException();
        else{
            if (Double.parseDouble(s2) == 0)
                throw new ArithmeticException() ;
            else return Double.parseDouble(s) / Double.parseDouble(s2);
        }
    }

    @Override
    public int[] findWord(String s, String s2) throws NullPointerException {
        int index = s.indexOf(s2);
        Pattern pattern = Pattern.compile(s2);
        Matcher matcher = pattern.matcher(s);
        ArrayList<Integer> arrayIndex = new ArrayList();
        if ((s == null) || (s2 == null) || (!matcher.find())) throw new NullPointerException();
        else{
            while (index >= 0) {
                arrayIndex.add(index);
                index = s.indexOf(s2, index + 1);
            }
            int[] result = new int[arrayIndex.size()];
            for(int j = 0; j < result.length; j++){
                result[j] = arrayIndex.get(j);
            }
            return result;
        }
    }

    @Override
    public double[] findNumbers(String s) throws CustomException {
        Pattern pattern = Pattern.compile("\\d*\\.\\d*");
        Matcher matcher = pattern.matcher(s);
        ArrayList<Double> arrayList = new ArrayList();
        //if(!matcher.find()) throw new CustomException("Not double value was found in the text");
        while (matcher.find()) {
            arrayList.add(Double.parseDouble(matcher.group()));
        }
        double[] numbers = new double[arrayList.size()];
        for(int j = 0; j < numbers.length; j++){
            numbers[j] = arrayList.get(j);
        }
        if (numbers.length == 0) throw new CustomException("Not double value was found in the text");
        return numbers;
    }

}
