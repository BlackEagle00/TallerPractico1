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

a = [randint (1, 1000) for i in range (20)]
print (a)
bubble_sort(a)
print (a)       
