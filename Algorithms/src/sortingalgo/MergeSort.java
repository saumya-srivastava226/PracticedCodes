package sortingalgo;
import java.lang.*;
public class MergeSort {
		public static void main(String args[]) {
			int [] intArray= {20,35,-15,7,55,1,-22};
			mergeSort(intArray,0,intArray.length);
			
			for(int i=0;i<intArray.length;i++) {
				System.out.println(intArray[i]);
				
			}
		}
		
		public static void mergeSort(int [] input,int start,int end) {
			// one element array, then do not split
			if(end-start<2) {
				return;
				
				
			}
			// We need to do the logical partitioning
			int mid=(start+end)/2;
			mergeSort(input,start,mid);
			mergeSort(input,mid,end);
			
			// Now splitting is done
			// merging needs to be done
			
			merge(input,start,mid,end);
			
			
			
		}
		
		public static void merge(int[] input,int start,int mid,int end) {
			
			//i=first index of left array
			//j= first index of right array
			if(input[mid-1]<=input[mid]) {
				return;
			}
			int i=start;
			int j=mid;
			int tempIndex=0;// index of temporary array
			
			int[] temp=new int[end-start];
			while(i<mid&&j<end) {
				temp[tempIndex++]=input[i]<=input[j]?input[i++]:input[j++];
				
				
				
				
			}
			System.arraycopy(input,i,input,start+tempIndex,mid-1);
			System.arraycopy(temp,0,input,start,tempIndex);
			
			
		}
		
}
