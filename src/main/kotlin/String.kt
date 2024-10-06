fun main() {
    var firstName: String = "Eko"
    var lastName: String = "Khannedy"

    var address: String = """
        |Jalan belum jadi, RT 01 RW 03,
        |Kabupaten Subang,
        |Jawa Barat,
        |Indonesia
    """.trimMargin()

    println(firstName)
    println(lastName)
    println(address)

    var fullName: String = firstName + " " + lastName
    println(fullName)

    var firstName2: String = "Eko"
    var lastName2: String = "Khannedy"
    var fullName2: String = "$firstName2 $lastName2"
    var desc: String = "total $fullName2 char = ${fullName2.length}"

    println(fullName2)
    println(desc)
}