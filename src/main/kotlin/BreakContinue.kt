fun main() {

    var i = 0;
    while (true) {
        println("Break Me")
        i++
        if( i > 1000) {
            break
        }
    }

    for (i in 1..1000) {
        if (i% 2 == 0) {
            continue
        }
        println(i)
    }
}