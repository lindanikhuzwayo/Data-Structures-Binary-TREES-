# Data-Structures-Binary-TREES-
The goal of this experiment is to compare the Binary Search Tree with a traditional unsorted array data structure, both implemented in Java, using a real-world application to check if a student is on a pre-approved list for access to campus during the lockdown.
Conduct an experiment with AccessArrayApp and AccessBSTApp to demonstrate the speed difference for searching between a BST and a traditional array.

# Instrumentation

 additional code to this programs is to count the number of comparison operations (<, >, =) Im  performing in the code.  Only where there are comparing the keys.  This is called instrumentation.  There are 3 basic steps.

First, create a variable/object (e.g., opCount=0) somewhere in your code to track the counter; maybe use an instance variable in the data structure class.

Secondly, wherever there is an operation you want to count, increment the counter (opCount++).  For example:

opCount++;   // instrumentation

if (queryString == theKey)
...

Finally, report the value of the counter before the program terminates.  Maybe add a method to write the value to a file before the program terminates or print it to the screen.

# Experiment

Vary the size of the dataset (n) and measure the number of comparison operations in the best/average/worst case for different values of n.  Use 10 values of n that are spaced approximately equally apart (n=500, 1000, ..., 5000).  For each value of n:

Create a subset of n entries from the sample data (preferably use a random subset of lines).
Run both instrumented applications for every one of the n parameters corresponding to the subset of the data file.  Store all operation count values.
Determine the minimum (best case), maximum (worst case) and average of these count values.
It is recommended that you use Unix or Python scripts to automate this process.
