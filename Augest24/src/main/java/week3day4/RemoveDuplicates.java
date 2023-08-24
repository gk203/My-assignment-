package week3day4;

public class RemoveDuplicates {

	public static void main(String[] args) {
       
        String text = "We learn java basics as part of java sessions in java week1";
       
        String[] words = text.split(" ");
        
        for (int i = 0; i < words.length; i++) {
        	
        	int count = 0;
        	
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                   
                }
            }
            if (count > 1) {
                for (int j = 0; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        words[j] = "";
                        
                    }
                }
            }
        }
        
        String result = "";
        for (String word : words) {
            if (!word.equals("")) {
                result += word + " ";
            }
        }
        
        result = result.trim();
        
        System.out.println("The given input is : "+text);
       
        System.out.println("The result :         "+result);
     
        
     
	}

}
