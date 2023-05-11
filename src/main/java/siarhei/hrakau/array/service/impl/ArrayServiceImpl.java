package siarhei.hrakau.array.service.impl;

import siarhei.hrakau.array.service.ArrayServices;
import siarhei.hrakau.array.entity.Array;

public class ArrayServiceImpl implements ArrayServices {


    @Override
    public int findMax(Array array) {
        int[] numbers = array.getArray();
        int maxValue = numbers[0];
        for (int number : numbers){
            if(number>maxValue){
                maxValue=number;
            }
        }
        return maxValue;
    }

    @Override
    public int findMin(Array array) {
        int[] numbers = array.getArray();
        int minValue = numbers[0];
        for (int number : numbers){
            if(number<minValue){
                minValue=number;
            }
        }
        return minValue;
    }

    @Override
    public void replaceElements(Array array, Condition condition, int newValue) {
        int[] numbers = array.getArray();
        for (int i =0; i<numbers.length; i++){
            if (condition.comparing(numbers[i])){
                numbers[i]=newValue;
            }
        }
        array.setArray(numbers);
    }

    @Override
    public double findAverage(Array array) {
        int[] numbers = array.getArray();
        int sumOfNumbers=0;
        for (int number:numbers ){
            sumOfNumbers+=number;
        }
        double averageValue = (double) sumOfNumbers / numbers.length;
        return averageValue;
    }

    @Override
    public int findSum(Array array) {
        int[] numbers = array.getArray();
        int sumOfNumbers=0;
        for (int number:numbers ){
            sumOfNumbers+=number;
        }
        return sumOfNumbers;
    }

    @Override
    public int countNumberOfPositive(Array array) {
        int[] numbers = array.getArray();
        int count = 0;
        for (int number : numbers){
            if (number>0){
                count++;
            }
        }
        return count;
    }

    @Override
    public int countNumberOfNegative(Array array) {
        int[] numbers = array.getArray();
        int count = 0;
        for (int number : numbers){
            if (number<0){
                count++;
            }
        }
        return count;
    }
}
