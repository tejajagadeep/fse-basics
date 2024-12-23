## 1 What are the key features introduced in Java 8

## 2 Explain the concept of default methods in interfaces introduced in Java 8. How do they affect the design of interfaces

In Java 8, default methods were introduced in interfaces to allow the addition of new methods to interfaces without breaking the existing implementations of those interfaces. Prior to Java 8, interfaces could only contain abstract method declarations, requiring all implementing classes to provide concrete implementations for each method. However, this posed a problem when a new method needed to be added to an interface, as it would break all existing implementations that did not provide an implementation for the new method.

Default methods address this issue by allowing interfaces to provide default implementations for methods. These default methods have method bodies and are declared using the `default` keyword. Here's an example:

```java
public interface MyInterface {
    void method1(); // Abstract method

    default void method2() {
        System.out.println("Default implementation of method2");
    }
}
```

With default methods, existing implementations of `MyInterface` that do not override `method2()` will automatically inherit the default implementation provided by the interface. However, implementing classes have the option to override default methods if they need to provide a different implementation.

Default methods also enable the evolution of interfaces over time without breaking existing code. If a new method is added to an interface as a default method, existing implementations will continue to work without modification. This makes it easier to extend interfaces in Java libraries and frameworks without causing compatibility issues.

However, the introduction of default methods also brings some considerations for interface design:

1. **Method Name Conflicts**: If a class implements multiple interfaces that contain default methods with the same name, a compilation error will occur. In such cases, the class must provide an explicit implementation for the conflicting method.

2. **Default Method Override**: Implementing classes can choose to override default methods provided by interfaces if they need to customize the behavior. Care must be taken to understand the implications of overriding default methods and ensure compatibility with other implementations of the interface.

3. **Interface Segregation**: With default methods, interfaces can potentially become bloated with multiple methods, violating the interface segregation principle. It's important to design interfaces with a clear and cohesive purpose to avoid this issue.

In summary, default methods in interfaces provide a mechanism for adding new methods to interfaces without breaking existing implementations, thereby enabling the evolution of interfaces over time. However, they also introduce considerations for interface design, such as method name conflicts and interface segregation.

## 3 What is a lambda expression in Java? How does it simplify code? Provide an example

A lambda expression in Java is a concise way to represent an anonymous function, i.e., a function without a name. It provides a way to pass behavior as an argument to a method, typically to be executed later. Lambda expressions were introduced in Java 8 as part of the Java SE 8 release.

Lambda expressions are particularly useful in functional-style programming and are commonly used with functional interfaces, which are interfaces that contain exactly one abstract method (also known as SAM interfaces or Single Abstract Method interfaces).

Lambda expressions simplify code in Java by reducing the verbosity associated with defining anonymous classes, especially when the behavior being passed is simple and short-lived. They also promote functional-style programming, making it easier to write code that is more declarative and concise.

Here's an example to illustrate the syntax and usage of lambda expressions in Java:

```java
// Define a functional interface with a single abstract method
interface MyFunction {
    int apply(int x, int y);
}

public class Main {
    public static void main(String[] args) {
        // Using lambda expression to create an implementation of the functional interface
        MyFunction add = (a, b) -> a + b;

        // Using the lambda expression to call the apply method
        int result = add.apply(5, 3);
        System.out.println("Result of addition: " + result); // Output: Result of addition: 8

        // Another example using lambda expression to implement a functional interface
        MyFunction subtract = (a, b) -> a - b;
        int difference = subtract.apply(10, 4);
        System.out.println("Result of subtraction: " + difference); // Output: Result of subtraction: 6
    }
}
```

In this example:

- We define a functional interface `MyFunction` with a single abstract method `apply(int x, int y)`.
- We use lambda expressions `(a, b) -> a + b` and `(a, b) -> a - b` to create implementations of the `apply` method for addition and subtraction, respectively.
- We assign these lambda expressions to variables `add` and `subtract`, which can then be used to call the `apply` method with different arguments.

Lambda expressions allow us to express the behavior of addition and subtraction concisely without the need for defining separate classes or anonymous inner classes. This leads to cleaner and more readable code, especially for simple operations.

## 4 Discuss the importance of the java.util.function package introduced in Java 8. Can you give examples of functional interfaces from this package

The `java.util.function` package introduced in Java 8 is a key component of the Java 8 functional programming enhancements. It provides a set of functional interfaces that represent common function types, allowing developers to work with lambda expressions and method references more effectively. These functional interfaces enable functional-style programming in Java and promote the use of higher-order functions.

The importance of the `java.util.function` package lies in its ability to streamline and simplify code by providing predefined functional interfaces for common use cases. It enables developers to write cleaner, more concise, and more expressive code by leveraging lambda expressions and method references.

Here are some examples of functional interfaces from the `java.util.function` package:

1. **Predicate**: Represents a boolean-valued function of one argument. It's often used for filtering elements in a collection.

   ```java
   Predicate<Integer> isEven = num -> num % 2 == 0;
   ```

