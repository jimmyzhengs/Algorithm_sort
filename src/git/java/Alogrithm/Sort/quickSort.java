package git.java.Alogrithm.Sort;
/**
 * @author sen zheng
 * @category Sort.QuickSort
 * @Date 2014 April 18
 * @Location Portland, USA
 * @Description : Implement the QuickSort Algorithm
 * 
 * pesudo code: 
 *           sort(array A){
 *                int pivot;
 *                sort(firstHalf);
 *                sort(secondHalf);
 *           }
 */
public class quickSort {
    public quickSort(int [] list){
    	quickSort(list, 0, list.length - 1);
    }
    
    public void quickSort(int [] list, int first, int last){
    	if(last > first){
    	int pivotIndex = patition(list, first, last);
    	quickSort(list, first, pivotIndex-1);
    	quickSort(list, pivotIndex+1, last);
    	}
    }
    
    public int patition(int [] list, int first, int last){
    	int pivot = list[first];
    	
    	int low = first + 1;
    	int high = last;
    	
    	while(low < high){
    		
    		while(low <= high && list[low] <= pivot)
    			low ++;
    		//move to the right until hit the condition: pivot < list [low] 
    		
    		while(low <= high && list[high] > pivot )
    			high --;
    		
    		if(low < high)
    		{
    			int temp = list[low];
    			list[low] = list[high];
    			list[high] = temp;
    	   }
    	}
    	
    	while (high > first && list[high] >= pivot)
    		high --;
    	
    	if(list[high] < pivot){
    		list[first] = list [high];
    		list[high] = pivot;
    		return high;
    	}else{
    		return first;
    	}
       
    }
    
    
}
