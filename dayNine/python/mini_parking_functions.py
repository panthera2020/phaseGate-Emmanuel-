parking_space = [0] * 20

space_availability = [["Empty", "Parked"], ["Empty", "Parked"], ["Empty", "Parked"], ["Empty", "Parked"],["Empty", "Parked"], ["Empty", "Parked"], ["Empty", "Parked"], ["Empty", "Parked"],["Empty", "Parked"], ["Empty", "Parked"], ["Empty", "Parked"], ["Empty", "Parked"],["Empty", "Parked"], ["Empty", "Parked"], ["Empty", "Parked"], ["Empty", "Parked"],["Empty", "Parked"], ["Empty", "Parked"], ["Empty", "Parked"], ["Empty", "Parked"]]


def check_parking_space():
    slot_available = ["","","","","","","","","","","","","","","","","","","",""]
    for index in range(len(slot_available)):
        if parking_space[index] == 0:
            slot_available[index] = space_availability[index][0]
        if parking_space[index] == 1:
            slot_available[index] = space_availability[index][1]
    return slot_available


def choose_slot(slot):
    
    if parking_space[slot - 1] == 0:
        parking_space[slot - 1] += 1


def check_out(slot):
    
    if parking_space[slot - 1] == 1:
        parking_space[slot - 1] -= 1


def is_slot_empty(slot):
    is_empty = False
    if parking_space[slot - 1] == 0:
        is_empty = True
    return is_empty
