def twoSum(array,sum_,n):
    set_ = set()
    # for i in array:
    #     set_.add(i)
    # flag = True
    for i in range(n):
        temp = sum_ - array[i]
        if temp in set_:
            print("sum exits and the pair is ",str(temp)," ",array[i])
            # return
            # flag = False
        set_.add(array[i])
    
    print("sum does exits")
def main():
    n = int(input())
    array = []
    for i in range(n):
        array.append(int(input()))
    sum_ = int(input())
    twoSum(array,sum_,n)
if __name__ == '__main__':
    main()
"""
"""
