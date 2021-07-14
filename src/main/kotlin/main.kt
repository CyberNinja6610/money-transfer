import kotlin.math.max
import kotlin.math.roundToInt

const val MIN_COMMISSION = 3500;
const val COMMISSION_PERCENTAGE = 0.75;

fun main() {
    try {
        println("Введите сумму перевода (руб.)");
        val amount = readLine()!!.toInt() * 100;
        val commission = calculateCommission(amount);
        val commissionFormatted = commission / 100;
        println("Комиссия составляет $commissionFormatted рублей");
    } catch (e: Exception) {
        println("Введено некоректное значение");
    }
}

fun calculateCommission(amount: Int): Int {
    val commission = amount * COMMISSION_PERCENTAGE / 100;
    return max(commission.roundToInt(), MIN_COMMISSION);
}