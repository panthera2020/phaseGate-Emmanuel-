valueOfN = 1122333145;

store = 0;
counterStore = 0;
counter = 0;
consecutiveDigits = "";
longestRun = "";
number = valueOfN;

while(number > 0):

    digit = number % 10;
    if(digit == store):
        counter += 1
        digitString = str(digit)
        consecutiveDigits += digitString
    else:
        digitString = str(digit)
        consecutiveDigits = "" + digitString
        counter = 1
    
    
    if(counter > counterStore):
        counterStore = counter;
        longestRun = consecutiveDigits;
    
    
    store = digit;
    number = number // 10

print("longest run is ", longestRun, " lenght ", len(longestRun));
