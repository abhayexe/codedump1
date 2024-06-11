import numpy as np
from scipy.linalg import solve

# Coefficient matrix
A = np.array([[3, 2], [1, 4]])
# Constant matrix
b = np.array([10, 16])

# Solving the linear system
x = solve(A, b)

print("Solution of the linear system is:", x)
