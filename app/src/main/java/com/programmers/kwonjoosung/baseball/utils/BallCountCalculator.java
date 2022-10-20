package com.programmers.kwonjoosung.baseball.utils;

import com.programmers.kwonjoosung.baseball.model.BallCount;

public class BallCountCalculator implements Calculator{

    @Override
    public BallCount calculate(String[] data, String[] answer) {
        // 계산기가 데이터 모델(BallCount)를 반환해도 되는가?
        int strike = 0;
        int ball = 0;
        // Stream 사용? 
        for(int i=0; i< data.length; i++){
            for(int j=0; j< answer.length; j++){
                if(data[i].equals(answer[j])){
                    if(i ==j) strike +=1;
                    else ball+=1;
                }
            }

        }
        return new BallCount(strike,ball);
    }
}
