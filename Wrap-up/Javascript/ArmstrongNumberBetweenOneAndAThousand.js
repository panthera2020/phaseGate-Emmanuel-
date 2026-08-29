for(let count = 1; count <= 1000; count ++){
    let storeOne = count;
    let storetwo = count;
    let product = 0;
    let sum = 0;
    let counter = 0;
    
    while(storeOne != 0){
        let digits = storeOne % 10;
        
        counter++;
        
        storeOne = Math.floor(storeOne / 10);
    }
    
    while(storetwo != 0){
        let digits = storetwo % 10;
        
        product = Math.pow(digits, counter);
        
        sum += product;
        
        storetwo = Math.floor(storetwo / 10);
    }
    
    if(count == sum){
        console.log(count + " ");
    }
}

