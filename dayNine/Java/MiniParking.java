import java.util.Scanner;

public class MiniParking {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        MiniParkingFunctions park = new MiniParkingFunctions();
        int enterChoice = 0;
        
        while(enterChoice != 2){
        
            String welcomeMessage = """ 
                Welcome To VDM CarPark

                ENTER PARK - PRESS 1
                LEAVE PARK - PRESS 2

            """;
            
            System.out.println(welcomeMessage);
            enterChoice = input.nextInt();
            if(enterChoice == 2){
            break;
            }
            else if(enterChoice == 1){
                int parkingChoice = -1;
                while(parkingChoice != 0){
                    String parkingMessage = """ 

To Check Available Slot - PRESS 1
To Park - PRESS 2
To Take Your Car - PRESS 3
To exit Parking Area - Press 0

                    """;
                    
                    System.out.println(parkingMessage);
                    parkingChoice = input.nextInt();
                    
                    switch(parkingChoice){
                        case 1: 
                            String [] parkingSpace = park.checkParkingSpace();
                            for(int index = 0; index < parkingSpace.length; index++){
                                System.out.println("SLOT " + (index + 1) + " -> " + parkingSpace[index]);
                            }
                            break;
                        case 2:
                            System.out.println("Select Empty Parking Space: ");
                            System.out.print("SLOT: ");
                            int slotChoice = input.nextInt();
                            
                            input.nextLine();
                            
                            if(slotChoice >= 1 && slotChoice <= 20){
                                park.chooseSlot(slotChoice);
                            }else{
                                System.out.println("Invalid Parking SLOT");
                            }
                            break;
                        case 3:
                            System.out.println("Is your Car Parked Here?");
                            System.out.println("YES / NO");
                            input.nextLine();
                            String carParkChoice = input.nextLine();
                            
                            if(carParkChoice.equalsIgnoreCase("YES")){   
                                System.out.println();                             
                                System.out.println("Enter SLOT Number: ");
                                int userSlot = input.nextInt();
                                if(userSlot >= 1 && userSlot <= 20){
                                    if(park.isSlotEmpty(userSlot)){                                
                                        park.checkOut(userSlot);
                                        System.out.println();
                                        System.out.println("Have a Great Day!!!");
                                        break;
                                    }else{
                                    System.out.println();
                                        System.out.println("SLOT IN USE");
                                        System.out.println("Pick Another SLOT");
                                    }
                                }
                                else{
                                    System.out.println();
                                    System.out.println("Invalid SLOT");
                                }
                            }
                            else if(carParkChoice.equalsIgnoreCase("NO")){
                                System.out.println();
                                System.out.println("Please Leave Park!!!");
                                break;
                            }
                            else{
                                System.out.println();
                                System.out.println("Invalid Input");
                            }
                            break;
                        case 0: 
                            break;
                        default:
                            System.out.println("Invalid Input");
                    }
                
                }
            }
            else{
                System.out.println("Invalid Input");
            }
        }
    
    }
}
