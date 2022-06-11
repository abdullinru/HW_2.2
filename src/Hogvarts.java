public class Hogvarts {
    String name;
    int silaMagii;
    int rassTransgressii;

    public Hogvarts(String name, int silaMagii, int rassTransgressii) {
        this.name = name;
        this.silaMagii = silaMagii;
        this.rassTransgressii = rassTransgressii;
    }

    public void compare (Hogvarts hogvarts2) {
        if (this.silaMagii == hogvarts2.silaMagii) {
            System.out.printf("У студентов %s и %s сила магии равна%n", this.name, hogvarts2.name);
        }
        if (this.silaMagii > hogvarts2.silaMagii) {
            System.out.printf("У студента %s сила магии больше, чем у %s %n", this.name, hogvarts2.name);
        } else {
            System.out.printf("У студента %s сила магии больше, чем у %s %n", hogvarts2.name, this.name);
        }
        if (this.rassTransgressii == hogvarts2.rassTransgressii) {
            System.out.printf("У студентов %s и %s рассточние трансгрессии равно %n", this.name, hogvarts2.name);
        }
        if (this.rassTransgressii > hogvarts2.rassTransgressii) {
            System.out.printf("У студента %s рассточние трансгрессии больше, чем у %s %n", this.name, hogvarts2.name);
        } else {
            System.out.printf("У студента %s рассточние трансгрессии больше, чем у %s %n", hogvarts2.name, this.name);
        }

    }

    @Override
    public String toString() {
        return "Студент Хогвартса " + name + "\n" +
                "сила магии: " + silaMagii + ", расстояние трансгрессии: " + rassTransgressii;
    }
}
