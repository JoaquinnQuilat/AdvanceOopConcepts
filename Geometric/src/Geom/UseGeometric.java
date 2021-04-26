package Geom;
import java.util.Arrays;


public class UseGeometric {
    public static void main(String[] args){
        GeometricFigure figures[] = new GeometricFigure[2];
        Square s= new Square (10,10);
        Triangle t= new Triangle (10,15);

    figures[0]=s;
    figures[1]=t;
    System.out.println(Arrays.toString(figures));


    }


}
