let sum = 0;

for(let count = 1; count <= 1000; count++){
    sum = 0;
    for(let index = 1; index < count; index++){
        if(count % index == 0){
            sum += index;
        }
    }
    
    if(count == sum){
        console.log(count + " ");
    }
}