2. **Function**: Represents a function that accepts one argument and produces a result.

   ```java
   Function<Integer, String> intToString = num -> "Number: " + num;
   ```

3. **Supplier**: Represents a supplier of results. It doesn't accept any arguments but produces a result.

   ```java
   Supplier<Double> randomNumber = () -> Math.random();
   ```

4. **Consumer**: Represents an operation that accepts a single input argument and returns no result.

   ```java
   Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
   ```

5. **UnaryOperator**: Represents an operation on a single operand that produces a result of the same type as its operand.

   ```java
   UnaryOperator<Integer> square = num -> num * num;
   ```

6. **BinaryOperator**: Represents an operation upon two operands of the same type, producing a result of the same type as the operands.

   ```java
   BinaryOperator<Integer> add = (a, b) -> a + b;
   ```

These functional interfaces allow developers to write more concise and expressive code by encapsulating common functional patterns. They facilitate the use of lambda expressions and method references, promoting a more functional programming style in Java, which leads to code that is often easier to understand and maintain.

## 5 What is the Stream API in Java 8? How does it differ from collections? Provide use cases where Streams are advantageous.

The Stream API in Java 8 provides a powerful way to process collections of data in a functional and declarative manner. It introduces the concept of streams, which are sequences of elements that support various operations to perform computations on those elements.

Streams differ from collections in several ways:

1. **Lazy Evaluation**: Streams use lazy evaluation, which means that intermediate operations (such as filtering, mapping, or sorting) are only executed when terminal operations (such as `forEach`, `collect`, or `reduce`) are invoked. This allows for more efficient processing of large data sets as only the necessary elements are processed.

2. **Functional Operations**: Streams support functional-style operations such as `map`, `filter`, `reduce`, `flatMap`, and more. These operations allow for concise and expressive code that focuses on what needs to be done rather than how to do it.

3. **Immutability**: Streams do not modify the underlying data source. Instead, they create new streams with transformed or filtered elements. This promotes immutability, which is a key principle of functional programming.

4. **Parallel Execution**: Streams can leverage parallel execution to improve performance on multi-core processors. Parallel streams are created using the `parallel()` method, and the Stream API handles the parallelization of operations automatically.

Use cases where Streams are advantageous include:

1. **Data Processing**: Streams are ideal for processing large collections of data, such as records from a database, lines from a file, or elements from a list. They provide a concise and expressive way to perform common data processing tasks such as filtering, mapping, sorting, and aggregating.

2. **Parallel Processing**: Streams support parallel execution, making them suitable for operations that can be parallelized, such as computing aggregates, searching, or sorting large data sets. Parallel streams can significantly improve performance on multi-core processors by leveraging parallelism.

3. **Functional Programming**: Streams support functional-style programming paradigms, allowing developers to write code that is more declarative and expressive. This promotes cleaner, more maintainable code that focuses on what needs to be done rather than how to do it.

4. **Asynchronous Processing**: Streams can be combined with asynchronous programming techniques to perform non-blocking operations, such as fetching data from external sources or processing events asynchronously. This can improve the responsiveness and scalability of applications, especially in scenarios where I/O-bound tasks are involved.

Overall, the Stream API in Java 8 provides a flexible and efficient way to process collections of data, enabling developers to write cleaner, more concise, and more maintainable code. It offers powerful functional-style operations and supports parallel execution, making it well-suited for a wide range of data processing tasks.

## 6 Explain the concept of Optional in Java 8. How does it help in handling null values and reducing NullPointerExceptions?

In Java 8, the `Optional` class was introduced as a way to represent an optional value, meaning a value that may or may not be present. It addresses the problem of dealing with null values and helps reduce `NullPointerExceptions` by providing a more structured and safer way to handle potentially absent values.

Here's how `Optional` works:

1. **Container for a Value**: `Optional` is a container object that may or may not contain a non-null value. It can hold either a value of some type or no value at all.

2. **Avoidance of Null References**: Instead of returning `null` to indicate the absence of a value, methods can return an `Optional` instance. This makes it explicit to the caller that the value may not be present, reducing the chances of accidentally encountering a `NullPointerException`.

3. **No Direct Access to the Value**: The value held by an `Optional` can only be accessed through methods provided by the `Optional` class, such as `get()`, `orElse()`, `orElseGet()`, `orElseThrow()`, etc. These methods provide safe ways to access the value or provide a default value if the value is absent.

4. **Avoidance of Null Checks**: `Optional` provides methods like `isPresent()` and `ifPresent(Consumer<? super T> consumer)` to check for the presence of a value and perform actions based on whether the value is present or not. This eliminates the need for explicit null checks, leading to cleaner and more readable code.

5. **Encouragement of Defensive Programming**: By forcing developers to explicitly handle the absence of a value, `Optional` encourages defensive programming practices and forces them to think about how to handle null cases in a more structured way.

Here's an example of how `Optional` can be used to handle potentially null values:

