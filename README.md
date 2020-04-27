# Design Patterns


Some of the benefits of using design patterns are:

1. Design Patterns are already defined and provides <b>industry standard approach</b> to solve a recurring problem, so it saves time if we sensibly use the design pattern. There are many java design patterns that we can use in our java based projects.
2. Using design patterns promotes <b>reusability</b> that leads to more <b>robust</b> and highly maintainable code. It helps in reducing total cost of ownership (TCO) of the software product.
3. Since design patterns are already defined, it makes our code easy to understand and debug. It leads to faster development and new members of team understand it easily.


<b>Java Design Patterns</b> are divided into three categories – <b>creational, structural</b>, and <b>behavioral</b> design patterns. This post serves as an index for all the java design patterns articles I have written so far.

- <b>Creational Design Patterns</b>
	- Singleton Pattern
	- Factory Pattern
	- Abstract Factory Pattern
	- Builder Pattern
	- Prototype Pattern
  </br>
- <b>Structural Design Patterns</b>
	- Adapter Pattern
	- Composite Pattern
	- Proxy Pattern
	- Flyweight Pattern
	- Facade Pattern
	- Bridge Pattern
	- Decorator Pattern
  </br>
- <b>Behavioral Design Patterns</b>
	- Template Method Pattern
	- Mediator Pattern
	- Chain of Responsibility Pattern
	- Observer Pattern
	- Strategy Pattern
	- Command Pattern
	- State Pattern
	- Visitor Pattern
	- Interpreter Pattern
	- Iterator Pattern
	- Memento Pattern

</br>
<h3>Creational Design Patterns</h3>


Creational design patterns provide solution to instantiate a object in the best possible way for specific situations.



1. <h4>Singleton Pattern</h4>
   
   Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the Java virtual machine. It seems to be a very simple design pattern but when it comes to implementation, it comes with a lot of implementation concerns. The implementation of the Singleton pattern has always been a controversial topic among developers. Check out Singleton Design Pattern to learn about different ways to implement Singleton pattern and pros and cons of each of the method. This is one of the most discussed java design patterns.
2. <h4>Factory Pattern</h4>
   
   
   Factory design pattern is used when we have a super class with multiple sub-classes and based on input, we need to return one of the sub-class. This pattern take out the responsibility of instantiation of a class from client program to the factory class. We can apply Singleton pattern on Factory class or make the factory method static. Check out Factory Design Pattern for example program and factory pattern benefits. This is one of the most widely used java design pattern.
3. <h4>Abstract Factory Pattern</h4>
   
   
   Abstract Factory pattern is similar to Factory pattern and it’s a factory of factories. If you are familiar with the factory design pattern in java, you will notice that we have a single Factory class that returns the different sub-classes based on the input provided and factory class uses if-else or switch statement to achieve this.
   
   In Abstract Factory pattern, we get rid of if-else block and have a factory class for each sub-class and then an Abstract Factory class that will return the sub-class based on the input factory class. Check out Abstract Factory Pattern to know how to implement this pattern with example program.
4. <h4>Builder Pattern</h4>
   
   
   This pattern was introduced to solve some of the problems with Factory and Abstract Factory design patterns when the Object contains a lot of attributes. Builder pattern solves the issue with large number of optional parameters and inconsistent state by providing a way to build the object step-by-step and provide a method that will actually return the final Object. Check out Builder Pattern for example program and classes used in JDK.
5. <h4>Prototype Pattern</h4>
   
   
   Prototype pattern is used when the Object creation is a costly affair and requires a lot of time and resources and you have a similar object already existing. So this pattern provides a mechanism to copy the original object to a new object and then modify it according to our needs. This pattern uses java cloning to copy the object.
   
   Prototype design pattern mandates that the Object which you are copying should provide the copying feature. It should not be done by any other class. However whether to use the shallow or deep copy of the Object properties depends on the requirements and it’s a design decision. Check out Prototype Pattern for sample program.



</br>
<h3>Structural Design Patterns</h3>


Structural patterns provide different ways to create a class structure, for example using inheritance and composition to create a large object from small objects.




1. <h4>Adapter Pattern</h4>
   
   
   The adapter design pattern is one of the structural design patterns and it’s used so that two unrelated interfaces can work together. The object that joins these unrelated interfaces is called an Adapter. As a real-life example, we can think of a mobile charger as an adapter because the mobile battery needs 3 volts to charge but the normal socket produces either 120V (US) or 240V (India). So the mobile charger works as an adapter between the mobile charging socket and the wall socket. Check out Adapter Pattern for example program and it’s usage in Java.
