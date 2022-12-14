
package test;

public class KucingDanTIkus {
    public static void kucingDanTikus(int x, int y, int z) {
    if(Math.abs(z - x) > Math.abs( z- y)){
        System.out.println("Cat B");
        
    }else if(Math.abs(z - x) == Math.abs( z- y)){
        System.out.println("Mouse C");
        
    }else{
        System.out.println("Cat A");
    }
}
}
