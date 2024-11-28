Here’s the comprehensive combined list of questions covering **Core Java**, **Servlets**, **JSP**, **Spring**, **Hibernate**, **JDBC**, **MVC**, **JUnit**, and **Swagger**:

---

### **Core Java (25 Questions)**

1. What are the four principles of Object-Oriented Programming in Java? Provide examples.
2. Explain the difference between `final`, `finally`, and `finalize`.
3. What is the difference between checked and unchecked exceptions in Java?
4. How does `HashMap` differ from `HashTable` in Java?
5. Describe the working of the `synchronized` keyword. How does it differ from `ReentrantLock`?
6. Explain `Serializable` and `Externalizable` interfaces with examples.
7. What are Java annotations, and how are they used? Provide examples of custom annotations.
8. What is the purpose of the `transient` and `volatile` keywords in Java?
9. Explain the difference between `equals()` and `==`. How can you override the `equals()` method effectively?
10. Describe the Java Memory Model and how garbage collection works.
11. How do you implement custom exceptions in Java?
12. What is the difference between an abstract class and an interface? Provide real-world examples.
13. How does the `ConcurrentHashMap` differ from a `HashMap`?
14. What is the purpose of the `Callable` interface, and how is it different from `Runnable`?
15. Explain the difference between the `Iterator` and `ListIterator` interfaces.
16. How does the Java `Stream` API help in functional programming? Provide examples.
17. What is the purpose of the `CompletableFuture` class in Java?
18. How is the `java.util.Optional` class used to handle null values?
19. What are lambda expressions in Java? How do they simplify code?
20. Explain method references in Java with examples.
21. How does the `ForkJoinPool` framework work for parallelism in Java?
22. What is the difference between heap and stack memory in Java?
23. How does Java handle multithreading using the `ExecutorService`?
24. Explain the purpose of `StringBuilder` and `StringBuffer`. How do they differ?
25. What is a deadlock in Java? How can it be avoided?

---

### **Servlets (10 Questions)**

26. How does the servlet lifecycle work? Explain the role of the `init()`, `service()`, and `destroy()` methods.
27. What is the difference between `doGet()` and `doPost()` in servlets?
28. Explain how session management works in servlets. What are cookies, session tracking, and URL rewriting?
29. How do you handle file uploads in a servlet?
30. What is a `RequestDispatcher`? How does it differ from `sendRedirect()`?
31. What are servlet filters, and how are they used in web applications?
32. How do you secure a servlet-based web application?
33. What are the best practices for handling large file uploads in servlets?
34. How does a servlet interact with JSP in the MVC pattern?
35. What are the key security concerns for servlet-based applications, and how can they be mitigated?

---

### **JSP (10 Questions)**

36. What are the implicit objects in JSP? Explain their purposes.
37. How do JSP and servlets differ? When would you use one over the other?
38. Explain JSP lifecycle methods. How is it translated into a servlet?
39. What is the difference between `<jsp:include>` and `<%@ include %>`?
40. What are custom tags in JSP, and how do you create them?
41. What are expression language (EL) and its advantages in JSP?
42. How does JSP handle custom error pages?
43. What is the purpose of the JSP standard tag library (JSTL)?
44. How do you manage session attributes in JSP?
45. How can JSPs be secured in a web application?

---

### **Spring Framework (25 Questions)**

46. What are the differences between Spring `@Component`, `@Service`, `@Repository`, and `@Controller` annotations?
47. Explain dependency injection in Spring. How does it work?
48. How do you configure a Spring application using Java-based configuration?
49. What is the difference between `BeanFactory` and `ApplicationContext` in Spring?
50. What are the different scopes of Spring beans? Explain with examples.
51. What is the role of `@Transactional` in Spring?
52. How does Spring Security work? Explain the authentication and authorization processes.
53. What is Spring Boot, and how does it differ from the traditional Spring Framework?
54. How does the `@RestController` annotation work in Spring MVC?
55. Explain the use of `@Autowired`, `@Qualifier`, and `@Primary`.
56. What is Spring AOP, and how is it used for cross-cutting concerns?
57. How does Spring handle circular dependencies?
58. What is the role of `@EnableAutoConfiguration` in Spring Boot?
59. How do you implement scheduling tasks in Spring?
60. Explain the difference between `@RequestBody` and `@ResponseBody` annotations in Spring MVC.
61. What is the use of `@PathVariable` and `@RequestParam`? Provide examples.
62. How does Spring Boot handle application properties through `application.properties` and `application.yml`?
63. What is the Spring WebClient, and how does it differ from RestTemplate?
64. How does Spring handle caching with `@Cacheable` and `@CacheEvict`?
65. Explain how internationalization (i18n) is implemented in a Spring application.
66. How do you monitor a Spring Boot application using Actuator?
67. What is the `Environment` object in Spring? How is it used for profile-specific configuration?
68. How do you implement event-driven programming using the `ApplicationEventPublisher` in Spring?
69. What are the differences between `@Bean`, `@Configuration`, and `@Component`?

