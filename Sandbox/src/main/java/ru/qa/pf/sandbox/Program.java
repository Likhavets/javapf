package ru.qa.pf.sandbox;

public class Program {

    public static void main(String[] args) {
        hello("world");
        hello("bro");
        Square s = new Square(5);
        s.m = 5;

        System.out.println("Площадь квадрата со стороной " + s.m + " равна " + area(s));

        Rec r = new Rec();
        r.a = 4;
        r.b =6;
        System.out.println("Площадь треуголника со сторонами " + a + " и " + b + " равна " + area(a,b));
    }

        public static void hello(String somebody){
            System.out.println("Hello, " + somebody + "!");
        }

        public static double area(Square s){
        return s.m*s.m;
        }

        public static double area(Rec r) {
        return r.a*r.b;

        }

    }