package com.programmers.kwonjoosung.baseball.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BallCount {
    int Strike;
    int Ball;

    @Override
    public String toString() {
        return "현재 BallCount는" +
                Strike + " Strike, " +
                Ball + "Ball " +
                "입니다.";
    }
}
