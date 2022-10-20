package com.programmers.kwonjoosung.baseball.utils;

import com.github.javafaker.Faker;

import java.util.Arrays;
import java.util.stream.Stream;

public class FakeNumberGenerator implements NumberGenerator {
    @Override
    public String[] getNumber(int count) {
        Faker faker = new Faker();
        String[] number = Stream.generate(
                () -> faker.number().randomDigitNotZero())
                .distinct()
                .limit(count).map(String::valueOf)
                .toArray(String[]::new);
        Arrays.stream(number).forEach(System.out::print);
        return number;
    }
}