---

### **Hibernate (15 Questions)**

70. What is the difference between Hibernate's `save()` and `persist()` methods?
71. Explain the concept of lazy loading and eager loading in Hibernate.
72. How does Hibernate manage transactions? What is the role of the `Session` and `Transaction` interfaces?
73. What is the use of the `@OneToMany` and `@ManyToOne` annotations in Hibernate? Provide examples.
74. What are the differences between Hibernate and JPA?
75. What is the difference between the first-level and second-level cache in Hibernate?
76. Explain the `@JoinTable` and `@JoinColumn` annotations in Hibernate.
77. What are HQL and Criteria APIs in Hibernate? How do they differ?
78. How does Hibernate handle optimistic locking? What annotations are used?
79. What is the N+1 problem in Hibernate, and how can it be resolved?
80. How do you configure Hibernate in a Spring Boot application?
81. What is the difference between a `Session` and a `SessionFactory` in Hibernate?
82. How does the `@MappedSuperclass` annotation work in Hibernate?
83. Explain the concept of `@Inheritance` in Hibernate. What are the different strategies?
84. How does Hibernate handle bidirectional relationships? Provide an example.

---

### **JDBC (10 Questions)**

85. Explain the JDBC architecture and its components.
86. How does a PreparedStatement differ from a Statement in JDBC?
87. What are the different types of JDBC drivers? Which one is the most commonly used?
88. Explain batch processing in JDBC with an example.
89. What is a Connection Pool, and how is it implemented in JDBC?
90. How do you handle transactions in JDBC? Provide an example.
91. What is the role of the `ResultSet` interface in JDBC?
92. How do you use CallableStatement to execute stored procedures in JDBC?
93. What is a SQL injection, and how can it be prevented in JDBC?
94. How is connection pooling implemented in JDBC?

---

### **MVC Architecture (5 Questions)**

95. What is the MVC design pattern, and how is it implemented in Java?
96. How does Spring MVC map requests to controllers? What is the role of `@RequestMapping`?
97. Explain the use of `Model`, `ModelAndView`, and `View` in Spring MVC.
98. How does form handling work in Spring MVC? Provide an example.
99. What are the benefits of using the MVC pattern?

---

### **JUnit (10 Questions)**

100. How do you write a test case in JUnit? Explain with an example.
101. What is the difference between `@Before`, `@BeforeClass`, `@After`, and `@AfterClass` annotations?
102. How do you test exceptions in JUnit?
103. What is mocking? How do you use the Mockito framework in JUnit tests?
104. Explain parameterized tests in JUnit.
105. What are test suites in JUnit? How are they implemented?
106. Explain the difference between unit testing and integration testing.
107. How do you test RESTful APIs using JUnit and MockMvc in Spring Boot?
108. How do you ensure code coverage in JUnit testing?
109. How do you mock external dependencies in JUnit tests?

---

### **Swagger (10 Questions)**

110. What is Swagger, and why is it used in API development?
111. How do you configure Swagger in a Spring Boot application?
112. What is the difference between OpenAPI 2.0 (Swagger 2) and OpenAPI 3.0?
113. How does Swagger generate API documentation? Explain the role of annotations like `@Api`, `@ApiOperation`, and `@ApiParam`.
114. What

are Swagger tags, and how are they used to organize APIs? 115. How do you secure Swagger UI in a production environment? 116. Explain the purpose of the `@Schema` annotation in OpenAPI 3.0. 117. How do you use Swagger to test APIs interactively? 118. How do you enable filtering and sorting in Swagger documentation? 119. How does Swagger integrate with tools like Postman or other API clients?

