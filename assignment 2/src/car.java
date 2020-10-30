
public class car {
	String color= "brown";
	String type="altroz";
	static int car_count=1;
	{
		car_count ++;
		int id=car_count;
	}
static void start()
{
	System.out.println("Gets started");
}
void spec(String color,String type) {
	this.color=color;
	this.type=type;
	System.out.println("this is a "+" "+ color +" " +type);
	
}
public static void main(String[] args) {
	car mycar = new car();
	mycar.spec("brown","altroz");
	car.start();
	
	
}
}