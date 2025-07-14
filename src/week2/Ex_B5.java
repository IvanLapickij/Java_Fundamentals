package week2;

public class Ex_B5 {

	public static void main(String[] args) {
		int x=0, w=0, y=0, z=0;
		
		x=4;
		System.out.println(++x);//x=5
		System.out.println(x++);//x=5
		System.out.println(x);//x=6
		System.out.println(--x);//x=5
		System.out.println(x--);//x=5
		System.out.println(x);//x=4
		
		w=20; x=10; y-=5; z=0;// declaring values
		System.out.println(w==x && y!=z);//
		System.out.println(w==x || y!=z);//
		System.out.println(!(w==(x+z)));//
		
	}

}