## Answer the following questions in the comments below:

### **1. What are the four principles of Object-Oriented Programming in Java? Provide examples.**

The four principles of Object-Oriented Programming (OOP) are **Encapsulation**, **Inheritance**, **Polymorphism**, and **Abstraction**.

#### **Encapsulation**

Encapsulation involves wrapping data (fields) and methods (functions) into a single unit, typically a class, and restricting access to some components using access modifiers (`private`, `protected`, `public`).

**Example:**

```java
class BankAccount {
    private double balance; // Private field

    public void deposit(double amount) { // Public method
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() { // Public getter
        return balance;
    }
}
```

#### **Inheritance**

Inheritance allows a class to acquire properties and methods from another class using the `extends` keyword.

**Example:**

```java
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Inherited from Animal
        dog.bark(); // Dog-specific
    }
}
```

#### **Polymorphism**

Polymorphism allows methods to take different forms, enabling method overloading (compile-time) or method overriding (runtime).

**Example: Method Overloading**

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```

**Example: Method Overriding**

```java
class Parent {
    void display() {
        System.out.println("Parent display");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Child display");
    }
}
```

#### **Abstraction**

Abstraction hides the implementation details from the user and provides only essential information using abstract classes or interfaces.

**Example:**

```java
abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key.");
    }
}
```

---

### **2. Explain the difference between `final`, `finally`, and `finalize`.**

1. **`final`:**
   - Modifier that can be applied to classes, methods, or variables.
   - A `final` class cannot be extended.
   - A `final` method cannot be overridden.
   - A `final` variable cannot be reassigned.

**Example:**

```java
final class Constants {
    static final double PI = 3.14159;
}
```

2. **`finally`:**
   - A block used in exception handling that executes after a `try` block, regardless of whether an exception occurred or not.

**Example:**

```java
try {
    int result = 10 / 2;
} catch (ArithmeticException e) {
    System.out.println("Exception: " + e.getMessage());
} finally {
    System.out.println("This will always execute.");
}
```

3. **`finalize`:**
   - A method called by the garbage collector before an object is destroyed.
   - Rarely used and deprecated in Java 9.

**Example:**

```java
class Resource {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizing...");
    }
}
```

---

### **3. What is the difference between checked and unchecked exceptions in Java?**

1. **Checked Exceptions:**
   - Checked at compile-time.
   - Requires handling using `try-catch` or declared with `throws`.
   - Example: `IOException`, `SQLException`.

**Example:**

```java
void readFile() throws IOException {
    FileReader reader = new FileReader("file.txt");
}
```

2. **Unchecked Exceptions:**
   - Checked at runtime.
   - Extends `RuntimeException`.
   - Example: `NullPointerException`, `ArrayIndexOutOfBoundsException`.

**Example:**

```java
int[] arr = {1, 2, 3};
System.out.println(arr[5]); // Runtime exception
```

---

### **4. How does `HashMap` differ from `HashTable` in Java?**

| Feature       | `HashMap`                                        | `HashTable`                          |
| ------------- | ------------------------------------------------ | ------------------------------------ |
| Thread-Safety | Not thread-safe                                  | Thread-safe                          |
| Performance   | Faster due to no synchronization                 | Slower due to synchronization        |
| Null Values   | Allows one `null` key and multiple `null` values | Does not allow `null` keys or values |
| Introduced    | Java 1.2                                         | Java 1.0                             |

**Example:**

```java
HashMap<Integer, String> map = new HashMap<>();
map.put(1, "One");

