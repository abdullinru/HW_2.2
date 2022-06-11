public class Slizerin extends Hogvarts{
    private int hitrost;
    private int reshitelnost;
    private int ambicioznost;
    private int nahodchivost;
    private int zhazhdaVlasti;

    public Slizerin(String name, int silaMagii, int rassTransgressii, int hitrost, int reshitelnost, int ambicioznost, int nahodchivost, int zhazhdaVlasti) {
        super(name, silaMagii, rassTransgressii);
        this.hitrost = hitrost;
        this.reshitelnost = reshitelnost;
        this.ambicioznost = ambicioznost;
        this.nahodchivost = nahodchivost;
        this.zhazhdaVlasti = zhazhdaVlasti;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' +
                "Факультут Слизерин \n" +
                "Качества: \n" +
                "hitrost=" + hitrost +
                ", reshitelnost=" + reshitelnost +
                ", ambicioznost=" + ambicioznost +
                ", nahodchivost=" + nahodchivost +
                ", zhazhdaVlasti=" + zhazhdaVlasti;
    }

    public void compare (Slizerin slizerin2) {
        int n1 = this.getAmbicioznost() + this.getHitrost() + this.getNahodchivost() + this.getReshitelnost() + this.getZhazhdaVlasti();
        int n2 = slizerin2.getAmbicioznost() + slizerin2.getHitrost() + slizerin2.getNahodchivost() + slizerin2.getReshitelnost() + slizerin2.getZhazhdaVlasti();
        if (n1 == n2) {
            System.out.printf("Студенты Слизенина %s и %s равны по своим качествам%n", this.name, slizerin2.name);
        }
        if (n1 > n2) {
            System.out.printf("%s лучше слизеринец , чем %s %n", this.name, slizerin2.name);
        } else {
            System.out.printf("%s лучше слизеринец, чем %s %n", slizerin2.name, this.name);
        }
    }

    public int getHitrost() {
        return hitrost;
    }

    public int getReshitelnost() {
        return reshitelnost;
    }

    public int getAmbicioznost() {
        return ambicioznost;
    }

    public int getNahodchivost() {
        return nahodchivost;
    }

    public int getZhazhdaVlasti() {
        return zhazhdaVlasti;
    }
}
