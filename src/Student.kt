abstract class Student (protected val id: String, protected val name: String, protected val course: String){
    var mark = 0.0
        set(newMark){
            if(newMark in 0.0 .. 100.0){
                field = newMark
            }
        }

    abstract fun getGrade(): String
    fun didPass(): Boolean {
        return mark >= 40
    }
    override fun toString(): String {
        return "Name: $name, Course: $course, Grade: ${getGrade()}"
    }
}
class Undergraduate ( id: String, name: String, course: String): Student(id,name,course){
    override fun getGrade(): String {
        return when {
            mark >= 70 -> "First"
            mark >= 60 -> "2/1"
            mark >= 50 -> "2/2"
            mark >= 40 -> "Third"
            else -> "Fail"
        }
    }
}
class Master ( id: String, name: String, course: String) : Student(id,name,course){
    override fun getGrade(): String {
        return when {
            mark >= 70 -> "Distinction"
            mark >= 60 -> "Merit"
            mark >= 40 -> "Pass"
            else -> "Fail"
        }
    }
}