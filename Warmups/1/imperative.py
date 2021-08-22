grades = list(map(int , input().split()))
sum_higher = 0
higher = 0

for i in range(len(grades)):
	for j in range(1 , len(grades) - i):
		if(grades[i] > grades[i + j]):
			higher += 1
		sum_higher += higher
		higher = 0

print(sum_higher)