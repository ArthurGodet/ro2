#!/usr/bin/python3

import os

def fillTable(table, inputFile):
    readName = True
    name = ""
    for line in inputFile:
        if readName:
            name = line.strip()
            readName = False
        elif line[0] == '-':
            readName = True
        else:
            cmax = int(line)
            table.setdefault(name, [])
            table[name].append(cmax)

def writeTable(table, outputFile):
    names = list(sorted(table.keys()))
    height = max(map(len, table.values()))
    outputFile.write(';'.join(names)+'\n')
    for h in range(height):
        outputFile.write(';'.join(map(str, (table[names[i]][h] if h < len(table[names[i]]) else '' for i in range(len(names)))))+'\n')

if __name__ == '__main__':
    folders = os.listdir("results")
    solvers = os.listdir("results/"+folders[0])
    for solver in solvers:
        table = {}
        for folder in folders:
            with open("results/"+folder+"/"+solver, "r") as inputFile:
                fillTable(table, inputFile)
        with open("summary/"+solver, "w") as outputFile:
            writeTable(table, outputFile)