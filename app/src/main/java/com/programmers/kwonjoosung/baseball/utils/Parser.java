package com.programmers.kwonjoosung.baseball.utils;

import java.util.Arrays;
import java.util.Optional;

public class Parser {
    public Optional<String[]> parsing(String data, int COUNT_NUM) {

        long cnt = data
                .chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .distinct()
                .filter(i -> i > 0)
                .count();
        if(cnt != COUNT_NUM) return Optional.empty();
        String[] reply = data.split("");
        return Optional.of(reply);
    }
}
