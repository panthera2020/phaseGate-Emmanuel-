
for(let count = 1; count <= 100; count++){
    if(count % 3 == 0){
        process.stdout.write("hello ");
    }else if(count % 5 == 0){
        process.stdout.write("world ");
    }else if(count % 7 == 0){
        process.stdout.write("orions ");
    }else{
        let reverse = 0;
        let number = count;
        while(number > 0){
            let digit = number % 10;
            reverse = (reverse * 10) + digit;
            number = Math.floor(number / 10);
        }   
        
        process.stdout.write(reverse + " ");
    }
}
