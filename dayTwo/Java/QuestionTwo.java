public class QuestionTwo {
    public static void main(String... args){
        
        int valueOfX = 2;
        int valueOfY = 5;
        int valueOfZ = 3;
        int store = 0;
        
        int mean = (valueOfX + valueOfY + valueOfZ) / 3;
        
        System.out.println(mean);  
        
        if(mean == valueOfX){
            System.out.println("Mean = x");
        }
        if(mean == valueOfY){
            System.out.println("Mean = y");
        }
        if(mean == valueOfZ){
            System.out.println("Mean = z");
        }
        
            
       int median = 0;
        
        if(valueOfX < valueOfY && valueOfX < valueOfZ){
            if(valueOfY < valueOfZ){
                median = valueOfY;
            }
            if(valueOfZ < valueOfY){
                median = valueOfZ;
            }
        }
        
        if(valueOfY < valueOfX && valueOfY < valueOfZ){
            if(valueOfX < valueOfZ){
                median = valueOfX;
            }
            if(valueOfZ < valueOfX)
                median = valueOfZ;
        }
        
        if(valueOfZ < valueOfX && valueOfZ < valueOfY){
            if(valueOfY < valueOfX){
                median = valueOfY;
            }
            if(valueOfX < valueOfY){
                median = valueOfX;
            }
        }
             
        System.out.println(median);  
       
        if(median == valueOfX){
            System.out.println("Median = x");
        }
        if(median == valueOfY){
            System.out.println("Median = y");
        }
        if(median == valueOfZ){
            System.out.println("Median = z");
        }
    }
}
