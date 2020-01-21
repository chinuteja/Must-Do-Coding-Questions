
def subArraySum(arr,n,sum_):
    dic = {}
    curr_sum = 0
    for i in range((n)):
        curr_sum += arr[i]
        if(curr_sum == sum_):
            print("sub array is found from 0 to ",i)
            return
        if(curr_sum - sum_) in dic:
            print("sub array is found",dic[curr_sum-sum_]+1, "to",i)
            return
        dic[curr_sum] = i

def main():
    arr = [1, 4, 45, 6, 10,-8]  
    n = len(arr)  
    sum_ = 16 
    subArraySum(arr, n, sum_)
if __name__ == '__main__':
    main()