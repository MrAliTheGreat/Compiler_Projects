def sum_higher(grades , start , end):
	if(start >= end):
		return find_num_higher(grades , grades[start] , start + 1 , end + 1)
	return sum_higher(grades , start + 1 , end) + find_num_higher(grades , grades[start] , start + 1 , end + 1)

def find_num_higher(grades , current_grade , low , high):
	if(low >= high):
		return 0
	
	if(current_grade > grades[low]):
		return 1 + find_num_higher(grades , current_grade , low + 1 , high)

	return find_num_higher(grades , current_grade , low + 1 , high)

grades = list(map(int , input().split()))

print(sum_higher(grades , 0 , len(grades) - 1))