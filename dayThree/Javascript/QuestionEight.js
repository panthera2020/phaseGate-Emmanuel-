let number = 20;

for(let count = 0; count <= number; count++){
    if(number % count == 0){
        process.stdout.write(count + " ");
    }
}

console.log();
