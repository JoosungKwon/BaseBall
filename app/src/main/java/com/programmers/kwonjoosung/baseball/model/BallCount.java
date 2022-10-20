package com.programmers.kwonjoosung.baseball.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BallCount {
    int strike;
    int ball;
    @Override
    public String toString() {
        return "현재 BallCount는 " +
                strike + "Strike, " +
                ball + "Ball" +
                "입니다.";
    }
}
