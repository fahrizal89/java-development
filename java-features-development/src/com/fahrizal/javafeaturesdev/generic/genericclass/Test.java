package com.fahrizal.javafeaturesdev.generic.genericclass;

class Test<T> {
    // An object of type T is declared
    T obj;

    Test(T obj) {
        this.obj = obj;
    }

    public T getObject()  {
        return this.obj;
    }
}