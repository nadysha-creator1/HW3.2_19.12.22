public class Main {
    public static void main(String[] args) {
        task1();//Метод task1
        task2();//Метод task2
        task3();//Метод task3
        task4();//Метод task4
        task5();//Метод task5
        task6();//Метод task6
        task7();//Метод task7
        task8();//Метод task8

    }

    public static void task1() {
        System.out.println("Задача1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2() {//Метод task2
        System.out.println("Задача2");//Номер задачи
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
    }

    public static void task3() {//Метод task3
        System.out.println("Задача3");//Номер задачи
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
    }

    public static void task4() {//Метод task4
        System.out.println("Задача4");//Номер задачи
        var friend = 19.0;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }

    public static void task5() {//Метод task4
        System.out.println("Задача5");//Номер задачи
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }

    public static void task6() {//Метод task6
        System.out.println("Задача6");//Номер задачи
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var boxer12 = boxer1 + boxer2;
        var boxer21 = boxer2 - boxer1;
        System.out.println(boxer12);
        System.out.println(boxer21);
    }

    public static void task7() {//Метод task7
        System.out.println("Задача7");//Номер задачи
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var boxer21 = boxer2 - boxer1;
        System.out.println(boxer21);
        boxer21 = (boxer2 % boxer1);
        System.out.println(boxer21);
    }
    public static void task8() {//Метод task8
        System.out.println("Задача8");//Номер задачи
        var timeAll = 640;
        var time1 = 8;
        var All = timeAll/time1;
        var All2=All+94;
        System.out.println("Всего работников в компании -" + All + "человек");
        var time2=timeAll/All2;
        System.out.println("Если в компании работает" +  All2  + "человека, то всего" +  time2  + "часа работы может быть поделено между сотрудниками.");
    }
}

