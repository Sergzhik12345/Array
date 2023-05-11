package siarhei.hrakau.array.main;

import siarhei.hrakau.array.entity.Array;
import siarhei.hrakau.array.service.ArrayServices;
import siarhei.hrakau.array.service.impl.ArrayServiceImpl;
import java.util.Arrays;

public class ArrayApplication {
    public static void main (String[] args) {
        Array array = new Array(new int[]{1, 6, -8, 4});
        ArrayServices arrayServices = new ArrayServiceImpl();
        arrayServices.replaceElements(array,value -> value < 0,0);
        System.out.println(array);
    }
}
