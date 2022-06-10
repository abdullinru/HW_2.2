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
