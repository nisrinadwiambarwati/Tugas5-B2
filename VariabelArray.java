import java.util.Scanner;
public class VariabelArray{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int i,n,sum=0;
		/* 	i as jumlah data dalam array
			n as batas akhir input array
			sum as untuk menjumlahkan semua data dalam array
		*/
		
		System.out.print("Masukkan Jumlah bilangan : ");
		n=input.nextInt();
		
		int[] A = new int[100];

		System.out.println("\ninput "+ n +" bilangan ");
		for(i=1; i <= n; i++){
			System.out.print("\nbil ke-"+i+ " = ");
			A[i] = input.nextInt();
			sum = sum + A[i];
		}
		
		System.out.println("\nterbentuk array : ");
		for(i=1; i <= n; i++){
			System.out.print(A[i] + " ");
		}
	
		System.out.print("\n\nHasil Penjumlah : "+ sum);
		
	}
}