Hashtable<Integer, String> table = new Hashtable<>();
table.put(1, "One");
```

---

### **5. Describe the working of the `synchronized` keyword. How does it differ from `ReentrantLock`?**

1. **`synchronized`:**
   - Ensures that only one thread can access a block or method at a time.
   - Simple to use but less flexible.

**Example:**

```java
synchronized void increment() {
    counter++;
}
```

2. **`ReentrantLock`:**
   - Provides advanced locking mechanisms.
   - Offers features like try-lock, time-based locking, and interruptible locks.

**Example:**

```java
Lock lock = new ReentrantLock();
lock.lock();
try {
    counter++;
} finally {
    lock.unlock();
}
```

---

### **6. Explain `Serializable` and `Externalizable` interfaces with examples.**

1. **Serializable:**
   - Marker interface to serialize objects automatically.

**Example:**

```java
class User implements Serializable {
    private String name;
    private int age;
}
```

2. **Externalizable:**
   - Provides control over serialization by implementing `writeExternal()` and `readExternal()`.

**Example:**

```java
class User implements Externalizable {
    private String name;

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
    }
}
```

### **7. What are Java annotations, and how are they used? Provide examples of custom annotations.**

#### **Java Annotations**

Annotations are metadata that provide information about a program but do not affect its execution. They are used for:

1. **Compilation checks** (e.g., `@Override`, `@Deprecated`).
2. **Runtime processing** (e.g., `@Entity` in JPA).
3. **Code generation** (e.g., Lombok's `@Getter`).

#### **Built-in Annotations**

- `@Override`: Ensures a method overrides a superclass method.
- `@Deprecated`: Marks a method or class as deprecated.
- `@SuppressWarnings`: Suppresses compiler warnings.

**Example:**

```java
class Parent {
    void display() {
        System.out.println("Parent display");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Child display");
    }
}
```

#### **Custom Annotations**

Custom annotations are created using the `@interface` keyword and can include metadata.

**Example:**

```java
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CustomAnnotation {
    String value();
    int priority() default 1;
}

class AnnotatedClass {
    @CustomAnnotation(value = "Test", priority = 2)
    public void testMethod() {
        System.out.println("Executing annotated method.");
    }
}
```

**Processing Custom Annotations:**

```java
public class AnnotationProcessor {
    public static void main(String[] args) throws Exception {
        Method method = AnnotatedClass.class.getMethod("testMethod");
        CustomAnnotation annotation = method.getAnnotation(CustomAnnotation.class);
        System.out.println("Value: " + annotation.value());
        System.out.println("Priority: " + annotation.priority());
    }
}
```

---

### **8. What is the purpose of the `transient` and `volatile` keywords in Java?**

#### **`transient`:**

- Used to skip serialization of certain fields in a class.
- Transient fields are not serialized during object serialization.

**Example:**

```java
class User implements Serializable {
    private String username;
    private transient String password; // Will not be serialized
}
```

#### **`volatile`:**

- Ensures changes made to a variable by one thread are visible to other threads.
- Prevents caching of the variable in thread-local memory.

**Example:**

```java
class SharedResource {
    private volatile boolean running = true;

    public void stop() {
        running = false;
    }
}
```

---

### **9. Explain the difference between `equals()` and `==`. How can you override the `equals()` method effectively?**

#### **`==`:**

- Compares references (for objects) or values (for primitives).

#### **`equals()`:**

- Compares the logical content of objects.
- Default `equals()` in `Object` checks references; it must be overridden for custom comparison.

**Example:**

```java
class User {
    private String name;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return Objects.equals(name, user.name);
    }
}
```

---

### **10. Describe the Java Memory Model and how garbage collection works.**

#### **Java Memory Model (JMM):**

1. **Heap Memory:** Stores objects and class-level variables.
2. **Stack Memory:** Stores method-specific values and references.
3. **Method Area:** Stores metadata about classes.
4. **Program Counter (PC) Register:** Tracks JVM execution.

#### **Garbage Collection (GC):**

GC automatically removes unused objects from heap memory.

**Phases:**

1. **Mark:** Identifies reachable objects.
2. **Sweep:** Removes unreachable objects.
3. **Compaction:** Reorganizes heap memory.

**Example of GC Trigger:**

```java
class Demo {
    public static void main(String[] args) {
        Demo d = new Demo();
        d = null; // Eligible for GC
        System.gc();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object finalized.");
    }
}
```

---

### **11. How do you implement custom exceptions in Java?**

Custom exceptions are created by extending `Exception` (checked) or `RuntimeException` (unchecked).

**Example:**

```java
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Main {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
    }
}
```

---

### **12. What is the difference between an abstract class and an interface? Provide real-world examples.**

| Feature              | Abstract Class      | Interface             |
| -------------------- | ------------------- | --------------------- |
| Multiple Inheritance | Not supported       | Supported             |
| Default Methods      | Allowed             | Allowed (from Java 8) |
| Use Case             | Partial abstraction | Full abstraction      |

**Example:**

```java
abstract class Vehicle {
    abstract void start();
}

