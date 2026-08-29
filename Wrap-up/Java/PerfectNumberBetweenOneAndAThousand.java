public class PerfectNumberBetweenOneAndAThousand {
    public static void main(String... args){
    
        int sum = 0;
    
        for(int count = 1; count <= 1000; count++){
            sum = 0;
            for(int index = 1; index < count; index++){
                if(count % index == 0){
                    sum += index;
                }
            }
            
            if(count == sum){
                IO.print(count + " ");
            }
        }
        
        IO.println();
    }
}
