package animationGame;

public class SimpleSquare extends GeometricObject{
public SimpleSquare (double w, double h, Vertex pos){
super (w,h,pos);
}
public SimpleSquare (double w, double h, double x, double y){
super (w,h, new Vertex(x,y));
}
@Override public double area(){
	return width*height;
}
@Override public String toString (){
return "SimpleSquare("+super.toString()+")";
}
@Override public boolean equals (Object that){
	return (that instanceof SimpleSquare && super.equals(that));
}
}