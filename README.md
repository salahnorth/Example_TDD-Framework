# CMPT395-Assignment1-TDD-Framework

For this assignment, I used the “TDD Manifesto” website (https://tddmanifesto.com/) to deepen the fundamentals of TDD.
In the “Exercise” section, I selected two different katas, katas 1 and 5 that I implemented to practice.
The assignment is commented within the code for better understanding on how the program works.

# Folder Structure
The workspace contains one folder which is the assignment folder that contains four folders, where:

*.vscode: the folder includes the settings.json file
* src: the folder to maintain sources
*      this folder contains the katas folders and their tests
* lib: the folder to maintain dependencies
* Meanwhile, the compiled output files will be generated in the bin folder by default.

If you want to customize the folder structure, open .vscode/settings.json and update the related settings there.

# Dependency Management
The JAVA PROJECTS view allows you to manage your dependencies.

# After the implementation of the 2 katas and their tests:

For the first katas, I:

*1. coded a “fizzBuzz” method that accepts a number as input and returns it as a String.*
*2. For multiples of three return “Fizz” instead of the number*
*3. For the multiples of five return “Buzz”*
*4. For numbers that are multiples of both three and five return “FizzBuzz”.*

With the tests, I:
*start with the minimal failing solution
keep the three rules in mind and always write just sufficient enough code
do not forget to refactor your code after each passing test
write your assertions relating to the exact requirements*

*All of these files are in their respective katas and test folder.*

For the second katas, I:

*1. Create a simple app for scanning bar codes to sell products.*

For the testing:
*1. Barcode ‘12345’ should display price ‘$7.25’*
*2. Barcode ‘23456’ should display price ‘$12.50’*
*3. Barcode ‘99999’ should display ‘Error: barcode not found’*
*4. Empty barcode should display ‘Error: empty barcode’*
*5. Introduce a concept of total command where it is possible to scan multiple items.
The command would display the sum of the scanned product prices.*

*All of these respective files and tests are in their folders.*

# How to install this app:

*1. Install git*
*2. Clone this project to your local computer*

# Find a bug?

*If you have any issues with the programs, contact me*
