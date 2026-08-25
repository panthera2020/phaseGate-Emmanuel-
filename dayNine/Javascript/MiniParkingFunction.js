
let parkingSpace = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0];
let spaceAvailability = [["Empty","Parked"], ["Empty","Parked"], ["Empty","Parked"], ["Empty","Parked"],["Empty","Parked"], ["Empty","Parked"], ["Empty","Parked"], ["Empty","Parked"],["Empty","Parked"], ["Empty","Parked"], ["Empty","Parked"], ["Empty","Parked"],["Empty","Parked"], ["Empty","Parked"], ["Empty","Parked"], ["Empty","Parked"],["Empty","Parked"], ["Empty","Parked"], ["Empty","Parked"], ["Empty","Parked"]];

let checkParkingSpace=()=>{
    let slotAvailable = [["","","","","","","","","","","","","","","","","","","",""];
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
