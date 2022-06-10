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
        compare(harry, drako);
        compare(harry, germiona);
        compare(drako, gregory);
    }
    public static void compare (Hogvarts hogvarts1, Hogvarts hogvarts2) {
        if (hogvarts1.silaMagii == hogvarts2.silaMagii) {
            System.out.printf("У студентов %s и %s сила магии равна%n", hogvarts1.name, hogvarts2.name);
        }
        if (hogvarts1.silaMagii > hogvarts2.silaMagii) {
            System.out.printf("У студента %s сила магии больше, чем у %s %n", hogvarts1.name, hogvarts2.name);
        } else {
            System.out.printf("У студента %s сила магии больше, чем у %s %n", hogvarts2.name, hogvarts1.name);
        }
        if (hogvarts1.rassTransgressii == hogvarts2.rassTransgressii) {
            System.out.printf("У студентов %s и %s рассточние трансгрессии равно %n", hogvarts1.name, hogvarts2.name);
        }
        if (hogvarts1.rassTransgressii > hogvarts2.rassTransgressii) {
            System.out.printf("У студента %s рассточние трансгрессии больше, чем у %s %n", hogvarts1.name, hogvarts2.name);
        } else {
            System.out.printf("У студента %s рассточние трансгрессии больше, чем у %s %n", hogvarts2.name, hogvarts1.name);
        }

    }

    public static void compare (Griffindor griffindor1, Griffindor griffindor2) {
        int n1 = griffindor1.getBlagorodstvo() + griffindor1.getChest() + griffindor1.getHrabrost();
        int n2 = griffindor2.getBlagorodstvo() + griffindor2.getChest() + griffindor2.getHrabrost();
        if (n1 == n2) {
            System.out.println("Студенты Гриффиндора " + griffindor1.name + " и " + griffindor2.name + " равны по своим качествам");
        }
        if (n1 > n2) {
            System.out.println(griffindor1.name + " лучше Гриффиндорец, чем " + griffindor2.name);
        } else {
            System.out.println(griffindor2.name + " лучше Гриффиндорец, чем " + griffindor1.name);
        }
    }
    public static void compare (Puffenduj puffenduj1, Puffenduj puffenduj2) {
        int n1 = puffenduj1.getChestnost() + puffenduj1.getTrudolyubie() + puffenduj1.getVernost();
        int n2 = puffenduj2.getChestnost() + puffenduj2.getTrudolyubie() + puffenduj2.getVernost();
        if (n1 == n2) {
            System.out.println("Студенты Пуффендуя " + puffenduj1.name + " и " + puffenduj2.name + " равны по своим качествам");
        }
        if (n1 > n2) {
            System.out.println(puffenduj1.name + " лучше Пуффендуец, чем " + puffenduj2.name);
        } else {
            System.out.println(puffenduj2.name + " лучше Пуффендуец, чем " + puffenduj1.name);
        }
    }
    public static void compare (Slizerin slizerin1, Slizerin slizerin2) {
        int n1 = slizerin1.getAmbicioznost() + slizerin1.getHitrost() + slizerin1.getNahodchivost() + slizerin1.getReshitelnost() + slizerin1.getZhazhdaVlasti();
        int n2 = slizerin2.getAmbicioznost() + slizerin2.getHitrost() + slizerin2.getNahodchivost() + slizerin2.getReshitelnost() + slizerin2.getZhazhdaVlasti();
        if (n1 == n2) {
            System.out.println("Студенты Слизерина " + slizerin1.name + " и " + slizerin2.name + " равны по своим качествам");
        }
        if (n1 > n2) {
            System.out.println(slizerin1.name + " лучше Слизеринец, чем " + slizerin2.name);
        } else {
            System.out.println(slizerin2.name + " лучше Слизеринец, чем " + slizerin1.name);
        }
    }
    public static void compare (Kogtevran kogtevran1, Kogtevran kogtevran2) {
        int n1 = kogtevran1.getMudrost() + kogtevran1.getOstroumie() + kogtevran1.getTvorchestvo() + kogtevran1.getUm();
        int n2 = kogtevran2.getMudrost() + kogtevran2.getOstroumie() + kogtevran2.getTvorchestvo() + kogtevran2.getUm();
        if (n1 == n2) {
            System.out.println("Студенты Когтеврана " + kogtevran1.name + " и " + kogtevran2.name + " равны по своим качествам");
        }
        if (n1 > n2) {
            System.out.println(kogtevran1.name + " лучше Когтевранец, чем " + kogtevran2.name);
        } else {
            System.out.println(kogtevran2.name + " лучше Когтевранец, чем " + kogtevran1.name);
        }
    }
}