```java
String name = null; // Simulating a potentially null value

// Using Optional to handle the potentially null value
Optional<String> optionalName = Optional.ofNullable(name);

// Check if the value is present and perform an action
optionalName.ifPresent(n -> System.out.println("Name: " + n));

// Get the value or provide a default value if it's absent
String result = optionalName.orElse("Unknown");

System.out.println("Result: " + result);
```

In this example, `Optional.ofNullable(name)` creates an `Optional` instance containing the potentially null `name`. The `ifPresent` method is used to print the name if it's present, and `orElse` is used to provide a default value if the name is absent. This way, `NullPointerExceptions` are avoided, and the code is more robust and safer to use.

## 7 What are method references in Java 8? How do they relate to lambda expressions?

In Java 8, method references provide a way to refer to methods or constructors without invoking them. They are shorthand notation that allows you to pass references to methods or constructors directly as arguments to functional interfaces. Method references are closely related to lambda expressions and can be used in many of the same contexts.

Here's how method references relate to lambda expressions:

1. **Alternate Syntax**: Method references provide an alternative, more concise syntax for implementing functional interfaces compared to lambda expressions. Instead of explicitly defining the behavior using a lambda expression, you can refer to an existing method using the method reference syntax.

2. **Direct Reference**: Method references directly reference an existing method or constructor by name. This can make the code more readable and maintainable by clearly indicating the method being called.

3. **Types of Method References**: There are different types of method references in Java 8:

   - Reference to a static method
   - Reference to an instance method of a particular object
   - Reference to an instance method of an arbitrary object of a particular type (such as `String::toUpperCase`)
   - Reference to a constructor

4. **Parameter Compatibility**: Method references must be compatible with the functional interface they are assigned to. This means that the method's parameter types and return type must match the parameter types and return type of the functional interface's abstract method.

5. **Syntactic Sugar**: Method references can be seen as syntactic sugar for lambda expressions. They provide a more concise way to express behavior, especially when the behavior corresponds to an existing method.

Here's an example comparing lambda expressions and method references:

```java
// Lambda expression to compare two strings
Comparator<String> comparator1 = (s1, s2) -> s1.compareTo(s2);

// Method reference to compare two strings using String's compareTo method
Comparator<String> comparator2 = String::compareTo;

// Applying the comparator
int result1 = comparator1.compare("hello", "world");
int result2 = comparator2.compare("hello", "world");
```

In this example, `comparator1` is implemented using a lambda expression that compares two strings using the `compareTo` method. `comparator2`, on the other hand, is implemented using a method reference to the `compareTo` method of the `String` class. Both `comparator1` and `comparator2` achieve the same result, but the method reference syntax is more concise and directly indicates the method being called.

## 8 How does the introduction of the java.time package in Java 8 improve date and time handling compared to the previous Date and Calendar classes?

## 9 what is the difference between parallel and sequential streams in Java 8? When would you use one over the other Explain the concept of the forEach method in Iterable and Stream interfaces introduced in Java 8. How does it improve iteration over collections

In Java 8, the Streams API introduced the concept of parallel streams, which allow for parallel processing of elements in a stream, and sequential streams, which process elements sequentially. Here's the difference between them:

1. **Sequential Streams**:

   - In a sequential stream, the elements are processed one by one, in the order they appear in the source.
   - It is the default behavior of streams if you don't explicitly specify parallel processing.
   - Sequential streams are suitable for smaller collections or when the processing order of elements matters.
   - They are generally simpler to reason about and debug compared to parallel streams.

2. **Parallel Streams**:
   - Parallel streams divide the elements into multiple chunks and process each chunk concurrently, utilizing multiple threads.
   - They are suitable for larger collections or when the processing of elements can be done independently.
   - Parallel streams can significantly improve performance for CPU-bound tasks by leveraging multiple cores.
   - However, they introduce overhead due to thread synchronization and context switching, so they might not always be faster than sequential streams, especially for small collections or I/O-bound tasks.

You would choose one over the other based on the characteristics of your data and the processing requirements of your application. Use sequential streams when the order of processing matters or when dealing with small collections, and use parallel streams when processing large collections or when the processing can be done in parallel.

Regarding the `forEach` method:

- In Java 8, both the `Iterable` interface and the `Stream` interface introduced a `forEach` method.
- In the `Iterable` interface, the `forEach` method is a default method that iterates over each element in the collection and performs the specified action.
- In the `Stream` interface, the `forEach` method is a terminal operation that iterates over each element in the stream and applies the specified action.
- The `forEach` method in both interfaces allows for more concise and expressive iteration over collections compared to traditional loops.
- It improves iteration by encapsulating the iteration logic and making it easier to read and maintain.
- Additionally, when using parallel streams, the `forEach` method allows for easy parallel iteration over elements, as it handles the parallelism internally without the need for explicit threading logic.

Here's an example demonstrating the usage of `forEach` with both `Iterable` and `Stream`:

