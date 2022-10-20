package com.programmers.kwonjoosung.baseball;

import com.programmers.kwonjoosung.baseball.controller.*;
import com.programmers.kwonjoosung.baseball.io.*;
import com.programmers.kwonjoosung.baseball.utils.*;

public class App {
    public static void main(String[] args) {
        Console console = new Console();
        NumberGenerator numberGenerate = new FakeNumberGenerator();
        Calculator calculator = new BallCountCalculator();
        Parser parser = new Parser();
        // 빌더 패턴으로 구현하는게..?
        new GameController(console,console,numberGenerate,parser,calculator).run();
    }
}
