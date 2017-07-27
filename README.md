# Operational Research Project

## Description

Implementation in java of several metaheuristics to tackle the permutation flowshop problem and the travelling salesman problem (TSP).

## Background

Initially, this was a school project where we were asked to implement the Memetic metaheuristic for the permutation flowshop problem (referred as the Flowshop problem here).
However, we are students interested in Optimisation as we are studying Computer Science for Decision Support.
Our curiosity led us to implement several other metaheuristics in order to compare their results.
We also created our own metaheuristic, the Wolf Pack Algorithm, which is based on the behaviour of a wolf pack.
Finally, we updated our system so that it can also solve instances of the famous Travelling Salesman Problem (TSP).

## Project structure

The source code in itself is organised in the following packages in the src folder:
* crossovers: defines different ways crossover can be made on our representation of DNA (here, an array of integers representing the order in which the tasks are done for the Flowshop problem or the order in which the cities are visited for the TSP).
* definition: several classes used to build the instances, the solution, etc.
* metaheuristics: the implementation of all the metaheuristics we worked on.
* neighborhoods: contains different ways to compute the neighborhood of a solution in the search space.
* util: generic methods we implemented to manage time and random numbers generation.

For the rest of the project:
* doc: the Javadoc associated to the code.
* instances: the data for instances of the Flowshop problem and for the TSP.
* results: all the results obtained so far by the different algorithms for the different instances of the two problems.
* summary: results obtained so far in a summarized format.
* summary.ods: speadsheet that allows to see the results more easily and compare the different algorithms with graphs.
* summarize.py: script to read results and create the text files in the summary folder.

## Running the code

Before running the code, you must create a folder in the results folder with the name of your computer's session. It is the only thing you'll have to configure in order to make our program work as it should.

The Main class will then produce the following results : every metaheuristic will be called twice (the two process occurring in two different threads in the same time) on every one of the ten first instances of the Flowshop problem. The results obtained by the different algorithms are written in files with the name of the algorithm in the folder you created. 

If you then execute the Python script named summarize, it will update the data in the text files in the folder summary. If you then open the file summary.ods and update the links, you will have all the results got so far on the instances, with several graphics to compare the algorthms.

## Authors

* **Arthur Godet** - *Code (implementation of algorithms and factorization) | Design of the Wolf Pack metaheuristic* - [ArthurGodet](https://github.com/ArthurGodet)
* **Joachim Hotonnier** - *Code (structure, factorization and utils)* - [jhtr](https://github.com/jhtr)
* **Marie Deur** - *Code*

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the BSD License - see the [LICENSE.md](LICENSE.md) file for details.
    