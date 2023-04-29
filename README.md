
# ExceptionHandling

a program that reads an ARXML file containing a list of containers, each with a unique ID, and reorders the containers alphabetically by their name sub- container “"SHORT-NAME"



## Files Created

 - [ExceptionHandling(main class)](https://github.com/markramy23/ExceptionHandling/blob/e0d5036c4c4c8f90642761f93e8c9e071f669099/ExceptionHandling/src/exceptionhandling/ExceptionHandling.java)
 - [Container class](https://github.com/markramy23/ExceptionHandling/blob/e0d5036c4c4c8f90642761f93e8c9e071f669099/ExceptionHandling/src/exceptionhandling/Container.java)
 - [NotVaildAutosarFileException class](https://github.com/markramy23/ExceptionHandling/blob/e0d5036c4c4c8f90642761f93e8c9e071f669099/ExceptionHandling/src/exceptionhandling/NotVaildAutosarFileException.java)
 - [EmptyAutosarFileException](https://github.com/markramy23/ExceptionHandling/blob/e0d5036c4c4c8f90642761f93e8c9e071f669099/ExceptionHandling/src/exceptionhandling/EmptyAutosarFileException.java)
    


## Detailed discribtion


> -  #### Container class:
            Class made to contain the information 
            Extracted from the arxml file.

            it is comparable and compares according 
            to the Short Name of the file 
> - #### ExceptionHandling class 
            it has the main method and two other methods
             one called ParseXml which reads the arxml file
             it takes the file name/path as an argument
             and return a list of Containers.
            
            The other method is Writexml which 
            takes the file name/path as an argument and the list of
             containers after sorting it and transform the list 
             to an arxml file with the same name passed to it 
             concatenated with "_mod.arxml".
             
## How To Use :
- In the ExceptionHandling folder you will find a src folder that contains all the source code for the created classes.

 > - you will find also a dist folder inside it there is a test.bat file that you can test the program with and aslo three files for testing 

        1. NormalCase.arxml : which test the normal case when 
        testing this file the program will print the sorted list of containers
         (which is not required but used for testing) and an output folder will be created in
         the same distanation of the input file

        2. WrongFormatCase.txt : which tests the wrong 
        format case that throws an Exception

        3. EmptyFile.arxml : to test the empty file case that throws 
        an Exception.
 >

> - #### To test the program

 run the text.bat file and enter the name of the file you want to test example : **NormalCase.arxml** 

 if you want to test your own file: enter the path of your file without any (" ") Example: **C:\Users\Mark\OneDrive\Desktop\NormalCase.arxml**




