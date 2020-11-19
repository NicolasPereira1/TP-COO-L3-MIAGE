# Project Letter

## Introduction
 - The project is a simulation of a city post. It permit to send different letters to other inhabitants.

## How to:

### 1- Get the project

 - `git clone https://gitlab-etu.fil.univ-lille1.fr/despelchin/despelchin-pereira-coo.git` and go to the letter project's location.
 - `cd despelchin-pereira-coo/TP3-Letter`

### 2- Generate the documentation

 - `mvn javadoc:javadoc`

### 3- Generate the project

 - `mvn package`

### 4-  Execute the archive

 - `java -jar ./target/TPLetter-1.0-SNAPSHOT.jar` and add in argument `Simulation1|Simulation2`

## Insights

### 1- Important conception elements

- As required on the COO courses, we split the code as possible, to have a better adaptability of it.
- We have a generic letter to be adapted for each kind of possible letters.
- We also have a type `Content` to determinise the content of a letter.

### 2- Design patterns presentation 

We used
- A decorator for the registered or urgent letter, because a registered letter can be urgent and vice-versa.


### 3- Project valorisation
We have 2 simulation of the project, that can be launched to simulate a city post.

### 4- UML of the project
![enter image description here](https://lh3.googleusercontent.com/tIbQd7zFWPqIAc3sqjnASkuZNuOrxKdDNlDIJ1TBWRaLpS3-jBaBzEKsPVZWZoEPTHp7rgJxjvVA)
## Authors
Made by Nicolas Pereira & Brice Despelchin, for the COO courses at the "Université de Lille".
All rights reserved.

