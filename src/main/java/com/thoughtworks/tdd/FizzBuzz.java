package com.thoughtworks.tdd;

import java.util.HashMap;
import java.util.Map;

public class FizzBuzz {
    final private Map<Integer, String> fizzMap;

    public FizzBuzz() {
        this.fizzMap = new HashMap<>();
        this.fizzMap.put(3, "Fizz");
        this.fizzMap.put(5, "Buzz");
        this.fizzMap.put(7, "Whizz");
    }

    public String fizzBuzz(int i) {
        final String[] result = {""};
        this.fizzMap.forEach((k, v) -> {
            if (i % k == 0) {
                result[0] += v;
            }
        });
        if (result[0].equals("")) {
            return String.valueOf(i);
        }
        return result[0];
    }
}
