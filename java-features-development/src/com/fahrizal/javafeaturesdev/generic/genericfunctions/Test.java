package com.fahrizal.javafeaturesdev.generic.genericfunctions;

class Test {
    // A Generic method example
    static <T> void genericDisplay (T element){
        System.out.println(element.getClass().getName() + " = " + element);
    }

    public static void main(String[] args) {
        genericDisplay(11);
        genericDisplay("GeeksForGeeks");
        genericDisplay(1.0);
    }
}