public class Puffenduj extends Hogvarts{
    private int trudolyubie;
    private int vernost;
    private int chestnost;

    public Puffenduj(String name, int silaMagii, int rassTransgressii, int trudolyubie, int vernost, int chestnost) {
        super(name, silaMagii, rassTransgressii);
        this.trudolyubie = trudolyubie;
        this.vernost = vernost;
        this.chestnost = chestnost;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' +
                "Факультут Пуфендуй \n" +
                "Качества: \n" +
                "trudolyubie=" + trudolyubie +
                ", vernost=" + vernost +
                ", chestnost=" + chestnost;
    }

    public void compare (Puffenduj puffenduj2) {
        int n1 = this.getChestnost() + this.getTrudolyubie() + this.getVernost();
        int n2 = puffenduj2.getChestnost() + puffenduj2.getTrudolyubie() + puffenduj2.getVernost();
        if (n1 == n2) {
            System.out.printf("Студенты Пуффендуя %s и %s равны по своим качествам%n", this.name, puffenduj2.name);
        }
        if (n1 > n2) {
            System.out.printf("%s лучше пуффендуец , чем %s %n", this.name, puffenduj2.name);
        } else {
            System.out.printf("%s лучше пуффендуец, чем %s %n", puffenduj2.name, this.name);
        }
    }

    public int getTrudolyubie() {
        return trudolyubie;
    }

    public int getVernost() {
        return vernost;
    }

    public int getChestnost() {
        return chestnost;
    }
}