```java
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Iterable forEach
        List<String> list = Arrays.asList("a", "b", "c");
        list.forEach(System.out::println);

        // Stream forEach
        list.stream()
            .forEach(System.out::println);
    }
}
```

In this example, both `Iterable.forEach` and `Stream.forEach` are used to print each element of the list. The syntax `System.out::println` is a method reference that represents the `println` method of `System.out`, which is a convenient way to pass a method as an argument to another method.

## 11 \*Discuss the improvements made to the ConcurrentHashMap class in Java 8

In Java 8, the `ConcurrentHashMap` class received several improvements and new features to enhance its performance, concurrency, and usability. Some of the key improvements made to the `ConcurrentHashMap` class in Java 8 include:

1. **Reduction of Segment Overhead**:

   - In earlier versions of Java, `ConcurrentHashMap` used a segmented design where the underlying data structure was divided into multiple segments, each with its own lock. This design introduced some overhead due to the management of individual segments.
   - In Java 8, this overhead was significantly reduced by replacing the segmented design with a single global lock. This change simplifies the internal structure and improves the performance of common operations.

2. **Improved Performance**:

   - The removal of segment-level locks in Java 8 leads to better performance for concurrent read and write operations.
   - The new design reduces contention and eliminates the overhead of acquiring and releasing multiple locks.

3. **Enhanced Iteration**:

   - Java 8 introduced new methods for iterating over the key-value pairs of a `ConcurrentHashMap`, such as `forEach`, `forEachEntry`, `forEachKey`, and `forEachValue`.
   - These methods provide a convenient way to perform operations on the key-value pairs without the need for external synchronization.

4. **New Bulk Operations**:

   - Java 8 introduced bulk operations like `replaceAll`, `compute`, `computeIfAbsent`, and `computeIfPresent` for performing atomic updates and modifications on the map.
   - These operations allow for efficient and thread-safe manipulation of the map's entries without the need for external synchronization.

5. **Support for Functional Interfaces**:
   - The introduction of functional interfaces in Java 8, such as `Function` and `BiFunction`, enables the use of lambda expressions and method references when performing operations on `ConcurrentHashMap`.
   - This leads to more concise and expressive code when working with concurrent maps.

Overall, the improvements made to the `ConcurrentHashMap` class in Java 8 enhance its performance, concurrency, and usability, making it a more efficient and reliable choice for concurrent programming tasks in Java applications.

## 12 What is the concept of the CompletableFuture class in Java 8? How does it enable asynchronous programming?

The `CompletableFuture` class in Java 8 represents a future result of an asynchronous computation. It is a part of the java.util.concurrent package and provides a powerful way to perform asynchronous programming in Java. Here's how it works:

1. **Asynchronous Computation**:

   - A `CompletableFuture` represents a task that may eventually produce a result or throw an exception. It can be completed with a value or an exception at some point in the future.
   - You can create a `CompletableFuture` and then supply it with a task to be executed asynchronously.

2. **Chaining and Composition**:

   - `CompletableFuture` supports a fluent API that allows you to chain multiple asynchronous tasks together. You can combine multiple `CompletableFuture` instances using methods like `thenApply`, `thenCompose`, and `thenCombine`.
   - This chaining allows for the creation of complex asynchronous workflows, where the output of one task becomes the input of another.

3. **Asynchronous Execution**:

   - `CompletableFuture` can execute tasks asynchronously using a thread pool. When you chain tasks together, they can be executed concurrently, leading to better utilization of resources and improved performance.
   - Asynchronous execution enables non-blocking behavior, allowing your application to perform other tasks while waiting for the completion of asynchronous operations.

4. **Exception Handling**:

   - `CompletableFuture` provides robust exception handling mechanisms. You can handle exceptions using methods like `exceptionally` and `handle`, allowing you to gracefully handle errors and recover from failures in your asynchronous computations.

5. **Completion Callbacks**:
   - You can register callback functions to be invoked when the `CompletableFuture` completes, either successfully or exceptionally. This allows you to react to the completion of asynchronous tasks and process the results accordingly.

Overall, the `CompletableFuture` class in Java 8 enables asynchronous programming by providing a flexible and powerful mechanism for executing and composing asynchronous tasks. It simplifies the development of concurrent and non-blocking applications, allowing developers to write code that is more efficient, scalable, and responsive.

## 13 \*How does Java 8 support functional programming paradigms? Provide examples of functional programming features introduced in Java 8

Java 8 introduced several features that support functional programming paradigms, allowing developers to write more concise, expressive, and functional-style code. Some of the key features introduced in Java 8 to support functional programming are:

1. **Lambda Expressions**:

   - Lambda expressions enable the representation of anonymous functions as instances of functional interfaces. They provide a concise syntax for defining behavior inline, making code more readable and expressive.
   - Example:

     ```java
     // Traditional anonymous class
     Runnable runnable = new Runnable() {
         @Override
         public void run() {
             System.out.println("Hello, world!");
         }
     };

     // Using lambda expression
     Runnable runnable = () -> System.out.println("Hello, world!");
     ```

