MORSE_CODE_DICT = { 'A':'.-', 'B':'-...', 
                    'C':'-.-.', 'D':'-..', 'E':'.', 
                    'F':'..-.', 'G':'--.', 'H':'....', 
                    'I':'..', 'J':'.---', 'K':'-.-', 
                    'L':'.-..', 'M':'--', 'N':'-.', 
                    'O':'---', 'P':'.--.', 'Q':'--.-', 
                    'R':'.-.', 'S':'...', 'T':'-', 
                    'U':'..-', 'V':'...-', 'W':'.--', 
                    'X':'-..-', 'Y':'-.--', 'Z':'--..'}


def function(array):
	global MORSE_CODE_DICT
	list_ = []
	for word in array:
		string = ""
		for i in word:
			string += MORSE_CODE_DICT[i.upper()]
		list_.append(string)
		# print("string",string)
	set_ = set()
	for char  in list_ :
		set_.add(char)
	print(len(set_))

def main():
	n = int(input())
	l = []
	for i in range(n):
		l.append(input())
	function(l)
if __name__ == '__main__':
	main()