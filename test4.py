import numpy as np
from scipy.stats import chi2_contingency

# Function to input and create a contingency table
def input_contingency_table():
    print("Enter the number of rows and columns in the contingency table:")
    rows = int(input("Number of rows: "))
    cols = int(input("Number of columns: "))

    print("Enter the values for the contingency table row by row:")
    table = []
    for i in range(rows):
        row = input(f"Enter the values for row {i+1}, separated by spaces: ").split()
        table.append([int(val) for val in row])

    return np.array(table)

# Input the contingency table
contingency_table = input_contingency_table()

# Perform the Chi-Square test
chi2, p, dof, expected = chi2_contingency(contingency_table)

# Print the results
print("\nChi-Square Test Results")
print("=======================")
print(f"Chi-Square Statistic: {chi2}")
print(f"P-Value: {p}")
print(f"Degrees of Freedom: {dof}")
print("Expected Frequencies:")
print(expected)
