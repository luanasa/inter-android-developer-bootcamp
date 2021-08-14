import java.util.Scanner;

fun main() {

    val reader = Scanner(System.`in`)

    val x: Int = reader.nextInt();
    val y: Float = reader.nextFloat()

    val media: Float = (x / y).toFloat()

    println(String.format("%.3f km/l", media))
}