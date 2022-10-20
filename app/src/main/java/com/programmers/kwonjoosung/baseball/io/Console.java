package com.programmers.kwonjoosung.baseball.io;

import java.util.Scanner;

public class Console implements Input, Output {
    Scanner scanner = new Scanner(System.in);
    @Override
    public String input(String Message) {
        print(Message);
        return scanner.nextLine();
    }
    @Override
    public void print(String data) {
        System.out.println(data);
    }
    @Override
    public void win() {
        System.out.println("정답입니다.");
    }
    @Override
    public void inputError() {
        System.out.println("잘못입력하셨습니다");
    }
}
