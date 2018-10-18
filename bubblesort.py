from random import randint

def bubble_sort(a):
    for i in range (len (a) - 1 ):
        swapped = False
        for j in range (len (a) - 1):
            if a [j] > a [j + 1]:
                swap = a[j]
                a[j] = a [j + 1]
                a [j + 1] = swap
                swapped = True
            
        if not swapped:
            break

def insertion_sort(a):
    for i in range (1 , len(a)):
        x = a[i]
        index_hole = i
        while index_hole > 0 and a [index_hole - 1] > x:
            a [index_hole] = a[index_hole - 1]
            index_hole -= 1
        a[index_hole] = x    

def quick_sort(a):
    if len(a) == 1:
        return a
    else:
        pivot = a[0]
        for i in range (len(a) ):
            if a[i] < pivot:
                less_subarray = a[i]
            else:
                greater_subarray = a[i]    
            return quick_sort(less_subarray) + pivot + quick_sort(greater_subarray)           
    

a = [randint (1, 1000) for i in range (10)]
print (a)
quick_sort(a)
print (a)
