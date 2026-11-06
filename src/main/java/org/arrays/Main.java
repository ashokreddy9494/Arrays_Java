package org.arrays;


class A{

}
class B extends A{

}
class C extends B{

}
class Main {
    static void meth1(A a){
        System.out.println("one");
    }
    static void meth1(B b){
        System.out.println("two");
    }
    static void meth1(C c){
        System.out.println("three");
    }
    static void meth1(Object obj){
        System.out.println("object");
    }
    public static void main(String[] args) {

        C c = new C();
        meth1(c);

    }
}


