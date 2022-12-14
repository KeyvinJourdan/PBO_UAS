package test;

public class Titik {
    private int x;
    private int y;

public void titik(){
    this.x = x;
    this.y = y;
    }

public int getX() {
    return x;
    }

public void setX(int x) {
    this.x = x;
    }

public int getY() {
    return y;
    }

public void setY(int y) {
    this.y = y;
    }
    
public double jarak(Titik t){
    return Math.sqrt(Math.pow(this.x - t.getX(), 2) + Math.pow(this.y - t.getY(), 2));

}
}

   
