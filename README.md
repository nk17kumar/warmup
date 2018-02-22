# warmup
Warmup exercise project for Jgrapht during GSOC'18 application

Description

This project imports the Game of Thrones .dot file and builds the directed graph
from it. After building the graph, it can answer the queries on lowest common
ancestors for any two character from Game of Thrones

Packages

1) warmup.demo
   This contails the driver demo.java function to run the project
2) warmup.dao
   This contains all the data objects that are used in the this project for
   organising and storing the info
3) warmup.util
   This contains the helper java files that provide functionality for execuitng
   operations on the doa objects


How to run

1) Build the project
2) Navigate to warmup.demo directory
3) Run command java demo input1 input2 input3
   Description of three command line arguments
   input1 : denotes the name of .dot file stored in resource package.
            Currently, the file name is "got.dot" and can be found in the src/main/resource
