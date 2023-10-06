from constraint import *

n = 5
problem = Problem()
cols = range(1, n+1)
rows = range(1, n+1)
problem.addVariables(cols, rows)

for col1 in cols:
    for col2 in cols:
        if col1 < col2:
            problem.addConstraint(lambda row1, row2, col1=col1, col2=col2:
                abs(row1-row2) != abs(col1-col2) and
                row1 != row2, (col1, col2))

solutions = problem.getSolutions()
for sol in solutions:
    print(sol)

print('\nSolutions found : %i' % len(solutions))