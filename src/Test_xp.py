import random;



list_alllines=[];
f=open("/home/lindani/Assignment1/data/oklist.txt","r");
for i in range (5000):
    list_alllines.append(f.readline());       
#print(list_alllines);    

#1st file
a=open("/home/lindani/Assignment1/data/file1.txt","w");
for i in range (500):
    a.write(random.choice(list_alllines));

#2nd file    
b=open("/home/lindani/Assignment1/data/file2.txt","w");
for i in range (1000):
    b.write(random.choice(list_alllines));  
    
#3rd file
c=open("/home/lindani/Assignment1/data/file3.txt","w");
for i in range (1500):
    c.write(random.choice(list_alllines)); 

#4th file
d=open("/home/lindani/Assignment1/data/file4.txt","w");
for i in range (2000):
    d.write(random.choice(list_alllines)); 


#5th file
e=open("/home/lindani/Assignment1/data/file5.txt","w");
for i in range (2500):
    e.write(random.choice(list_alllines)); 


#6th file
g=open("/home/lindani/Assignment1/data/file6.txt","w");
for i in range (3000):
    g.write(random.choice(list_alllines)); 


#7th file
h=open("/home/lindani/Assignment1/data/file7.txt","w");
for i in range (3500):
    h.write(random.choice(list_alllines)); 


#8th file

j=open("/home/lindani/Assignment1/data/file8.txt","w");
for i in range (4000):
    j.write(random.choice(list_alllines)); 

#9th file
k=open("/home/lindani/Assignment1/data/file9.txt","w");
for i in range (4500):
    k.write(random.choice(list_alllines)); 


#10th file
l=open("/home/lindani/Assignment1/data/file10.txt","w");
for i in range (5000):
    l.write(random.choice(list_alllines)); 
