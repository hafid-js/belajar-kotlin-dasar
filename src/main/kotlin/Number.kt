fun main() {
    var age: Byte = 30
    var height: Int = 170
    var distance: Short = 2000
    var balance: Long = 100000000L

    println(age)
    println(height)
    println(distance)
    println(balance)

    var sample: Float = 10.10F
    println(sample)

    var binary: Int = 0b0101010101
    println(binary)


    var age2: Byte = 3_0
    var height2: Int = 1_7_0
    var distance2: Short = 2_000
    var balance2: Long = 100_000_000L

    println(age2)
    println(height2)
    println(distance2)
    println(balance2)

    var number: Int = 100
    //conversation
    var byte: Byte = number.toByte()
    var short: Short = number.toShort()
    var int: Int = number.toInt()
    var long: Long = number.toLong()
    var float: Float = number.toFloat()
    var double: Double = number.toDouble()

    println(byte)
    println(short)
    println(int)
    println(long)
    println(float)
    println(double)


}