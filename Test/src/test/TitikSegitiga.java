public class Titik {

private int x;
private int y;

public Titik(int x, int y) {
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

public double jarak(Titik o){
return Math.sqrt(Math.pow(this.x - o.getX(), 2) + Math.pow(this.y - o.getY(), 2));
}
}

public class SegiTiga {
private Titik A;
private Titik B;
private Titik C;

public Titik getA() {
return A;
}

public void setA(Titik A) {
this.A = A;
}

public Titik getB() {
return B;
}

public void setB(Titik B) {
this.B = B;
}

public Titik getC() {
return C;
}

public void setC(Titik C) {
this.C = C;
}

public double keliling(){
return (A.jarak(B) + B.jarak(C) + C.jarak(A));

}
}