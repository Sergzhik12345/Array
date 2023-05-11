package siarhei.hrakau.array.entity;

import java.util.Arrays;
import java.util.StringJoiner;

public class Array {
    private int[] array;

    public Array(int[] array) {
        this.array = array;
    }
    public int[] getArray(){
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Array.class.getSimpleName() + "[", "]")
                .add("array=" + Arrays.toString(array))
                .toString();
    }
}