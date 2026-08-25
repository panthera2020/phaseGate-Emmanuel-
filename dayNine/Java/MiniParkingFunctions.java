public class MiniParkingFunctions {
    private int [] parkingSpace;
    private String [][] spaceAvailability;
    
    public MiniParkingFunctions(){
        int [] parkingSpace = new int [20];
        String [][] spaceAvailability = {{"Empty","Parked"},{"Empty","Parked"},{"Empty","Parked"},{"Empty","Parked"},{"Empty","Parked"},{"Empty","Parked"},{"Empty","Parked"},{"Empty","Parked"},{"Empty","Parked"},{"Empty","Parked"},{"Empty","Parked"},{"Empty","Parked"},{"Empty","Parked"},{"Empty","Parked"},{"Empty","Parked"},{"Empty","Parked"},{"Empty","Parked"},{"Empty","Parked"},{"Empty","Parked"},{"Empty","Parked"}};
        
        this.parkingSpace = parkingSpace;
        this.spaceAvailability = spaceAvailability; 
    }
    
    
    public String[] checkParkingSpace(){
        String [] slotAvailable = new String[20];
        for(int index = 0; index < parkingSpace.length; index++){
            if(parkingSpace[index] == 0){
                slotAvailable[index] = spaceAvailability[index][0];
            }
            if(parkingSpace[index] == 1){
                slotAvailable[index] = spaceAvailability[index][1];
            }
        }
        
    return slotAvailable;
    }
    
    public void chooseSlot(int slot){
        if(parkingSpace[slot - 1] == 0){
            this.parkingSpace[slot - 1]++;
        }
    }
    
    public void checkOut(int slot){
        if(parkingSpace[slot - 1] == 1){
            this.parkingSpace[slot - 1]--;
        }
    }
    
    public boolean isSlotEmpty(int slot){
        boolean isEmpty = false;
        if(parkingSpace[slot - 1] == 0){
            isEmpty = true;
        }
    return isEmpty;
    }
}
