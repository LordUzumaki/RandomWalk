# Project 2: Project Random Walk

* Author: Teddy Alemu
* Class: CPSC-121 Section 001
* Semester: Spring 2022

## Overview
In this project, we worked on grid size and making the start point (0, m - 1) move to the end (m - 1, 0) of the grid, 
by using step() method with randomizing the direction. To get to the end point, we used if statement to check, if the 
certain point reached the end point to change direction. 


## Discussion

So, setting up the property, constructors, and getter was no problem to set it up. I did have some question about that 
issue, but my professor was able to help me out with somet questions. Now to moving to Step and and createWalk was really 
confusing for me to solve. I was stuck on moving y and x. it was causing me to have so much bugs because of step methiod. 
with doing research on the book and asking some question, and trials and error, i was able to figure it out how i can move
current.y and current.x to the end point. The part I was stuck at was not puting if( x== end.x && y == end.y) and final check
with current = end, to make sure we are at the end of the grid.

There is nothing i would change about this project, since it has perfect logic it. I would definitly apply this project for 
future projects. specially, learn how to use step methiod, would help me how to use for next project, if i need it to move 
some kind of object.

## Testing

In testing this program, I had to put series number in to the input that my code ask the user and did that multiple time and
it gave me the answer i wanted. The first answer matched with the PDF that was shared. There should not be any bugs that prevent
this program to do its job. every error i have recieve have been resolved.. 


## reference

Book: Name: Java Foundations: An Introduction to Program Design & Data Structures
Edition: 5th Edition


----------