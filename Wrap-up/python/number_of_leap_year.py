counter = 0

for years in range (1900, 2026):
    if(years % 4 == 0 and years % 100 != 0 or years % 400 == 0):
        counter += 1
    

print("The Number of Leap Years Between 1900 and 2025 is ", counter);
