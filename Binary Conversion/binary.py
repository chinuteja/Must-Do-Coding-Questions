def binaryConversion(n):
	binary_ =[]
	while(n>0):
		binary_.append(n%2)
		n = n//2
	# print(binary_)
	binary_ = binary_[::-1]
	# print(binary_)
	num = ""
	for i in binary_:
		num += str(i)
	print(num)
		
def main():
	n = int(input())
	binaryConversion(n)
if __name__ == '__main__':
	main()