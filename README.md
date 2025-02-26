# Simple Profile Generator
A beginner-friendly Kotlin project that generates a basic **user profile** based on user input. This project is part of my **Kotlin learning journey.**

## Features
1. Takes user input like **name, age, and email.**
2. Beginner-friendly and easy to modify.

## Concepts Used
* val vs var (Immutable & Mutable variables)
* Kotlin **data types**(String, Int, etc.)
* **String templates** for better readability.

## Technologies Used
1. **Kotlin**
2. **IntelliJ IDEA**

## How to Run the Project?
### Clone the Repository
https://github.com/Omkar3101/Kotlin1_SimpleProfileGenerator.git

### Open in IntelliJ IDEA
* Open IntelliJ IDEA
* Select Open Project and navigate to the cloned repository

### Run the Project
* Open Main.kt file
* Click on Run or use Shift + F10

### Enter Credentials
* Enter **Email**, **Name** and **Age** when prompted.
* The system will validate your credentials.

## Code Overview

```kotlin
fun main() {
    //take user input
    println("Enter your name: ")
    val name = readLine()?:""
    println("Enter your age: ")
    var age = readLine()?.toIntOrNull()?:0
    println("Enter your email: ")
    val email = readLine()?:""

    //display user profile
    println("Profile Created Successfully")
    println("============================")
    println("Name : $name")
    println("Age : $age")
    println("Email : $email")
    println("============================")
}
```

## Future Improvement
* Add **more fields** (like hobbies, profession, etc.)
* Save profile data to a **file or database**
* Build a **GUI version** for a better user experience.

## License


## Let's Connect 
* Linkedin : https://www.linkedin.com/in/omkar3101
* Github : https://github.com/Omkar3101 
