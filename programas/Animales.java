package programas;

public class Animales {
	public String color;
	public int patas;
	
public Animales(){
	this.color="cafe";
	this.patas=4;
}
 public Animales (String color, int patas) {
	 this.color = color;
	 this.patas = patas;
 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Animales a = new Animales();
	Animales b = new Animales("negro",4);
	System.out.println("Hola mundo");

	}

}
