package Week4.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {4,3,6,8,29,1,2,4,7,8};
		List<Integer> list = new ArrayList<Integer>();
	    Set<Integer> uniqueValues = new HashSet<Integer>();
        Set<Integer> duplicateValues = new HashSet<Integer>();


        for (int num : data) {
            if (!uniqueValues.add(num)) {
                duplicateValues.add(num);
            } else {
                list.add(num);
            }
        }
      System.out.println("Duplicate values :"+duplicateValues);
      System.out.println("Removed duplicates:"+list);
      list.sort(null);
      System.out.println("Sorted :"+list);
     

      
       
	}

}
