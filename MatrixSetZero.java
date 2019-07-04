import java.util.*;
public class Solution {
		public void setZeroes(ArrayList<ArrayList<Integer>> a) {
		    int y[] =new int[a.get(0).size()];
		    int x[] =new int[a.size()];
		    for(int i=0;i<a.size();i++){
		        for(int j=0;j<a.get(i).size();j++){
		            if(a.get(i).get(j) ==0){
		                x[i] =1;
		                y[j] =1;
		            }
		        }
		    }
		     for(int i=0;i<a.size();i++){
		        for(int j=0;j<a.get(i).size();j++){
		            if(x[i] ==1 || y[j] ==1)
		              a.get(i).set(j,0);
		        }         
		   }
		}
	}
