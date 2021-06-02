package com.binary.test;

public class BinaryTest {

    static int STATE_OPEN = 0x1; //对应对应二进制0001
    static int STATE_CLOSE = 0x2; //对应二进制0010
    static int STATE_LOCK = 0x4; //对应二进制0100

    static int STATE = 0;

    public static void main(String[] args) {
        STATE |= STATE_OPEN;
        System.out.println(STATE);

        STATE = 0x0111;
//                0010
//        int stateOpen = ~STATE_OPEN;

//        STATE &= stateOpen;

        if ((STATE & STATE_CLOSE) == 0) {
            System.out.println("没有open");
        }
    }

}
