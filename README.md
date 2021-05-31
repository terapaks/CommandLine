# CommandLine
CommandLine
So this is a simple utility that intended to demonstrate my coding skills with use of abstraction, encapsulation, and OO skills in general.

It will print out the results as specified in the coding kata exercise:  http://codekata.com/kata/kata04-data-munging/.

I have implemented as a generic command line tool which assuming the relative path of the location of the data files.

Downloads
CommandLine can be downloaded from:

https://github.com/terapaks/CommandLine

In here you'll find the build file and source code.  I am using gradle and it can built using 'gradle build'.

A sample command line might look like (should be all on one line):

java -classpath lib/classfinder.jar com.xigole.util.ClassFinder -d some/directory/name -c SomeClassName

or

java -jar lib/classfinder.jar -d some/directory/name -c SomeClassName

Command line arguments
-o operation which will be either weather or football

Building
ClassFinder uses a standard Maven build file. Just run

mvn package

to generate classfinder.jar

Copyright
Copyright (C) 2021 Steve Terapak (steve@terapak.com)
