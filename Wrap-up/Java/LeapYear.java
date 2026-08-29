public class LeapYear {
    public static void main(String... args){
        
        for(int years = 1900; years <= 2025; years++){
            if(years % 4 == 0 && years % 100 != 0 || years % 400 == 0){
                IO.print(years + " ");
            }
        }
        
        IO.println();
    }
}
