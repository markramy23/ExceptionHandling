
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
