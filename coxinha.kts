import java.util.Scanner;

fun main(args: Array<String>) {

    val leitor = Scanner(System.in);
    val valor = leitor.nextLine().split(" ");
    val H = valor[0].toDouble();
    val P = valor[0].toDouble();

    val media: Double = H / P;
    println(String.format("%.2f", media));
}