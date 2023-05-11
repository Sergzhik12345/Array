package siarhei.hrakau.array.service;

import siarhei.hrakau.array.entity.Array;
import siarhei.hrakau.array.service.impl.ArrayServiceImpl;

public interface ArrayServices {
    int findMax(Array array);
    int findMin(Array array);

    @FunctionalInterface
    interface Condition{
        boolean comparing(int number);
    }
    void replaceElements(Array array, Condition condition, int newValue);

    double findAverage (Array array);
    int findSum (Array array);
    int countNumberOfPositive (Array array);
    int countNumberOfNegative (Array array);

}
