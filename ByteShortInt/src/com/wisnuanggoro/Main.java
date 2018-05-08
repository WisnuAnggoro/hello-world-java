package com.wisnuanggoro;

public class Main {

    public static void main(String[] args) {
        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;

        // byte has a width of 8
        byte myByteMinValue = -128;
        byte myByteMaxValue = 127;
        byte myNewByteValue = (byte)(myByteMinValue/2);

        // short has a width of 16
        short myShortMinValue = -32_768;
        short myShortMaxValue = 32_767;

        // long has a width of 64
        long myLongMinValue = -9_223_372_036_854_775_808L;
        long myLongMaxValue = 9_223_372_036_854_775_807L;

    }
}
