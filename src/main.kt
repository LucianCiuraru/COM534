fun main(){
    val Lucian = Student("Lucian","Lucian", course = "Computer Science", mark = 9.66)
    println(Lucian)
    while(true){
        print("Enter student name (or 'quit' to exit):")
        val name = readln()
        if (name.equals("quit",ignoreCase = true)){
            break
        }
        print("Enter student ID:")
        val id = readln()

        print("Enter your student course:")
        val course = readln()

        print("Enter your mark: ")
        val mark = readln().toDouble()

        val student= Student(id = id,name = name,course = course, mark = mark)
        println(student)
    }
}