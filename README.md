# CommandLine
CommandLine
So this is a simple utility that intended to demonstrate my coding skills with use of abstraction, encapsulation, and OO skills in general.

It will print out the results as specified in the coding kata exercise:  http://codekata.com/kata/kata04-data-munging/.

I have implemented as a generic command line tool which assuming the relative path of the location of the data files.

Downloads
CommandLine can be downloaded from:

https://github.com/terapaks/CommandLine

In here you'll find the build file and source code.   I am using gradle.

Quick and dirty to download and run the application would be the following:

git clone https://github.com/terapaks/CommandLine

Go into the directory and run the following to complete build and run:

gradle run --args='weather' --read and output results from weather file analysis

gradle run --args='football' --read and output results from football file analysis


------KATA Questions-------

To what extent did the design decisions you made when writing the original programs make it easier or harder to factor out common code?

    2nd file was very fast as everything was mostly out of the way completed minus the line parsing and some details 

Was the way you wrote the second program influenced by writing the first?

    Yea it was a plugin into a framework.  If we had more could just plug-in the data, constants, line-parsing, and output analysis and you are done.

Is factoring out as much common code as possible always a good thing? Did the readability of the programs suffer because of this requirement? How about the maintainability?
    
    For the most part I would say yes but have to be careful about adding too much complexity.  I think my implementation is straight forward and completely resuable.

---------------------------

--------FINAL NOTES -------

I always attempt to solve document through my naming conventions but if truly writing a professional version of this would add usage of config files, log files, and comments.

---------------------------

Copyright
Copyright (C) 2021 Steve Terapak (steve@terapak.com)
