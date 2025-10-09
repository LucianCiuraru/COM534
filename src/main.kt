fun main(){
    val lucian = Undergraduate("Lucian","Lucian", course = "Computer Science")
    lucian.mark = 96.00
    println(lucian)
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

        val student= Master(id = id,name = name,course = course)
        student.mark = mark
        println(student)
    }
}