interface Drivable {
    void drive();
}

class Car extends Vehicle implements Drivable {
    @Override
    void start() {
        System.out.println("Car starts with a key.");
    }

    @Override
    public void drive() {
        System.out.println("Car is driving.");
    }
}
```

---

### **13. How does the `ConcurrentHashMap` differ from a `HashMap`?**

| Feature          | `HashMap`                                     | `ConcurrentHashMap`               |
| ---------------- | --------------------------------------------- | --------------------------------- |
| Thread-Safety    | Not thread-safe                               | Thread-safe                       |
| Null Keys/Values | Allows one `null` key, multiple `null` values | Does not allow `null` keys/values |
| Performance      | Faster for single-threaded apps               | Optimized for multi-threading     |

**Example:**

```java
ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
map.put(1, "One");
```

---

### **14. What is the purpose of the `Callable` interface, and how is it different from `Runnable`?**

| Feature            | `Runnable`                      | `Callable`                   |
| ------------------ | ------------------------------- | ---------------------------- |
| Return Value       | Does not return a value         | Returns a value (`Future`)   |
| Exception Handling | Cannot throw checked exceptions | Can throw checked exceptions |

**Example:**

```java
class MyCallable implements Callable<String> {
    @Override
    public String call() {
        return "Task completed!";
    }
}

ExecutorService executor = Executors.newSingleThreadExecutor();
Future<String> result = executor.submit(new MyCallable());
```

---

### **15. Explain the difference between the `Iterator` and `ListIterator` interfaces.**

| Feature                | `Iterator`      | `ListIterator`              |
| ---------------------- | --------------- | --------------------------- |
| Traversal Direction    | Forward-only    | Forward and backward        |
| Add Elements           | Not supported   | Supported                   |
| Applicable Collections | All collections | List-based collections only |

**Example:**

```java
List<String> list = Arrays.asList("A", "B", "C");
ListIterator<String> iterator = list.listIterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
```

### **16. How does the Java `Stream` API help in functional programming? Provide examples.**

The `Stream` API enables functional-style operations on collections, providing a concise way to manipulate data with features like filtering, mapping, and reducing. It supports:

- **Declarative programming**: Specify _what_ to do instead of _how_ to do it.
- **Lazy evaluation**: Operations are executed only when needed.
- **Parallelism**: Easy parallel processing with `parallelStream()`.

**Common Operations:**

1. **Filter**: Select elements based on a condition.
2. **Map**: Transform elements.
3. **Reduce**: Aggregate elements.

**Example:**

```java
import java.util.*;
import java.util.stream.*;

class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Filter even numbers
        List<Integer> evens = numbers.stream()
                                     .filter(n -> n % 2 == 0)
                                     .collect(Collectors.toList());
        System.out.println("Even numbers: " + evens);

        // Square each number
        List<Integer> squares = numbers.stream()
                                       .map(n -> n * n)
                                       .collect(Collectors.toList());
        System.out.println("Squares: " + squares);

        // Sum of all numbers
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);
    }
}
```

---

### **17. What is the purpose of the `CompletableFuture` class in Java?**

`CompletableFuture` is part of the `java.util.concurrent` package that enables asynchronous programming. It allows you to:

1. **Run tasks asynchronously.**
2. **Chain multiple tasks** with methods like `thenApply()`, `thenAccept()`.
3. **Handle exceptions** with `exceptionally()`.

**Example:**

```java
import java.util.concurrent.*;

class CompletableFutureExample {
    public static void main(String[] args) {
        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Performing async task...");
            return "Result";
        }).thenApply(result -> {
            System.out.println("Processing: " + result);
            return result + " processed";
        }).thenAccept(finalResult -> System.out.println("Final output: " + finalResult));

        future.join(); // Block and wait for completion
    }
}
```

---

### **18. How is the `java.util.Optional` class used to handle null values?**

`Optional` is a container for potentially null values. It helps avoid `NullPointerException` by:

1. **Providing default values** using `orElse()`.
2. **Executing actions if a value exists** using `ifPresent()`.

**Example:**

```java
import java.util.Optional;

