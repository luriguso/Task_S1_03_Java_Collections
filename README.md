# 🍽️ Java Collections Practice – Lists, Sets, HashMaps

---

## 📄 Description

This project is a set of exercises designed to familiarize yourself with the use and application of **Java Collections** such as `ArrayList`, `HashSet`, `HashMap`, and iterators.  
It emphasizes managing duplicates, maintaining element order, reading from files, and working with randomized data.

> ⚠️ Use **Eclipse** or **IntelliJ IDEA** for all exercises.  
> ✅ Follow the best practices described in **Sprint 0**.  
> ✅ You can use **Maven**, **Gradle**, or plain **Java** projects.  
> ✅ All code must be written in **English**.

---

## 🎯 Objectives

- Become familiar with handling **Java Collections** to use them effectively in future implementations.

---

## 💻 Technologies Used

- Java 17+
- Eclipse / IntelliJ IDEA
- Maven / Gradle (optional)
- Git & GitHub for version control

---

## 📋 Requirements

- JDK 17 or higher
- Java IDE (Eclipse or IntelliJ recommended)
- Git installed locally
- Basic understanding of OOP concepts

---

## 🛠️ Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/luriguso/Task_S1_03_Java_Collections.git
   cd Task_S1_03_Java_Collections
   ```

2. Open the project in your IDE:
   - **Eclipse**: File → Open Projects from File System
   - **IntelliJ**: File → Open → Select project folder

3. If using Maven/Gradle, import dependencies or run:
   ```bash
   mvn clean install
   ```

---

## ▶️ Execution

- Navigate to the `Main` class in each level.
- Run the program to test each exercise's logic and output.

---

## 🌐 Deployment

This project is intended for **local educational use only** and is not intended to be deployed in a production environment.

---

## 🤝 Contributions

Contributions are welcome! To contribute:

1. Fork this repository.
2. Create a branch (`git checkout -b feature/my-feature`).
3. Commit your changes.
4. Push to your branch (`git push origin feature/my-feature`).
5. Open a Pull Request.

---

## 🧩 Exercises by Level

### 🔹 Level 1

#### Exercise 1
- Create a class `Month` with an attribute `name`.
- Create an `ArrayList` with 11 months (excluding August).
- Insert "August" in the correct position and ensure the list keeps the right order.
- Convert the `ArrayList` into a `HashSet` and ensure duplicates are not allowed.
- Iterate the list using both `for` loop and an `Iterator`.

#### Exercise 2
- Create and populate a `List<Integer>`.
- Create a second `List<Integer>` with the same values in reverse order.
- Use a `ListIterator` to insert the elements in reverse.

#### Exercise 3
- Read the file `countries.txt` and store its data in a `HashMap<String, String>`.
- Ask the user for their name.
- Show 10 random countries and ask the user to enter their capitals.
- Score the correct answers.
- Save the user’s name and score in a file named `classificacio.txt`.

---

### 🔹 Level 2

#### Exercise 1
- Create the `Restaurant` class with attributes `name` and `rating`.
- Override `equals()` and `hashCode()` to avoid duplicates in a `HashSet`.
- Allow restaurants with the same name but different ratings.

#### Exercise 2
- Sort the `Restaurant` objects by `name` and `rating` in descending order.
- Example:
  - `Restaurant1`, rating: 8
  - `Restaurant1`, rating: 7

---

## ✨ Author

**luriguso**  
🌐 [GitHub Profile](https://github.com/luriguso)