2. **Functional Interfaces**:

   - Functional interfaces are interfaces that have exactly one abstract method. They serve as the basis for lambda expressions and method references.
   - Java 8 provides several built-in functional interfaces in the java.util.function package, such as Function, Predicate, Consumer, and Supplier, enabling functional programming idioms.
   - Example:

     ```java
     // Predicate functional interface
     Predicate<Integer> isEven = n -> n % 2 == 0;

     // Function functional interface
     Function<Integer, Integer> square = n -> n * n;
     ```

3. **Method References**:

   - Method references provide a shorthand syntax for referring to methods or constructors. They are often used as concise alternatives to lambda expressions.
   - There are four types of method references: static method, instance method on a specific instance, instance method on a specific type, and constructor references.
   - Example:

     ```java
     // Static method reference
     Function<String, Integer> parseInt = Integer::parseInt;

     // Instance method reference
     List<String> strings = Arrays.asList("a", "b", "c");
     strings.forEach(System.out::println);
     ```

4. **Streams API**:

   - The Streams API provides a declarative and functional approach to processing collections of elements. It allows for functional-style operations such as map, filter, reduce, and forEach, enabling concise and expressive code for data manipulation.
   - Streams promote immutability, laziness, and parallelism, making them well-suited for functional programming paradigms.
   - Example:

     ```java
     List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

     // Using Stream API to filter and map
     numbers.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * n)
            .forEach(System.out::println);
     ```

5. **Optional**:
   - The Optional class provides a container object that may or may not contain a non-null value. It encourages null-safe programming and reduces the occurrence of NullPointerExceptions.
   - Optional is often used in functional programming to represent the absence of a value or the result of a computation.
   - Example:
     ```java
     Optional<String> optional = Optional.ofNullable(null);
     optional.ifPresent(System.out::println);
     ```

These features introduced in Java 8 significantly enhance support for functional programming paradigms, making Java a more expressive and modern programming language. They enable developers to write cleaner, more concise, and more maintainable code while embracing functional programming principles.

## 14 Discuss the @FunctionalInterface annotation introduced in Java 8. When and how would you use it?

The `@FunctionalInterface` annotation introduced in Java 8 is used to indicate that an interface is intended to be a functional interface. A functional interface is an interface that has exactly one abstract method (excluding methods from the Object class), also known as the functional method. Functional interfaces play a central role in enabling lambda expressions and method references in Java.

Here's how and when you would use the `@FunctionalInterface` annotation:

1. **Defining Functional Interfaces**:

   - When you define an interface with the intention of using it as a functional interface, you can annotate it with `@FunctionalInterface`.
   - This annotation serves as a marker to indicate to both the compiler and other developers that the interface is intended for use with lambda expressions and functional programming constructs.
   - Example:
     ```java
     @FunctionalInterface
     public interface Calculator {
         int calculate(int a, int b);
     }
     ```

2. **Compile-Time Checks**:

   - When you annotate an interface with `@FunctionalInterface`, the compiler checks whether the interface qualifies as a functional interface.
   - The compiler ensures that the interface has exactly one abstract method, which helps prevent accidental addition of extra abstract methods that could violate the functional interface contract.
   - If the annotated interface doesn't meet the criteria of a functional interface (e.g., has more than one abstract method), the compiler generates a compilation error.
   - Example:
     ```java
     @FunctionalInterface
     public interface InvalidFunctionalInterface {
         void method1();
         void method2(); // Compilation error: Multiple non-overriding abstract methods found
     }
     ```

3. **Documentation and Clarity**:
   - Using `@FunctionalInterface` improves code readability and documentation by explicitly stating the intended purpose of the interface.
   - It makes it clear to other developers that the interface is designed to be used with lambda expressions and functional programming constructs.
   - When reviewing code, developers can quickly identify interfaces intended for functional programming and understand their role within the codebase.

Overall, the `@FunctionalInterface` annotation is a valuable tool for expressing the intent of an interface and enabling functional programming paradigms in Java. It helps ensure the correctness and clarity of code by enforcing the contract of functional interfaces and providing clear documentation of their purpose.

## 15 Explain the concept of the Collectors class in Java 8. How does it facilitate the transformation of Streams into various data structures?

The `Collectors` class in Java 8 is a utility class in the java.util.stream package that provides a set of static factory methods for performing reduction operations on streams and collecting elements into various data structures. It facilitates the transformation of streams into collections or other data structures by providing a convenient way to accumulate elements from a stream.

Here are some key aspects of the `Collectors` class and how it facilitates the transformation of streams:

1. **Reduction Operations**:

   - The `Collectors` class offers various reduction operations that can be applied to streams, such as grouping elements, partitioning elements, counting elements, and aggregating elements into a single value.
   - These reduction operations are implemented as static factory methods that return instances of `Collector` objects. Collectors represent the recipe for how to accumulate elements from a stream into a specific data structure.

