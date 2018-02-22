# warmup
Warmup exercise project for Jgrapht during GSOC'18 application

### Description

This project imports the Game of Thrones .dot file and builds the directed graph
from it. After building the graph, it can answer the queries on lowest common
ancestors for any two character from Game of Thrones

### Packages

-  **com.warmup.demo**
   * This contains the driver demo.java function to run the project
-  **com.warmup.dao**
   * This contains all the data objects that are used in the this project for
   * organizing and storing the info
-  **com.warmup.util**
   * This contains the helper java files that provide functionality for executing
   * operations on the doa objects


### How to run

-  Build the project
-  Navigate to **com.warmup.demo** package
-  Run command
   > java demo input1 input2 input3

   Description of three command line arguments :

   - **input1** : denotes the name of .dot file stored in src/main/resource package.Currently, the file name is "**got.dot**" and can be found in the src/main/resource
   
   - **input2** : denotes the name of first GOT character
   
   - **input3** : denotes the name of second GOT character