class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable(getNullableValue());

        // Check if value is present
        optional.ifPresent(value -> System.out.println("Value: " + value));

        // Provide default value
        String result = optional.orElse("Default Value");
        System.out.println("Result: " + result);
    }

    public static String getNullableValue() {
        return null; // Simulating a nullable value
    }
}
```

---

### **19. What are lambda expressions in Java? How do they simplify code?**

Lambda expressions are concise representations of functional interfaces (interfaces with a single abstract method). They:

1. **Reduce boilerplate code**.
2. **Simplify passing behavior as arguments**.
3. **Enable functional programming**.

**Syntax:**

```java
(parameters) -> { body }
```

**Example:**

```java
import java.util.*;

class LambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Traditional for loop
        for (String name : names) {
            System.out.println(name);
        }

        // Lambda expression
        names.forEach(name -> System.out.println(name));
    }
}
```

---

### **20. Explain method references in Java with examples.**

Method references simplify lambda expressions when a method already exists for the operation. They use `::` and can refer to:

1. **Static methods**: `ClassName::methodName`.
2. **Instance methods**: `instance::methodName`.
3. **Constructors**: `ClassName::new`.

**Example:**

```java
import java.util.*;

class MethodReferenceExample {
    public static void print(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using a lambda expression
        names.forEach(name -> MethodReferenceExample.print(name));

        // Using a method reference
        names.forEach(MethodReferenceExample::print);
    }
}
```

---

### **21. How does the `ForkJoinPool` framework work for parallelism in Java?**

The `ForkJoinPool` framework divides a task into smaller subtasks (fork) and combines their results (join). It supports **divide-and-conquer**.

**Key Classes:**

1. **RecursiveAction**: For tasks that return no result.
2. **RecursiveTask**: For tasks that return a result.

**Example:**

```java
import java.util.concurrent.*;

class SumTask extends RecursiveTask<Integer> {
    private int[] array;
    private int start, end;

    public SumTask(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if (end - start <= 10) { // Base case
            int sum = 0;
            for (int i = start; i < end; i++) {
                sum += array[i];
            }
            return sum;
        } else { // Split task
            int mid = (start + end) / 2;
            SumTask leftTask = new SumTask(array, start, mid);
            SumTask rightTask = new SumTask(array, mid, end);

            leftTask.fork();
            return rightTask.compute() + leftTask.join();
        }
    }
}

class ForkJoinExample {
    public static void main(String[] args) {
        int[] array = new int[100];
        Arrays.fill(array, 1);

        ForkJoinPool pool = new ForkJoinPool();
        int result = pool.invoke(new SumTask(array, 0, array.length));
        System.out.println("Sum: " + result);
    }
}
```

---

### **22. What is the difference between heap and stack memory in Java?**

| Feature       | Heap Memory                     | Stack Memory                       |
| ------------- | ------------------------------- | ---------------------------------- |
| Storage       | Objects, global variables       | Method-local variables, references |
| Lifetime      | Exists until GC removes objects | Exists until method execution ends |
| Thread-safety | Shared across threads           | Thread-local                       |

---

### **23. How does Java handle multithreading using the `ExecutorService`?**

The `ExecutorService` is part of the `java.util.concurrent` package, providing a framework to manage a pool of threads. It simplifies thread management by decoupling task submission from execution.

**Features:**

1. **Thread Pool Management**: Reuses threads to minimize overhead.
2. **Task Submission**: Executes `Runnable` or `Callable` tasks.
3. **Graceful Shutdown**: Stops accepting new tasks while completing existing ones.

**Example:**

```java
import java.util.concurrent.*;

class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Runnable task = () -> System.out.println(Thread.currentThread().getName() + " is executing a task");

        for (int i = 0; i < 5; i++) {
            executor.submit(task);
        }

        executor.shutdown(); // Prevents new tasks from being submitted
    }
}
```

---

### **24. Explain the purpose of `StringBuilder` and `StringBuffer`. How do they differ?**

Both `StringBuilder` and `StringBuffer` are used for mutable string operations, avoiding the overhead of creating new `String` objects for each modification. The key difference lies in **thread safety**:

- **StringBuffer**: Thread-safe (synchronized).
- **StringBuilder**: Not thread-safe (faster in single-threaded operations).

**Example:**

```java
public class StringExample {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello");
        builder.append(" World");
        System.out.println("StringBuilder: " + builder);

