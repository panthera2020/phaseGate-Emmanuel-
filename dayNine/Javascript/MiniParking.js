let parkingSpace = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0];
let spaceAvailability = [["Empty","Parked"], ["Empty","Parked"], ["Empty","Parked"], ["Empty","Parked"],["Empty","Parked"], ["Empty","Parked"], ["Empty","Parked"], ["Empty","Parked"],["Empty","Parked"], ["Empty","Parked"], ["Empty","Parked"], ["Empty","Parked"],["Empty","Parked"], ["Empty","Parked"], ["Empty","Parked"], ["Empty","Parked"],["Empty","Parked"], ["Empty","Parked"], ["Empty","Parked"], ["Empty","Parked"]];

let checkParkingSpace=()=>{
    let slotAvailable = ["","","","","","","","","","","","","","","","","","","",""];
    for (let index = 0; index < parkingSpace.length; index++) {
        if (parkingSpace[index] === 0) {
            slotAvailable[index] = spaceAvailability[index][0];
        }
        if (parkingSpace[index] === 1) {
            slotAvailable[index] = spaceAvailability[index][1];
        }
    }
    return slotAvailable;
};

let chooseSlot=(slot)=>{
    if (parkingSpace[slot - 1] === 0) {
        parkingSpace[slot - 1]++;
    }
};

let checkOut=(slot)=>{
    if (parkingSpace[slot - 1] === 1) {
        parkingSpace[slot - 1]--;
    }
};


let isSlotEmpty=(slot)=>{
    let isEmpty = false;
    if (parkingSpace[slot - 1] === 0) {
        isEmpty = true;
    }
    return isEmpty;
};





let scanner = require("prompt-sync")();

let enterChoice = 0;
while (enterChoice != 2) {
    let welcomeMessage = `
Welcome To VDM CarPark
ENTER PARK - PRESS 1
LEAVE PARK - PRESS 2
`;
    console.log(welcomeMessage);
    enterChoice = Number(scanner());

    if (enterChoice === 2) {
        break;
    }
    else if (enterChoice === 1) {
        let parkingChoice = -1;
        while (parkingChoice !== 0) {
            let parkingMessage = `
To Check Available Slot - PRESS 1
To Park - PRESS 2
To Take Your Car - PRESS 3
To exit Parking Area - Press 0
`;
            console.log(parkingMessage);
            parkingChoice = Number(scanner());

            switch (parkingChoice) {
                case 1: {
                    let parkingSpace = checkParkingSpace();
                    for (let index = 0; index < parkingSpace.length; index++) {
                        console.log("SLOT " + (index + 1) + " -> " + parkingSpace[index]);
                    }
                    break;
                }
                case 2: {
                    console.log("Select Empty Parking Space: ");
                    let slotChoice = scanner("SLOT: ");

                    if (slotChoice >= 1 && slotChoice <= 20) {
                        if (isSlotEmpty(slotChoice)) {
                            chooseSlot(slotChoice);
                        } else {
                            console.log();
                            console.log("SLOT IN USE");
                            console.log("Pick Another SLOT");
                        }
                    } else {
                        console.log("Invalid Parking SLOT");
                    }
                    break;
                }
                case 3: {
                    console.log("Is your Car Parked Here?");
                    console.log("YES / NO");
                    let carParkChoice = scanner("");

                    if (carParkChoice.toUpperCase() === "YES") {
                        console.log();
                        console.log("Enter SLOT Number: ");
                        let userSlot = scanner("");

                        if (userSlot >= 1 && userSlot <= 20) {
                            if (!isSlotEmpty(userSlot)) {
                                checkOut(userSlot);
                                console.log();
                                console.log("Have a Great Day!!!");
                                break;
                            } else {
                                console.log("Car Slot is Empty");
                            }
                        } else {
                            console.log();
                            console.log("Invalid SLOT");
                        }
                    }
                    else if (carParkChoice.toUpperCase() === "NO") {
                        console.log();
                        console.log("Please Leave Park!!!");
                        break;
                    }
                    else {
                        console.log();
                        console.log("Invalid Input");
                    }
                    break;
                }                case 0:
                    break;
                default:
                    console.log("Invalid Input");
            }
        }
    }
    else {
        console.log("Invalid Input");
    }
}
