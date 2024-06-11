import numpy as np
import matplotlib.pyplot as plt
from scipy.stats import linregress

# Function to input data for linear regression
def input_data():
    x = list(map(float, input("Enter the independent variable values (x) separated by spaces: ").split()))
    y = list(map(float, input("Enter the dependent variable values (y) separated by spaces: ").split()))
    return np.array(x), np.array(y)

# Input the data
x, y = input_data()

# Perform linear regression
slope, intercept, r_value, p_value, std_err = linregress(x, y)

# Print the results
print("\nLinear Regression Results")
print("=========================")
print(f"Slope: {slope}")
print(f"Intercept: {intercept}")
print(f"R-squared: {r_value**2}")
print(f"P-Value: {p_value}")
print(f"Standard Error: {std_err}")

# Plot the data and the regression line
plt.figure(figsize=(10, 6))
plt.scatter(x, y, color='blue', label='Data points')
plt.plot(x, slope * x + intercept, color='red', label='Regression line')
plt.title('Linear Regression')
plt.xlabel('Independent variable (x)')
plt.ylabel('Dependent variable (y)')
plt.legend()
plt.grid(True)
plt.show()
