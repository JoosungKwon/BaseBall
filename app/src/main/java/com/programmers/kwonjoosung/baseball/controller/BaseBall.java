package com.programmers.kwonjoosung.baseball.controller;

import com.programmers.kwonjoosung.baseball.io.Input;
import com.programmers.kwonjoosung.baseball.io.Output;
import com.programmers.kwonjoosung.baseball.utils.Calculator;
import com.programmers.kwonjoosung.baseball.utils.NumberGenerator;
import com.programmers.kwonjoosung.baseball.utils.Parser;
import lombok.AllArgsConstructor;

/*
 * 숫자 야구 게임 설계
 * <요구사항 파악하기>
 * 1. 게임의 룰 파악하기
 * 2. 동작환경 및 데이터의 범위 파악하기
 * 2.1 3자리 숫자 사용
 * 2.2 중복된 숫자는 사용X
 * 2.3 숫자는 1~9만 사용 (0은 사용X)
 * 2.4 Console로 입출력
 * <객체 나누기/ 객체 연관짓기> -> 클래스 다이어그램
 * 1. BaseBall - GameEngine
 * 2. NumberGenerator - 랜덤 숫자 생성기 (정답)
 * 3. Input/Output - 입출력 역할
 * 4. BallCount - 현재 상태(스트라이크, 볼)
 * 5. Parser - 입출력에서 전달한 데이터를 파싱 및 예외처리
 * 6. Calculator - 정답이랑 비교해서 몇개 맞췄는지 계산
 * <핵심로직 설계하기> - sudo code
 * 1. 정답으로 사용할 랜덤 숫자 생성하기
 * 2. (Loop)입력장치를 이용해 사용자에게 입력받아오기
 * 3. 입력값을 Parser에게 전달하여 올바른 값인지 검사하기 -> 예외 발생
 * 4. 계산기를 통해 정답과 얼마나 일치하는지 계산하기
 * 5. 계산된 결과를 BallCount 객체에 담아 출력하기
 * 6. (Break)정답인 경우 승리를 출력하고 종료
 */
@AllArgsConstructor
public class BaseBall {
    Input in;
    Output out;
    NumberGenerator numberGenerate;
    Parser parser;
    Calculator calculate;
    public void run(){


    }
}
