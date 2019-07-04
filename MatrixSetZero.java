import java.util.*;
public class MatrixSetZero {
   public static void solve(int arr[][]){
	   int x[] =new int[3];
	   int y[] =new int[3];
	   for(int i=0;i<3;i++){
		   for(int j=0;j<3;j++){
			   if(arr[i][j] ==0){
				   x[i] =1;
			       y[j] =1;
			   }
		   }
	   }
	   for(int i=0;i<3;i++){
		   for(int j=0;j<3;j++){
			   if((x[i] ==1) || (y[j] ==1)){
				 arr[i][j] =0;
			   }
		   }
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
        int a[][] =new int[3][3];
        for(int i=0;i<3;i++){
        	for(int j=0;j<3;j++){
        		a[i][j] =sc.nextInt();
        	}
        }
        solve(a);
        for(int i=0;i<3;i++){
        	for(int j=0;j<3;j++){
        		System.out.print(a[i][j]+" ");
        	}
        	System.out.println();
        }
	}

}
