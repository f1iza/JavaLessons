package org.example;

public class Task1 {
    //exerciseOne: b = a++ + (--a * a) исправьте так, чтобы b==8, разрешается убрать/добавить 1 оператор
    public void exerciseOne() {
        int a = 2;
        int b = a++ + (a-- * a);
        System.out.println(b);
    }

    //exerciseTwo: y = x >> 1; сделать y ==2, меняя только 1 число
    public void exerciseTwo() {
        int x = 256;
        int y = x >> 7;
        System.out.println(y);
    }
}
