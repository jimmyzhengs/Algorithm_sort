package git.java.Alogrithm.Sort;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int [] a={4,3,7,6,1};
         
         quickSort qs = new quickSort(a);
         
         for (int i=0;i<a.length;i++)
         {
        	 System.out.print(a[i] + ",");
         }
	}

}
