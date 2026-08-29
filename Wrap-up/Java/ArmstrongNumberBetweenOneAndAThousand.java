public class ArmstrongNumberBetweenOneAndAThousand {
    public static void main(String... args){
        
        for(int count = 1; count <= 1000; count ++){
            int storeOne = count;
            int storetwo = count;
            int product = 0;
            int sum = 0;
            int counter = 0;
            
            while(storeOne != 0){
                int digits = storeOne % 10;
                
                counter++;
                
                storeOne /= 10;
            }
            
            while(storetwo != 0){
                int digits = storetwo % 10;
                
                product = (int)Math.pow(digits, counter);
                
                sum += product;
                
                storetwo /= 10;
            }
            
            if(count == sum){
                IO.print(count + " ");
            }
        }
        
        IO.println();
    }
}
