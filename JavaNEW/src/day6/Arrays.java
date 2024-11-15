package day6;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*int a[]=new int[5];
        a[0]=100;
        a[1]=200;
        a[2]=300;
        a[3]=400;
        a[4]=500;*/
		
		//int a[]= {100,200,300,400,500};
		//System.out.println("This array has "+a.length+" values");
		/*for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}*/
		/*for(int x:a) {
			System.out.println(x);
		}*/
		int a[][]= {{100,200},{300,400},{500,600}};
		//System.out.println(a[1][1]);
		/*for(int r=0; r<3; r++) {
			for(int c=0; c<2; c++) {
				System.out.println(a[r][c]);
			}
		}*/
		for(int arr[]:a) {
			for(int x:arr) {
			  System.out.println(x);
			}
		}
	
	}

}
