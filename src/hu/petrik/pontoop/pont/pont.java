package hu.petrik.pontoop.pont;

public class pont {
    private int x;
    private int y;

    public pont() {
        this.x = 0;
        this.y = 0;
    }

    public pont(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public pont(int n){
        this.x = random(n);
        this.y = random(n);
    }

    private int random(int n) {
        return (int)(Math.random()*((2*n)+1))-n;
    }
    public double getRange(){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public double getTwoRange(pont masikPont){
        return Math.sqrt(Math.pow((masikPont.x - this.x), 2) + Math.pow((masikPont.y - this.y), 2));
    }
    @Override
    public String toString() {
        //return "Pont{"+"x="+x+",y="+y+"}";
        return String.format("(%d, %d)", this.x, this.y);
    }
}