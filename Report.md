# Homework Aloha World Report

The following report contains questions you need to answer as part of your submission for the homework assignment. 


## Design Doc
Please link your UML design file here. See resources in the assignment on how to
link an image in markdown. You may also use [mermaid] class diagrams if you prefer, if so, include the mermaid code here.  You DO NOT have to include Greeting.java as part of the diagram, just the AlohaWorld application that includes: [AlohaWorld.java], [Greeter.java], and [ConsoleView.java].
[![UML Diagram](https://mermaid.ink/img/pako:eNqFVFFvmzAQ_iuWn0ANf4CHqYh2KxKCqslWdaOqHOOCW8fObNMpqtLfviPAYhLKeMJ3n--7-3x375iqkuEQU0GMueKk0mRTSATfwYIioWpyr7Qo0Xtnb78LZCyxnKIN4dJbWs1l9esREV0ZH70pXh6hgRPC8zv7vpAuR6ykUYL94OyPSxIMJM9cEoGWlEjJNFrGUZZd332KS7mxH11KHyjN4yhNVg9P-e0qybOle8uhHRIb1VYxm5EN83zURZuGpIoSwe0OYFzaCQytGX29a2RUtVr5aK2AlMgJ5BZY7DfNmAW2XlVU9WdX1xP9DldAmZF2vWhdEAl1uE7gQaJPfELIkYQDrjV-Knob8Ca6j5JkFhLfJFk0i0hWUfowi7i6_hp9T1dPw9O6QvZKeE7Z_n_8i5EYI_RcA8y_vOMcRT-ZjYvudacJDp6-WRAxlPNcit05NHBz6ZyTAS_zN6Y1LxmqialjGPvzxI8Y9rshwnj5-oVRi9T6ZbJxj3irZqjPp6VtJoC6jXbS2s7iCYIvox0RosYwMwkbRiFEVDNiB5R7ewzrIhUSL_CGaVhnJSzDwyAV2NYMxgaH8FsS_VrgQu4BRxoodicpDq1u2AJr1VQ1Dp9BLzg12xJ4-036z7ol8qdSw3n_Fzihs-4?type=png)](https://mermaid.live/edit#pako:eNqFVFFvmzAQ_iuWn0ANf4CHqYh2KxKCqslWdaOqHOOCW8fObNMpqtLfviPAYhLKeMJ3n--7-3x375iqkuEQU0GMueKk0mRTSATfwYIioWpyr7Qo0Xtnb78LZCyxnKIN4dJbWs1l9esREV0ZH70pXh6hgRPC8zv7vpAuR6ykUYL94OyPSxIMJM9cEoGWlEjJNFrGUZZd332KS7mxH11KHyjN4yhNVg9P-e0qybOle8uhHRIb1VYxm5EN83zURZuGpIoSwe0OYFzaCQytGX29a2RUtVr5aK2AlMgJ5BZY7DfNmAW2XlVU9WdX1xP9DldAmZF2vWhdEAl1uE7gQaJPfELIkYQDrjV-Knob8Ca6j5JkFhLfJFk0i0hWUfowi7i6_hp9T1dPw9O6QvZKeE7Z_n_8i5EYI_RcA8y_vOMcRT-ZjYvudacJDp6-WRAxlPNcit05NHBz6ZyTAS_zN6Y1LxmqialjGPvzxI8Y9rshwnj5-oVRi9T6ZbJxj3irZqjPp6VtJoC6jXbS2s7iCYIvox0RosYwMwkbRiFEVDNiB5R7ewzrIhUSL_CGaVhnJSzDwyAV2NYMxgaH8FsS_VrgQu4BRxoodicpDq1u2AJr1VQ1Dp9BLzg12xJ4-036z7ol8qdSw3n_Fzihs-4)


### Program Flow
Write a short paragraph detailing the flow of the program in your own words. This is to help you understand / trace the code (and give you practice of something called a code walk that will be required in this course).
> 1. Input your name
> 2. Select a locality from 1 to 4
> 3. Get the corresponding greeting
> 4. Answer yes or no to be greeted again
  >    * If yes, continue to step 2 to 4
  >    * If no, execution finished

## Assignment Questions

1. List three additional java syntax items you didn't know when reading the code.  (make sure to use * for the list items, see example below, the backtick marks are used to write code inline with markdown)
   
   * (example) `final class`
   * `static`
   * `@override`
   * Writing a private constructor

2. For each syntax additional item listed above, explain what it does in your own words and then link a resource where you figured out what it does in the references section. 

    * (example) The `final` keyword when used on a class prevents the class from being subclassed. This means that the class cannot be extended by another class. This is useful when you want to prevent a class from being modified or extended[^1] . It is often the standard to do this when a class only contains static methods such as driver or utility classes. Math in Java is an example of a final class[^2] .
    >  * The `static` keyword[^7] represents a member belongs to the class itself, it can be accessed without instantiating a new object.
    >  * The `@override` occurs a subclass implements a method which is already defined in the superclass. This approach allows the method in subclass with same signature as in superclass to override the inherited methods.[^3]
    >  * Private constructors allow us to prevent the instantiation of a class, enforcing controlled object creation.[^4] By making the constructor private, we can prevent other code from creating multiple instances of the class.

3. What does `main` do in Java? 

    > The main function is an entry point to a program. It contains the codes are going to be executed, which controls the flow of execution and sets up any necessary resources.


4. What does `toString()` do in Java? Why should any object class you create have a `toString()` method?

   > The `toString()` method returns the string representation of the object.[^5] It's easy for reading and debugging. The reason we should create a `toString()` method for any object class is to override the superclass `toString()` method and generate its own string representation.


5. What is javadoc style commenting? What is it used for? 

   > Javadoc is an API documentation generator for the Java programming language. Javadoc comments are usually placed above classes, methods, or fields in your source code. Based on information in Java source code, Javadoc generates standardized documentation formatted as HTML for providing clear information for users and developers.


6. Describe Test Driving Development (TDD) in your own words. 

   > TDD is a way of writing code that involves writing unit-level test codes and production codes.[^6] Before writing the actual codes, we write tests first. This approach is to ensure our code works as expected. If the test fails, we refactor our codes. By repeating with another new test case, we make comprehensive tests on our program and improve its quality.


7. Go to the [Markdown Playground](MarkdownPlayground.md) and add at least 3 different markdown elements you learned about by reading the markdown resources listed in the document. Additionally you need to add a mermaid class diagram (of your choice does not have to follow the assignment. However, if you did use mermaid for the assignment, you can just copy that there). Add the elements into the markdown file, so that the formatting changes are reserved to that file. 


## Deeper Thinking Questions

These questions require deeper thinking of the topic. We don't expect 100% correct answers, but we encourage you to think deeply and come up with a reasonable answer. 


1. Why would we want to keep interaction with the client contained to ConsoleView?

   > Keeping interaction with the client contained to ConsoleView leads to a clear and readable main function. Due to the main function focuses on the flow of execution and setting up any necessary resources, it will be easier to read by placing the details of code into multiple classes. By keeping the client interaction in the ConsoleView, we separate the concerns of interacting with the user from the core business logic of the program. Since all user interaction is centralized in ConsoleView, this approach also comes with easier maintenance.


2. Right now, the application isn't very dynamic in that it can be difficult to add new languages and greetings without modifying the code every time. Just thinking programmatically,  how could you make the application more dynamic? You are free to reference Greeting.java and how that could be used in your design.

   > We can refactor Greeter class by using an array to save the country list with the locality name, its corresponding greeting and other necessary attributes. When the user trying to access the number out of the range of the list, we can ask for whether the user like to add a new country and greeting. If so, the application appends a new country and its greeting to the existing country list. Therefore, the application can be dynamically modified.


> [!IMPORTANT]
>  After you upload the files to your github (ideally you have been committing throughout this progress / after you answer every question) - make sure to look at your completed assignment on github/in the browser! You can make sure images are showing up/formatting is correct, etc. The TAs will actually look at your assignment on github, so it is important that it is formatted correctly.


## References

[^1]: Final keyword in Java: 2024. https://www.geeksforgeeks.org/final-keyword-in-java/. Accessed: 2024-03-30. 

[^2]: Math (Java Platform SE 17). https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html. Accessed: 2024-03-30.

[^3]: Overriding in Java. https://www.geeksforgeeks.org/overriding-in-java/. Accessed: 2025-01-25.

[^4]: Private Constructors in Java. https://www.baeldung.com/java-private-constructors. Accessed: 2025-01-25.

[^5]: How to override the toString() method in Java. https://www.educative.io/answers/how-to-override-the-tostring-method-in-java. Accessed: 2025-01-25.

[^6]: Test-driven development. https://en.wikipedia.org/wiki/Test-driven_development. Accessed: 2025-01-25.

[^7]: static Keyword in Java. https://www.geeksforgeeks.org/static-keyword-java/. Accessed: 2025-01-25.


<!-- This is a comment, below this link the links in the document are placed here to make ti easier to read. This is an optional style for markdown, and often as a student you will include the links inline. for example [mermaid](https://mermaid.js.org/intro/syntax-reference.html) -->
[mermaid]: https://mermaid.js.org/intro/syntax-reference.html
[AlohaWorld.java]: src/main/java/student/AlohaWorld.java
[Greeter.java]: src/main/java/student/Greeter.java
[ConsoleView.java]: src/main/java/student/ConsoleView.java