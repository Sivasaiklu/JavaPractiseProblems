import math

n = 100

factorial = math.factorial(n)

factorial_str = str(factorial)

sum = 0

for i in factorial_str:
  i = int(i)

  sum += i

print(sum)
