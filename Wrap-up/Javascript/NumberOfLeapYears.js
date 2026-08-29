let counter = 0;

for(let years = 1900; years <= 2025; years++){
    if(years % 4 == 0 && years % 100 != 0 || years % 400 == 0){
        counter++;
    }
}

console.log("The Number of Leap Years Between 1900 and 2025 is " + counter);
