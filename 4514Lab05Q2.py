import torch
import pyro

def coin_flip_model(num_flips):
    # Sample the probability of heads from a Beta distribution
    prob_heads = pyro.sample("prob_heads", pyro.distributions.Beta(1, 1))
    # Sample the outcomes of num_flips coin flips
    flips = pyro.sample("flips", pyro.distributions.Bernoulli(prob_heads), sample_shape=(num_flips,))
    # Return the number of heads
    return flips.sum()

# Simulate 10 coin flips and print the number of heads
num_heads = coin_flip_model(10)
print(num_heads)