2. **Collector Interface**:

   - The `Collector` interface defines a framework for implementing custom collectors that specify how to accumulate elements from a stream into a mutable result container.
   - A collector encapsulates four functions: supplier, accumulator, combiner, and finisher. These functions define how to create the result container, add elements to it, combine multiple result containers, and transform the result container into the final result.

3. **Convenience Methods**:

   - The `Collectors` class provides numerous convenience methods that return pre-defined collectors for common reduction operations.
   - These convenience methods enable developers to perform common tasks such as grouping, partitioning, summing, averaging, joining, and collecting elements into collections like lists, sets, and maps with minimal code.

4. **Interoperability with Streams**:

   - Collectors seamlessly integrate with the Stream API, allowing developers to chain collector operations directly onto stream pipelines using the `collect` method.
   - By combining intermediate stream operations with terminal `collect` operations using collectors, developers can efficiently transform, aggregate, and process data from streams into various data structures.

5. **Parallelism Support**:
   - Collectors are designed to work efficiently with parallel streams. They are thread-safe and support concurrent accumulation of elements from parallel streams into result containers.
   - The combiner function in collectors facilitates the parallel merging of intermediate results produced by multiple threads, ensuring correctness and performance in parallel stream processing.

Overall, the `Collectors` class in Java 8 plays a crucial role in stream processing by providing a rich set of reduction operations and convenient methods for collecting elements from streams into various data structures. It simplifies the transformation and aggregation of data from streams, making stream processing more expressive, efficient, and flexible.

## 16 Write a program to convert a list of strings to uppercase using Java 8 features like lambda expressions and the Stream API

```java
coutries = coutries.stream().map(a->a.toUpperCase()).toList();
```

## 17 Write a program to find the maximum number in a list of integers using Java 8 features like lambda expressions and the Stream API

```java
int max = list.stream().max(Integer::compare).get();
```

## 18 Write a program to count the occurrences of a specific word in a list of strings using Java 8 features like lambda expressions and the Stream API.

```java
long count = coutries.stream().filter(a->a.contains("e")).count();
```

## 19 Write a program to concatenate all strings in a list using Java 8 features like lambda expressions and the Stream API.

```java
String count = coutries.stream().collect(Collectors.joining());
```

## 20 Write a program to find the average length of strings in a list using Java 8 features like lambda expressions and the Stream API

```java
double avg = coutries.stream()
                .mapToInt(String::length) // Convert each string to its length
                .average() // Calculate the average
                .orElse(0.0);
```

## 21 "Program to find the next month first week sunday

```java

```

## 22 "Program to remove duplicate character in a string

```java

```

## 23 "Which of the methods would you use to look up a element in a given map using a specified key

```java

```

## 24 "one example of RuntimeException ?

```java

```

## 25 Difference between Arraylist and vector

## 26 The this keyword, when used in lambda expressions refers to what?

## 27 Difference between throw and throws?

## 28 What is singleton pattern in Java? What is a Singleton class?

## 29 Explain open closed design principle

## 30 What is the difference between HashSet and TreeSet

## 31 Which method can be used to check null on an Optional variable in Java 8

## 32 "Explain about JVM architecture and working model

"

## 33 Explain GarFbage Collector, Memory management concepts,

## 34 Explain class loaders concepts

## 35 What is an immutable object? What is the benefit and when do we use it?

## 36 Explain Java keywords volatile, atomic

## 37 "What is finalize method in Java ? When does Garbage collector calls

finalize method in Java"

## 38 How indexing and hashing works in HashMap?

## 39 "What is the difference between static binding and dynamic binding? Explain

with examples."

## 40 What is the difference between Aggregation and Composition in OOP? Give examples.

## 41 Private members of a class are inherited to subclass. True or false?

## 42 Difference between HashSet and HashMap

## 43 Explain the internal functionality of LinkedHashMap

## 44 "Explain Runnable and callable and executor service

"

## 45 What is Synchronization, Serialization , difference between them

## 46 "Name Common sorting algorithms and their time complexity

"

## 47 What is the maximum limit for threads that can be created?

## 48 What is a volatile keyword? Can we store an array in volatile?

## 49 Explain the concept of autoboxing and unboxing in Java.

## 50 What is the diamond problem in Java, and how can it be mitigated?

## 51 What is the Java Reflection API, and how is it used?

## 52 Describe the differences between the == and .equals() methods for comparing objects in Java.

## 53 Explain the try-with-resources statement in Java and its benefits.

## 54 What is the purpose of the transient keyword in Java?

## 55 What is the difference between checked and unchecked exceptions in Java?

## 56 When do we use abstract classes and interfaces in Java?

## 57 You have a multi-threaded application where multiple threads need to access a shared resource simultaneously. How would you implement synchronization to ensure thread safety?

## 58 In a banking application, you need to ensure that if a transaction fails due to insufficient funds, the balance remains unchanged. How would you handle this scenario using exception handling in Java?

