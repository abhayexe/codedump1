import numpy as np
import matplotlib.pyplot as plt
from scipy.stats import kurtosis

# Generate data from different distributions
normal_data = np.random.normal(0, 1, 1000)
uniform_data = np.random.uniform(-1, 1, 1000)
bimodal_data = np.concatenate([np.random.normal(-2, 1, 500), np.random.normal(2, 1, 500)])

# Calculate kurtosis
normal_kurtosis = kurtosis(normal_data)
uniform_kurtosis = kurtosis(uniform_data)
bimodal_kurtosis = kurtosis(bimodal_data)

print(f"Normal distribution kurtosis: {normal_kurtosis}")
print(f"Uniform distribution kurtosis: {uniform_kurtosis}")
print(f"Bimodal distribution kurtosis: {bimodal_kurtosis}")

# Plot the distributions
plt.figure(figsize=(18, 5))

plt.subplot(1, 3, 1)
plt.hist(normal_data, bins=30, edgecolor='red', alpha=0.7)
plt.title(f'Normal Distribution\nKurtosis: {normal_kurtosis:.2f}')

plt.subplot(1, 3, 2)
plt.hist(uniform_data, bins=30, edgecolor='black', alpha=0.7)
plt.title(f'Uniform Distribution\nKurtosis: {uniform_kurtosis:.2f}')

plt.subplot(1, 3, 3)
plt.hist(bimodal_data, bins=30, edgecolor='black', alpha=0.7)
plt.title(f'Bimodal Distribution\nKurtosis: {bimodal_kurtosis:.2f}')

plt.tight_layout()
plt.show()
