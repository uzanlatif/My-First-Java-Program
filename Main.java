import java.util.*;  
import java.util.Scanner; 

public class Main {

	//ini namanya method
	static void hitung(int x, int y){
		float sum= x+y;
		float av= sum/2;
		System.out.println("Hasil = " + av);
	}

   public static void main(String[] args) {
   		Boolean loop=true;

   		while(loop){
   		Scanner sc = new Scanner(System.in);
		String aw,p;
		Integer nim,usia,uts,uas;
		//input
		System.out.println("Input Nama :");
		aw = sc.nextLine();
		System.out.println("Input Nim :");
		nim = sc.nextInt();
		System.out.println("Input Usia :");
		usia = sc.nextInt();
		System.out.println("Input Uts :");
		uts = sc.nextInt();
		System.out.println("Input Uas :");
		uas = sc.nextInt();
		
		Mahasiswa m = new Mahasiswa(aw, nim,usia,uts,uas);
		System.out.println("Nama = " + m.Name);
		System.out.println("Nim = " + m.Nim);
		System.out.println("Usia = " + m.Usia);
		System.out.println("Uts = " + m.Uts);
		System.out.println("Uas = " + m.Uas);

		hitung(m.Uts,m.Uas);

		System.out.println("Edit data?(y)");
		Scanner lmao = new Scanner(System.in);
		p = lmao.nextLine();
		System.out.println(p);

		if("y".equals(p)){
			System.out.println("Loop");
			loop=true;
		}
		else{
			System.out.println("Terimakasih");
			loop=false;
		}

   	}
   		
   }
}
