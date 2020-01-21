def func(array_1,array_2,sum_):
    set_ =set();
    for i in array_1:
        set_.add(i)
    for j in array_2:
        temp_ = sum_ - j
        if temp_ in set_:
            print(temp_,j)  
            break

def main():
    array_1 = [-1,3,8,2,5,0]
    array_2 = [4,1,2,10,5,20]
    sum_ = 25
    func(array_1,array_2,sum_)
if __name__ == '__main__':
    main()