2. <h4>Composite Pattern</h4>
   
   
   Composite pattern is one of the Structural design patterns and is used when we have to represent a part-whole hierarchy. When we need to create a structure in a way that the objects in the structure have to be treated the same way, we can apply the composite design pattern.
   
   Let’s understand it with a real-life example – A diagram is a structure that consists of Objects such as Circle, Lines, Triangle etc and when we fill the drawing with color (say Red), the same color also gets applied to the Objects in the drawing. Here drawing is made up of different parts and they all have the same operations. Check out Composite Pattern article for different component of composite pattern and example program.
3. <h4>Proxy Pattern</h4>
   
   
   Proxy pattern intent is to “Provide a surrogate or placeholder for another object to control access to it”. The definition itself is very clear and proxy pattern is used when we want to provide controlled access of a functionality.
   
   Let’s say we have a class that can run some command on the system. Now if we are using it, it’s fine but if we want to give this program to a client application, it can have severe issues because client program can issue a command to delete some system files or change some settings that you don’t want. Check out Proxy Pattern post for the example program with implementation details.
4. <h4>Flyweight Pattern</h4>
   
   
   Flyweight design pattern is used when we need to create a lot of Objects of a class. Since every object consumes memory space that can be crucial for low memory devices, such as mobile devices or embedded systems, flyweight design pattern can be applied to reduce the load on memory by sharing objects. String Pool implementation in java is one of the best example of Flyweight pattern implementation. Check out Flyweight Pattern article for sample program and implementation process.
5. <h4>Facade Pattern</h4>
   
   
   Facade Pattern is used to help client applications to easily interact with the system. Suppose we have an application with a set of interfaces to use MySql/Oracle database and to generate different types of reports, such as HTML report, PDF report etc. So we will have a different set of interfaces to work with different types of database. Now a client application can use these interfaces to get the required database connection and generate reports. But when the complexity increases or the interface behavior names are confusing, the client application will find it difficult to manage it. So we can apply Facade pattern here and provide a wrapper interface on top of the existing interface to help client application. Check out Facade Pattern post for implementation details and sample program.
6. <h4>Bridge Pattern</h4>
   
   
   When we have interface hierarchies in both interfaces as well as implementations, then bridge design pattern is used to decouple the interfaces from implementation and hiding the implementation details from the client programs. Like Adapter pattern, it’s one of the Structural design pattern.
   
   The implementation of bridge design pattern follows the notion to prefer Composition over inheritance. Check out Bridge Pattern post for implementation details and sample program.
7. <h4>Decorator Pattern</h4>
   
   
   The decorator design pattern is used to modify the functionality of an object at runtime. At the same time, other instances of the same class will not be affected by this, so individual object gets the modified behavior. The decorator design pattern is one of the structural design pattern (such as Adapter Pattern, Bridge Pattern, Composite Pattern) and uses abstract classes or interface with the composition to implement.
   
   We use inheritance or composition to extend the behavior of an object but this is done at compile time and it’s applicable to all the instances of the class. We can’t add any new functionality to remove any existing behavior at runtime – this is when Decorator pattern comes into the picture. Check out Decorator Pattern post for sample program and implementation details.



</br>
<h3>Behavioral Design Patterns</h3>


Behavioral patterns provide solution for the better interaction between objects and how to provide lose coupling and flexibility to extend easily.




1. <h4>Template Method Pattern</h4>
   
   
   Template Method is a behavioral design pattern and it’s used to create a method stub and deferring some of the steps of implementation to the subclasses. Template method defines the steps to execute an algorithm and it can provide a default implementation that might be common for all or some of the subclasses.
   
   Suppose we want to provide an algorithm to build a house. The steps need to be performed to build a house are – building a foundation, building pillars, building walls, and windows. The important point is that we can’t change the order of execution because we can’t build windows before building the foundation. So, in this case, we can create a template method that will use different methods to build the house. Check out Template Method Pattern post for implementation details with example program.
2. <h4>Mediator Pattern</h4>
   
   
   The mediator design pattern is used to provide a centralized communication medium between different objects in a system. The mediator design pattern is very helpful in an enterprise application where multiple objects are interacting with each other. If the objects interact with each other directly, the system components are tightly coupled with each other that makes maintainability cost higher and not flexible to extend easily. Mediator pattern focuses on to provide a mediator between objects for communication and help in implementing lose-coupling between objects.
   
   Air traffic controller is a great example of a mediator pattern where the airport control room works as a mediator for communication between different flights. The mediator works as a router between objects and it can have it’s own logic to provide a way of communication. Check out Mediator Pattern post for implementation details with example program.
