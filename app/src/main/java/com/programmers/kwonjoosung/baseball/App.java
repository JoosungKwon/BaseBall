package com.programmers.kwonjoosung.baseball;

import com.programmers.kwonjoosung.baseball.controller.BaseBall;
import com.programmers.kwonjoosung.baseball.io.Console;
import com.programmers.kwonjoosung.baseball.utils.Calculator;
import com.programmers.kwonjoosung.baseball.utils.FakeNumberGenerator;
import com.programmers.kwonjoosung.baseball.utils.NumberGenerator;
import com.programmers.kwonjoosung.baseball.utils.Parser;

public class App {
    public static void main(String[] args) {
        Console console = new Console();
        NumberGenerator numberGenerate = new FakeNumberGenerator();
        Calculator calculator = new Calculator();
        Parser parser = new Parser();

        new BaseBall(console,console,numberGenerate,parser,calculator).run();
    }
}
