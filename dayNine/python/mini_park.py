from mini_parking_functions import *

enter_choice = 0

while enter_choice != 2:
    welcome_message = """
Welcome To VDM CarPark
ENTER PARK - PRESS 1
LEAVE PARK - PRESS 2
"""
    print(welcome_message)
    enter_choice = int(input())

    if enter_choice == 2:
        break
    elif enter_choice == 1:
        parking_choice = -1
        while parking_choice != 0:
            parking_message = """
To Check Available Slot - PRESS 1
To Park - PRESS 2
To Take Your Car - PRESS 3
To exit Parking Area - Press 0
"""
            print(parking_message)
            parking_choice = int(input())

            if parking_choice == 1:
                parking_space = check_parking_space()
                for index in range(len(parking_space)):
                    print("SLOT " + str(index + 1) + " -> " + parking_space[index])

            elif parking_choice == 2:
                print("Select Empty Parking Space: ")
                slot_choice = int(input("SLOT: "))

                if 1 <= slot_choice <= 20:
                    if is_slot_empty(slot_choice):
                        choose_slot(slot_choice)
                    else:
                        print()
                        print("SLOT IN USE")
                        print("Pick Another SLOT")
                else:
                    print("Invalid Parking SLOT")

            elif parking_choice == 3:
                print("Is your Car Parked Here?")
                print("YES / NO")
                car_park_choice = input()

                if car_park_choice.upper() == "YES":
                    print()
                    print("Enter SLOT Number: ")
                    user_slot = int(input())

                    if 1 <= user_slot <= 20:
                        if not is_slot_empty(user_slot):
                            check_out(user_slot)
                            print()
                            print("Have a Great Day!!!")
                        else:
                            print("Car Slot is Empty")
                    else:
                        print()
                        print("Invalid SLOT")

                elif car_park_choice.upper() == "NO":
                    print()
                    print("Please Leave Park!!!")

                else:
                    print()
                    print("Invalid Input")
            else:
                print("Invalid Input")
    else:
        print("Invalid Input")
