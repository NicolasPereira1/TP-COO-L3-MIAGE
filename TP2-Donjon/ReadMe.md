# Project Dungeon

## Introduction
 - The project is a simple adventure game. In that game the player make is way through the different rooms of a dungeon. When he arrives in a room, the player can choose an action to execute between a list of these. A room can contain items and monsters. Items can be used by the player. If the player encounter a monster, he need to kill it to leave the current room. Obviously the monster can strike back if he's attacked. The goal of the player is to reach the dungeon's exit. He loose if he die before.

## How to:

### 1- Get the project

 - `git clone https://gitlab-etu.fil.univ-lille1.fr/despelchin/despelchin-pereira-coo.git` and go to the dungeon project's location.
 - `cd despelchin-pereira-coo/TP2-Donjon`

### 2- Generate the documentation

 - `mvn javadoc:javadoc`

### 3- Generate the project

 - `mvn package`

### 4-  Execute the archive

 - `java -jararget/TP2-Donjon-1.0-SNAPSHOT.jar`

## Insights

### 1- Important conception elements

- As required on the COO courses, we split the code as possible, to have a better adaptability of it. As we can see on the UML and the code himself, it's easy to add a new item on it, or a new type of character if we want. 
- The generic menu helps a lot to show the differents actions we can add too, we don't have to rework on the past classes to add them.

### 2- Design patterns presentation 

We used
- An Adapter for the differents actions. It permit to adapt our generic menu which works on any possible actions.


### 3- Project valorisation
We added a random dungeon generation in the *AdventureGame* Class. It wasn't required on the subject, but we found it a way better to make it. It seem more logical to have a random dungeon than a little main with some tests of rooms and items, and more challenging ! :)
### 4- UML of the project
![](https://lh3.googleusercontent.com/Pw5dzK6BO9HX2ty8bvR0ys-3-kpqs448Z592bG8V4kGQ1ZIcxLOEUrYoqQceOsy1Q6aHHnVOjG6-EEyhKnieEwFiErnQ3uXq65naqJytJ9hwfD5ujeUfoGvejv16ZS34K7_nA_X8cvVDsgPfbwffhhaQuhU3bEtnY3n25yhzmyX-mzEGliPzvhilLdG-Mcg8unmmg7HN77x3ihfGRkRCIKPF7ZHP_9lMVkXe-Ysm-f421l1kOMKcEdjHCLA_G2lGXJF4qTyrK33xXvVbhRk8BsmzW550Vv4C6wXJWpZEFkc5-zBPBNSm6JU2UEYv4muAMlvDayHjBy67nDvus03bx0sHoHxpF-_heZtaYKjRVFljaYFuMA4S9pKJ0KuZLf20eG974U7JkBcJUyoGUM8awjlZn6v7QCzl1JqqiUXHdPkGHZfpI6EF8XSj-AfmMCM_xyCN_MlCpEhREPcoMNesWH6oLlRW4T6FigfMVEKN3uJ3UBABiyRfl8b3FrD9efkEUVlV_0Qn7hl5nqzACvfYXpZ-4dc7pF9pOs4Ci2D0DPeR0mnuElcYNG-HP5-yPxJY47z-nFMA3beLHDmIrG5bL6zrIxazUXeEDBSUl0fgOnysHCcA1l6yh7HvuVwwUcOZvO_oPeQHASTpFEUPJVZYIQnX3nhO26gAWYwYl329YUfTTVVygcHGew=w1310-h937-no)
## Authors
Made by Nicolas Pereira & Brice Despelchin, for the COO courses at the "Université de Lille".
All rights reserved.

