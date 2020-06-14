import math
def main():
    num=3
    denom=2
    result=0
    for i in range(1,1000):
        num=2*denom+num
        denom = num-denom
        if math.trunc(math.log10(num)) > math.trunc(math.log10(denom)):
            result = result+1
    print(result)
if __name__ == "__main__":
    main()