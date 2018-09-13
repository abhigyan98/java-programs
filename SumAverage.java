package assignment3;
interface Number{
	int process(int x,int y);
}
class Sum implements Number{
	public int process(int x,int y){
		return x+y;
	}
}
class Average implements Number{
	public int process(int x,int y){
		return (x+y)/2;
	}
}
public class MainClass {

	public static void main(String[] args) {
		Number a = new Sum();
		Number b = new Average();
		System.out.println("Sum : "+a.process(4,6)+" Average : "+b.process(6,4));
	}

}
