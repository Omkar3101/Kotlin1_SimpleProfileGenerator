//Project 1 : Simple Profile Generator



fun main() {
    //take user input
    println("Enter your name: ")
    val name = readLine()?:""
    println("Enter your age: ")
    val age = readLine()?.toIntOrNull()?:0
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