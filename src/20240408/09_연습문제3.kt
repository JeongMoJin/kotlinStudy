package `20240408`

fun main() {
    /*
    컴퓨터가 주사위를 던지면 사용자가 주사위의 숫자를 맞히는 프로그램을 완성하세요.
	사용자가 맞힐 때까지 게임은 계속 됩니다.

	예)
	주사위 값은 얼마일까요? >>> 5
	오답입니다. 다시 시도하세요.
	주사위 값은 얼마일까요? >>> 1
	1! 정답입니다.

	1) break를 사용
	2) break를 사용안하는 경우
     */
    val question = (1..6).random()

    while (true) {
        print("주사위 값은 얼마일까요? >>> ")
        var answer = readln().toInt();
        if (question == answer) {
            println("${answer}! 정답입니다.")
            break;
        }
        println("오답입니다. 다시 시도하세요.")
    }

    do {
        print("주사위 값은 얼마일까요? >>> ")
        var answer = readln().toInt();
        println("오답입니다. 다시 시도하세요.")

        if (question == answer) {
            println("${answer}! 정답입니다.")
        }

    } while (answer != question)
}