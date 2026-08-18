valueOfX = 2
valueOfY = 5
valueOfZ = 3


mean = (valueOfX + valueOfY + valueOfZ) // 3

print(mean)

if(mean == valueOfX){
    print("Mean = x")
}
if(mean == valueOfY){
    print("Mean = y")
}
if(mean == valueOfZ){
    print("Mean = z")
}
    
median = 0

if(valueOfX < valueOfY and valueOfX < valueOfZ):
    if(valueOfY < valueOfZ):
        median = valueOfY
    
    if(valueOfZ < valueOfY):
        median = valueOfZ;
    

if(valueOfY < valueOfX and valueOfY < valueOfZ):
    if(valueOfX < valueOfZ):
        median = valueOfX;
    
    if(valueOfZ < valueOfX):
        median = valueOfZ


if(valueOfZ < valueOfX and valueOfZ < valueOfY):
    if(valueOfY < valueOfX):
        median = valueOfY
    
    if(valueOfX < valueOfY):
        median = valueOfX
    

       
print(median)

if(median == valueOfX){
    print("Median = x");
}
if(median == valueOfY){
    print("Median = y");
}
if(median == valueOfZ){
    print("Median = z");
}
