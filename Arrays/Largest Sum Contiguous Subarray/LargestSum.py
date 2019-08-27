def func(array):
    max_far = -100000000
    max_end = 0
    for i in range(len(array)):
        max_end += array[i]
        if max_far < max_end:
            max_far = max_end
        if max_end < 0:
            max_end = 0
    print(max_far)


def main():
    arr = [-2, -5, 6, -2, -3, 1, 5, -6]
    func(arr)
if __name__ == '__main__':
    main() 