        StringBuffer buffer = new StringBuffer("Hello");
        buffer.append(" World");
        System.out.println("StringBuffer: " + buffer);
    }
}
```

---

### **25. What is a deadlock in Java? How can it be avoided?**

A **deadlock** occurs when two or more threads block each other indefinitely while waiting for resources. It happens when:

1. Threads acquire locks in inconsistent orders.
2. Circular dependencies exist between threads.

**Example of Deadlock:**

```java
class DeadlockExample {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: Holding lock 1...");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                synchronized (lock2) {
                    System.out.println("Thread 1: Acquired lock 2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2: Holding lock 2...");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                synchronized (lock1) {
                    System.out.println("Thread 2: Acquired lock 1");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
```

**Avoiding Deadlock:**

1. **Lock Ordering**: Always acquire locks in the same order.
2. **Timeouts**: Use `tryLock()` with a timeout for acquiring locks.
3. **Thread Dump Analysis**: Debug using thread dumps.

**Avoiding Deadlock Example:**

```java
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class DeadlockFreeExample {
    private static final Lock lock1 = new ReentrantLock();
    private static final Lock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> executeLocks(lock1, lock2));
        Thread thread2 = new Thread(() -> executeLocks(lock2, lock1));

        thread1.start();
        thread2.start();
    }

