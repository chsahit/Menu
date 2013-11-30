Menu
====

This repo contains a library designed to make menu creation easy

See src/SampleImplementation to watch the library in action

What a menu does is provide a user with a set of options and then performs an 
action based on the choice the user makes. What this library does is removes theneed for a developer to rewrite the same menu logic over and over again by 
providing classes for the developer to extend. The main class will extend Menu 
and will create an array of "Action". This array will have objects whose 
superclass is Action and each one of these objects will Override the run method.Then all the developer has to do is call in the Menu class with the actions as 
parameters and the job is done. 


