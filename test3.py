import numpy as np
from scipy.stats import chisquare

# Observed data
f_obs = np.array([43, 52, 54, 40])

# Expected data
f_exp = np.array([44, 24, 29, 3]) / 100 * 189

# Perform the chi-square test
chi2, p = chisquare(f_obs, f_exp)

print(f'Chi-square statistic: {chi2}')
print(f'P-value: {p}')