def power(base, exponent):
  result = str(base**exponent)
  return sum(int(i) for i in result)


base = 2
exponent = 1000
ans = power(base, exponent)
print(ans)