    private static void executeLocks(Lock lockA, Lock lockB) {
        try {
            if (lockA.tryLock()) {
                System.out.println(Thread.currentThread().getName() + " acquired lockA");
                try { Thread.sleep(50); } catch (InterruptedException e) {}
                if (lockB.tryLock()) {
                    System.out.println(Thread.currentThread().getName() + " acquired lockB");
                    lockB.unlock();
                }
                lockA.unlock();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

### **26. How does the servlet lifecycle work? Explain the role of the `init()`, `service()`, and `destroy()` methods.**

The **servlet lifecycle** defines the process by which a servlet is loaded, initialized, handles requests, and is eventually destroyed by the server.

1. **Servlet Loading and Instantiation**:

   - The web container loads the servlet class and creates an instance when the servlet is first requested or during server startup if configured for early loading.

2. **Initialization (`init()` method)**:

   - Called once when the servlet instance is created.
   - Used to initialize resources, such as database connections.

   ```java
   public void init(ServletConfig config) throws ServletException {
       super.init(config);
       System.out.println("Servlet initialized");
   }
   ```

3. **Request Handling (`service()` method)**:

   - Invoked for every incoming request.
   - The container determines the HTTP method (`GET`, `POST`, etc.) and calls the appropriate method (`doGet()`, `doPost()`).

   ```java
   protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
       System.out.println("Request handled");
       super.service(req, res);
   }
   ```

4. **Destruction (`destroy()` method)**:
   - Called once before the servlet is removed from memory.
   - Used to release resources.
   ```java
   public void destroy() {
       System.out.println("Servlet destroyed");
   }
   ```

---

### **27. What is the difference between `doGet()` and `doPost()` in servlets?**

| **Aspect**      | **doGet()**                                  | **doPost()**                                     |
| --------------- | -------------------------------------------- | ------------------------------------------------ |
| **Purpose**     | Retrieves data from the server.              | Submits data to the server.                      |
| **Data in URL** | Appends data to the URL as query parameters. | Sends data in the request body (hidden).         |
| **Size Limit**  | Limited by URL length (varies by browser).   | No size limitation (depends on server settings). |
| **Caching**     | Cached by default.                           | Not cached by default.                           |
| **Use Case**    | Fetching data (e.g., search queries).        | Sending sensitive data (e.g., login forms).      |

---

**Example:**

```java
protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    res.getWriter().println("GET request processed");
}

protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    String data = req.getParameter("data");
    res.getWriter().println("POST request processed: " + data);
}
```

---

### **28. Explain how session management works in servlets. What are cookies, session tracking, and URL rewriting?**

1. **Cookies**:

   - Small text files stored on the client-side.
   - Used to identify a user and maintain state.

   ```java
   Cookie cookie = new Cookie("username", "john");
   response.addCookie(cookie);
   ```

2. **Session Tracking**:

   - Uses `HttpSession` to store user data server-side.
   - Each user is assigned a unique session ID.

   ```java
   HttpSession session = request.getSession();
   session.setAttribute("user", "John");
   ```

3. **URL Rewriting**:
   - Appends session ID to the URL if cookies are disabled.
   ```java
   String url = response.encodeURL("profile");
   ```

---

### **29. How do you handle file uploads in a servlet?**

- Use Apache Commons FileUpload or Servlet 3.0 file upload features.

**Example:**

```java
@MultipartConfig
public class FileUploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        Part filePart = req.getPart("file");
        String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();
        filePart.write("upload/" + fileName);
        res.getWriter().println("File uploaded: " + fileName);
    }
}
```

---

### **30. What is a `RequestDispatcher`? How does it differ from `sendRedirect()`?**

| **Aspect**      | **RequestDispatcher**                        | **sendRedirect()**                              |
| --------------- | -------------------------------------------- | ----------------------------------------------- |
| **Scope**       | Forwards or includes within the same server. | Redirects to a different URL (may be external). |
| **Performance** | Faster as it doesn't involve a new request.  | Slower as it creates a new request.             |
| **URL Change**  | URL remains the same.                        | URL changes in the browser.                     |

---

**Example:**

```java
// Forwarding with RequestDispatcher
RequestDispatcher dispatcher = request.getRequestDispatcher("destination.jsp");
dispatcher.forward(request, response);

// Redirecting with sendRedirect
response.sendRedirect("http://example.com");
```

---

### **31. What are servlet filters, and how are they used in web applications?**

Filters intercept requests and responses to perform preprocessing or postprocessing.

**Use Cases**:

- Authentication and authorization.
- Logging and auditing.
- Compression or modification of response data.

**Example:**

```java
@WebFilter("/secured/*")
public class AuthenticationFilter implements Filter {
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) req;
        String user = (String) httpRequest.getSession().getAttribute("user");
        if (user != null) {
            chain.doFilter(req, res);
        } else {
            res.getWriter().println("Unauthorized");
        }
    }
}
```

---

### **32. How do you secure a servlet-based web application?**

- Use HTTPS to encrypt data transmission.
- Implement authentication (e.g., form-based, HTTP Basic).
- Sanitize user inputs to prevent SQL injection and XSS.
- Use servlet filters for security checks.
- Set proper HTTP headers (`Content-Security-Policy`, `X-Content-Type-Options`).

---

### **33. What are the best practices for handling large file uploads in servlets?**

- Set a file size limit.
- Stream the file instead of loading it entirely into memory.
- Use a temporary directory for uploads.
- Provide progress indicators to users.

**Example Configuration**:

```java
@MultipartConfig(
    fileSizeThreshold = 1024 * 1024 * 2, // 2MB
    maxFileSize = 1024 * 1024 * 10,      // 10MB
    maxRequestSize = 1024 * 1024 * 50   // 50MB
)
```

---

### **34. How does a servlet interact with JSP in the MVC pattern?**

- **Servlet**: Acts as the **controller**, processes requests, and sets attributes for JSP.
- **JSP**: Acts as the **view**, rendering the data for the user.
- **Model**: Represents the business logic or database interaction.

**Example:**

```java
// Servlet
request.setAttribute("message", "Welcome to MVC!");
RequestDispatcher dispatcher = request.getRequestDispatcher("view.jsp");
dispatcher.forward(request, response);
```

```jsp
<!-- JSP -->
<p>${message}</p>
```

---

### **35. What are the key security concerns for servlet-based applications, and how can they be mitigated?**

1. **SQL Injection**:

   - Use prepared statements or ORM frameworks.

   ```java
   PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users WHERE id = ?");
   stmt.setInt(1, userId);
   ```

2. **Cross-Site Scripting (XSS)**:

   - Escape user inputs before rendering.
   - Use libraries like OWASP ESAPI.

3. **Cross-Site Request Forgery (CSRF)**:

   - Use CSRF tokens in forms.

4. **Session Fixation**:

   - Regenerate session IDs after login.

5. **Sensitive Data Exposure**:

   - Use encryption for sensitive data.

6. **Error Handling**:
   - Avoid exposing stack traces to the user.

---

Would you like explanations for more advanced servlet concepts or practical implementations?
