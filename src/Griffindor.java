public class Griffindor extends Hogvarts{
    private int blagorodstvo;
    private int chest;
    private int hrabrost;


    public Griffindor(String name, int silaMagii, int rassTransgressii, int blagorodstvo, int chest, int hrabrost) {
        super(name, silaMagii, rassTransgressii);
        this.blagorodstvo = blagorodstvo;
        this.chest = chest;
        this.hrabrost = hrabrost;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' +
                "Факультут Гриффиндор \n" +
                "Качества: \n" +
                "blagorodstvo=" + blagorodstvo +
                ", chest=" + chest +
                ", hrabrost=" + hrabrost;
    }
    public void compare (Griffindor griffindor2) {
        int n1 = this.getBlagorodstvo() + this.getChest() + this.getHrabrost();
        int n2 = griffindor2.getBlagorodstvo() + griffindor2.getChest() + griffindor2.getHrabrost();
        if (n1 == n2) {
            System.out.printf("Студенты Гриффиндора %s и %s равны по своим качествам%n", this.name, griffindor2.name);
        }
        if (n1 > n2) {
            System.out.printf("%s лучше Гриффиндорец, чем %s %n", this.name, griffindor2.name);
        } else {
            System.out.printf("%s лучше Гриффиндорец, чем %s %n", griffindor2.name, this.name);
        }
    }

    public int getBlagorodstvo() {
        return blagorodstvo;
    }

    public int getChest() {
        return chest;
    }

    public int getHrabrost() {
        return hrabrost;
    }
}
