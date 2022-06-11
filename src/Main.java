public class Main {
    public static void main(String[] args) {

        Griffindor harry = new Griffindor("Гарри Поттер", 100,50, 50, 76,34);
        Griffindor germiona = new Griffindor("Гермиона Грейнджер", 78,43,77, 100,45);
        Griffindor ron = new Griffindor("Рон Уизли", 33,22,100, 34,5);

        Slizerin drako = new Slizerin("Драко Малфой", 88,55,45,76,45,7,54);
        Slizerin grehem = new Slizerin("Грэхэм Монтегю",33,55,44,70,50,99,54);
        Slizerin gregory = new Slizerin("Грегори Гойл",55,55,12,34,87,67,54);

        Puffenduj zahariya = new Puffenduj("Захария Смит",33,22,87, 98, 34);
        Puffenduj sedrik = new Puffenduj("Седрик Диггори",44,78,45, 76, 98);
        Puffenduj jastin = new Puffenduj("Джастин Финч-Флетчли",88,23,33, 55, 77);

        Kogtevran chzhou = new Kogtevran("Чжоу Чанг",88,44,65,89,99,33);
        Kogtevran padma = new Kogtevran("Падма Патил",34,66,55,55,33,99);
        Kogtevran markus = new Kogtevran("Маркус Белби",99,44,76,87,33,66);

        System.out.println(harry);
        System.out.println(drako);
        System.out.println(zahariya);
        System.out.println(chzhou);

        harry.compare(germiona);
        harry.compare(drako);
        drako.compare(gregory);



    }


}