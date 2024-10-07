fun main() {

    fun sayHello(name: String = ""): String {
//        if (name == "") {
//            return "Hello Bro!"
//        } else {
//            return "Hello $name"
//        }

        return when (name) {
            "" -> "Hello Bro!"
            else -> "Hello $name"
        }
    }

    println(sayHello())
    println(sayHello("Eko"))
}