## 59 Suppose you have a collection of employee objects and you want to sort them based on their salaries. How would you use lambda expressions to accomplish this task?

## 60 In a web server application, multiple clients make requests simultaneously, and each request requires processing by a separate thread. How would you implement a thread pool to handle these requests efficiently?

## 61. Serializable.

## 62. Describe Object's hash Code and equals contract.

## 63. Where do we use Generics?

## 64. Overriding/Overloading examples.

## 65. Reflection API/What is a Method Handle?

## 66. When would you use an unchecked exception?

## 67. Difference Between Collection.stream().forEach() and Collection.forEach().

## 68. Streams examples/Coding.

## 69. Can you override a default method?

## 70. Describe volatile keyword. Provide an example.

## 71. How do you prevent a class from being extended?

## 72. When would you use an abstract class instead of an interface?

## 73. How do you write a JUnit to test void methods? What kind of assertions are used?

## 74. Difference between integration testing and unit testing? How would you implement

each?

## 75. What will be the output?

class Parent {
Parent(){
test();
}
public void test() {
System.out.println("Parent");
}
}
class Child extends Parent {
public void test() {
System.out.println("Child");
}
}
public class Test {
public static void main (String args[]) {
Parent p = new Child();
}
}

## 76. Why do we create immutable classes? Are you aware of any immutable class?

## 77. Are you aware of immutable classes other than String? Different types of garbage

collectors?

## 78. When do we use method overriding?

## 79. Time complexity for ArrayList, LinkedList, HashSet, TreeMap, ConcurrentHashMap.

## 80. In Set, how do you store elements in insertion order?

## 81. Explain any other design pattern except Singleton Design pattern? I said factory

design pattern, so then write pseudo code.

## 82. Builder design pattern.

## 83. SLF4J and Log4j difference? Questions related.

## 84. HashMap to fetch data, what is the time complexity?

## 85. Getting data in HashMap, what is the time complexity?

## 86. Get an element in the list, what is the time complexity?

## 87. How would you print a HashMap in a particular order?

## 88. How to use access modifiers, what order to use the access modifiers?

## 89. What is the volatile keyword? Is there any alternative way?

## 90. Data structure - What are the data structures have been used in Java?

## 91. HashMap - underlying data structure for HashMap - HashMap to fetch data, what is

the time complexity?

## 92. Getting data in HashMap, what time complexity is?

## 93. Get an element in the list, what is the time complexity?

## 94. Elements contain in the list, what is the time complexity?

## 95. How to insert element 10th in ArrayList in 10000, what is the time complexity?

## 96. Frequent insertion which data structure must use it?

## 97. How to print elements in insertion format in HashMap - what is the map have used?

## 98. Enums - color value is red white, how to compare an Enum?

## 99. Write an immutable class using these fields -

final String name;
final Date dt;
final List<Project> projectList;

## 100. output

class Base {
public void baseMethod() {
System.out.println("BaseMethod called ...");
}
}
class Derived extends Base {
public void baseMethod() {
System.out.println("Derived method called ...");
}
}
public class Test {
public static void main (String args[]) {
Base b = new Derived();
b.baseMethod();
}
}

## 1. What is a ReentrantLock?

## 2. What is an object monitor?

## 3. What is an Executor?

## 4. What are the advantages of using a Lock instead of synchronization?

## 5. Where can you use synchronized? What does the synchronized lock in each case?

## 6. What is a ThreadPool?

## 7. Describe Deadlock/Livelock.

## 8. What is a CyclicBarrier and when would you use it? Provide an example.

## 9. What is a CountDownLatch and when would you use it? Provide an example.

## 10. What is CompletableFuture and when would you use it? Provide an example.

## 11. Print even and odd sequentially using synchronized threads in multithreading from 100

to 1. (i.e., output is 100,99,98,...,1)

## 12. Difference between `synchronize(this)` and `synchronized(a.class)`.

## can a constructor be private?

## What is the difference between a constructor and a method?

## What is the difference between Major and Minor Garbage Collection?

## Write a code to get the 3 largest numbers from an array.

## What is the internal working of the HashSet?

## What is the out for System.out.println(10+10+"30"+20+20);

## Is the below code correct?

```java
class Parent{
    private int id;

    public Parent(int id) {
        this.id = id;
    }
}

class Child extends Parent{

}
```

## build BFS code

## build linkedList code

## updates in Java 8+ versions

Java has introduced several significant updates between versions 8, 11, 17, and now 21. Below is a breakdown of the most useful features added in each version:

---

### **Key Features Added in Java 11 (from Java 8)**

1. **New String Methods**:

   - `isBlank()`, `lines()`, `strip()`, `stripLeading()`, `stripTrailing()`, `repeat(int n)`.

   ```java
   String str = " Hello ";
   System.out.println(str.strip()); // Removes leading and trailing whitespaces
   ```

2. **Local-Variable Syntax for Lambda Parameters**:

   ```java
   var list = List.of(1, 2, 3);
   list.forEach((var number) -> System.out.println(number));
   ```

