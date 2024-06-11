import numpy as np

# Creating arrays
a = np.array([1, 2, 3])
b = np.array([4, 5, 6])

# Array operations
sum_array = a + b
dot_product = np.dot(a, b)
elementwise_product = a * b

print("Array a:", a)
print("Array b:", b)
print("Sum of a and b:", sum_array)
print("Dot product of a and b:", dot_product)
print("Element-wise product of a and b:", elementwise_product)
