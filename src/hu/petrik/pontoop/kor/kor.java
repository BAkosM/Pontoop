package hu.petrik.pontoop.kor;

public class kor {
    private int x;
    private int y;
    private double sugar;
    
    public kor(){
        this.x=0;
        this.y=0;
        this.sugar=0;
    }
    public kor(int x, int y, double sugar){
        this.x=x;
        this.y=y;
        this.sugar=0;
    }
    public kor(int n){
        this.x = random(n);
        this.y = random(n);
        this.sugar = random(n);
    }
    private int random(int n){
        return (int) (Math.random()*((2*n)+1));
    }
    public double getKerulet(){
        return ((sugar*2)*Math.PI);
    }
    public double getTerulet(){
        return ((sugar*sugar)*Math.PI);
    }
    public void setsugar(double sugar) {
        this.sugar = sugar;
    }
    @Override
    public String toString() {
        return String.format("Kör:(%d, %d) sugara: %.0f", this.x, this.y, this.sugar);
    }
}
