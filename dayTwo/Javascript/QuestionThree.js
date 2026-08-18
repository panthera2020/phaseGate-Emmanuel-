let sum = 0;

for(let count = 1; count <= 100; count++){
    let number = count;
    while(number > 0){
        let digit = number % 10;
        sum += digit;
        number = Math.floor(number / 10);
    }
    if(sum % 3 != 0){
        process.stdout.write(count + " ");
    }
}