3. **HTTP Client API (Standardized)**:

   - Introduced a modern HTTP client for synchronous and asynchronous communication.

   ```java
   HttpClient client = HttpClient.newHttpClient();
   HttpRequest request = HttpRequest.newBuilder()
                                    .uri(URI.create("https://example.com"))
                                    .build();
   HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
   System.out.println(response.body());
   ```

4. **File Methods**:

   - New utility methods like `Files.readString()` and `Files.writeString()`.

   ```java
   Path path = Path.of("example.txt");
   Files.writeString(path, "Hello, Java 11!");
   System.out.println(Files.readString(path));
   ```

5. **Deprecation of Nashorn JavaScript Engine**.

---

### **Key Features Added in Java 17 (from Java 11)**

1. **Sealed Classes**:

   - Restrict which classes can extend or implement a class.

   ```java
   public sealed class Shape permits Circle, Rectangle {}

   public final class Circle extends Shape {}
   public final class Rectangle extends Shape {}
   ```

2. **Pattern Matching for `switch` (Preview)**:

   - Simplifies complex switch expressions.

   ```java
   Object obj = 123;
   switch (obj) {
       case Integer i -> System.out.println("Integer: " + i);
       case String s -> System.out.println("String: " + s);
       default -> System.out.println("Unknown type");
   }
   ```

3. **Records**:

   - Compact syntax for immutable data classes.

   ```java
   public record Point(int x, int y) {}
   Point point = new Point(1, 2);
   System.out.println(point.x());
   ```

4. **Text Blocks**:

   - Simplify multiline strings.

   ```java
   String json = """
       {
           "name": "John",
           "age": 30
       }
       """;
   ```

5. **Enhanced Pseudo-Random Number Generators**:

   - New interfaces and implementations for PRNGs like `RandomGenerator`.

6. **JEP 356: Enhanced `NullPointerException`**:

   - Improves debugging with detailed messages.

   ```java
   // Example: "Cannot invoke method 'length' because 'str' is null"
   String str = null;
   str.length();
   ```

7. **Removal of Deprecated Features**:
   - `Applet API`, `RMI Activation`, and others were removed.

---

### **Key Features Added in Java 21 (from Java 17)**

1. **Scoped Values**:

   - Used for safe and structured sharing of data within threads.

   ```java
   ScopedValue<String> SCOPED_VALUE = ScopedValue.newInstance();
   ScopedValue.where(SCOPED_VALUE, "value").run(() -> {
       System.out.println(SCOPED_VALUE.get());
   });
   ```

2. **Virtual Threads (Project Loom)**:

   - Lightweight threads for handling concurrency.

   ```java
   try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
       executor.submit(() -> System.out.println("Hello from virtual thread!"));
   }
   ```

3. **Sequenced Collections**:

   - Adds ordering to `Set` and `Map` collections.

   ```java
   SequencedMap<String, Integer> map = new LinkedHashMap<>();
   map.put("One", 1);
   map.put("Two", 2);
   System.out.println(map.firstKey()); // "One"
   ```

4. **Record Patterns**:

   - Extends pattern matching capabilities.

   ```java
   record Point(int x, int y) {}
   Object obj = new Point(1, 2);
   if (obj instanceof Point(int x, int y)) {
       System.out.println("Point coordinates: " + x + ", " + y);
   }
   ```

5. **String Templates (Preview)**:

   - Simplifies string interpolation.

   ```java
   String name = "Alice";
   int age = 30;
   System.out.println(STR."Hello, my name is \{name} and I am \{age} years old.");
   ```

6. **Unnamed Classes and Instance Main Methods**:

   - Simplifies boilerplate for quick prototyping.

   ```java
   // Example: A simple unnamed class with a main method
   void main() {
       System.out.println("Hello, Java 21!");
   }
   ```

7. **Deprecations and Removals**:
   - Deprecated APIs are cleaned up to make the language leaner.

---

### **Most Useful Features for Developers**

#### 1. **Java 11**:

- HTTP Client for modern web communication.
- Improved file handling (`Files.readString()` and `writeString()`).
- String utility methods.

#### 2. **Java 17**:

- Sealed classes for better polymorphism control.
- Records for concise immutable classes.
- Enhanced `NullPointerException` messages.

#### 3. **Java 21**:

- Virtual Threads for scalable concurrency.
- Sequenced Collections to simplify ordered data processing.
- Scoped Values for thread-local-like behavior.
- String Templates for cleaner code in dynamic strings.

---

### **Conclusion**

- **For upgrading from Java 8 to Java 11**: The focus is on utility methods, modern HTTP handling, and performance improvements.
- **For upgrading from Java 11 to Java 17**: Use sealed classes, records, and pattern matching for better code expressiveness.
- **For upgrading to Java 21**: Leverage virtual threads and string templates for scalable and cleaner applications.

Each version enhances Java for modern application development, with Java 21 bringing substantial improvements in concurrency and code readability.