3. <h4>Chain of Responsibility Pattern</h4>
   
   
   Chain of responsibility pattern is used to achieve loose coupling in software design where a request from the client is passed to a chain of objects to process them. Then the object in the chain will decide themselves who will be processing the request and whether the request is required to be sent to the next object in the chain or not.
   
   We know that we can have multiple catch blocks in a try-catch block code. Here every catch block is kind of a processor to process that particular exception. So when an exception occurs in the try block, it’s sent to the first catch block to process. If the catch block is not able to process it, it forwards the request to next object in chain i.e next catch block. If even the last catch block is not able to process it, the exception is thrown outside of the chain to the calling program.
   
   ATM dispense machine logic can be implemented using Chain of Responsibility Pattern, check out the linked post.
4. <h4>Observer Pattern</h4>
   
   
   Observer design pattern is useful when you are interested in the state of an object and want to get notified whenever there is any change. In observer pattern, the object that watch on the state of another object are called Observer and the object that is being watched is called Subject.
   
   Java provides an inbuilt platform for implementing Observer pattern through java.util.Observable class and java.util.Observer interface. However, it’s not widely used because the implementation is really simple and most of the times we don’t want to end up extending a class just for implementing Observer pattern as java doesn’t provide multiple inheritances in classes.
   
   Java Message Service (JMS) uses Observer pattern along with Mediator pattern to allow applications to subscribe and publish data to other applications. Check out Observer Pattern post for implementation details and example program.
5. <h4>Strategy Pattern</h4>
   
   
   Strategy pattern is used when we have multiple algorithm for a specific task and client decides the actual implementation to be used at runtime.
   
   Strategy pattern is also known as Policy Pattern. We define multiple algorithms and let client application pass the algorithm to be used as a parameter. One of the best examples of this pattern is the Collections.sort() method that takes the Comparator parameter. Based on the different implementations of Comparator interfaces, the Objects are getting sorted in different ways.
   
   Check out Strategy Pattern post for implementation details and example program.
6. <h4>Command Pattern</h4>
   
   
   Command Pattern is used to implement lose coupling in a request-response model. In command pattern, the request is send to the invoker and invoker pass it to the encapsulated command object. Command object passes the request to the appropriate method of Receiver to perform the specific action.
   
   Let’s say we want to provide a File System utility with methods to open, write and close the file and it should support multiple operating systems such as Windows and Unix.
   
   To implement our File System utility, first of all, we need to create the receiver classes that will actually do all the work. Since we code in terms of Java interfaces, we can have FileSystemReceiver interface and it’s implementation classes for different operating system flavors such as Windows, Unix, Solaris etc. Check out Command Pattern post for the implementation details with example program.
7. <h4>State Pattern</h4>
   
   
   State design pattern is used when an Object change it’s behavior based on it’s internal state.
   
   If we have to change the behavior of an object based on its state, we can have a state variable in the Object and use if-else condition block to perform different actions based on the state. State pattern is used to provide a systematic and loosely coupled way to achieve this through Context and State implementations.
   
   Check out State Pattern post for implementation details with example program.
8. <h4>Visitor Pattern</h4>
   
   
   Visitor pattern is used when we have to perform an operation on a group of similar kind of Objects. With the help of visitor pattern, we can move the operational logic from the objects to another class.
   
   For example, think of a Shopping cart where we can add a different type of items (Elements), when we click on the checkout button, it calculates the total amount to be paid. Now we can have the calculation logic in item classes or we can move out this logic to another class using visitor pattern. Let’s implement this in our example of a visitor pattern. Check out Visitor Pattern post for implementation details.
9. <h4>Interpreter Pattern</h4>
   
   
   is used to defines a grammatical representation for a language and provides an interpreter to deal with this grammar.
   
   The best example of this pattern is java compiler that interprets the java source code into byte code that is understandable by JVM. Google Translator is also an example of an interpreter pattern where the input can be in any language and we can get the output interpreted in another language.
   
   Check out Interpreter Pattern post for example program.
10. <h4>Iterator Pattern</h4>
    
    
    Iterator pattern in one of the behavioral pattern and it’s used to provide a standard way to traverse through a group of Objects. Iterator pattern is widely used in Java Collection Framework where Iterator interface provides methods for traversing through a collection.
    
    Iterator pattern is not only about traversing through a collection, but we can also provide different kind of iterators based on our requirements. Iterator pattern hides the actual implementation of traversal through the collection and client programs just use iterator methods. Check out Iterator Pattern post for example program and implementation details.
11. <h4>Memento Pattern</h4>
    
    
    The memento design pattern is used when we want to save the state of an object so that we can restore later on. Memento pattern is used to implement this in such a way that the saved state data of the object is not accessible outside of the object, this protects the integrity of saved state data.
    
    Memento pattern is implemented with two objects – Originator and Caretaker. The originator is the object whose state needs to be saved and restored and it uses an inner class to save the state of Object. The inner class is called Memento and it’s private so that it can’t be accessed from other objects.
    
    Check out Memento Pattern for sample program and implementation details.
