package com.example.lab2

fun main() {
    println("\t\t\tWelcome to Lab 2")
    var continueProgram = true

    while (continueProgram) {
        println("1. Bài 1 \t 2. Bài 2 \t 3. Bài 3 \t 4. Kết thúc")
        var choice: Int
        var validInput: Boolean

        do {
            println("Vui lòng chọn một danh mục (1-4): ")
            val input = readLine()
            choice = input?.toIntOrNull() ?: 0
            validInput = choice in 1..4
            if (!validInput) {
                println("Nhập không hợp lệ. Vui lòng nhập số từ 1 đến 4.")
            }
        } while (!validInput)

        if (choice == 4) {
            println("Kết thúc chương trình!")
            continueProgram = false
        } else {
            chooseQuestion(choice)
        }
    }
}

fun chooseQuestion(choice: Int) {
    when (choice) {
        1 -> {
            bai1()
            askToContinue()
        }
        2 -> {
            bai2()
            askToContinue()
        }
        3 -> {
            bai3()
            askToContinue()
        }
        else -> println("Lựa chọn không hợp lệ.")
    }
}

fun askToContinue() {
    print("Tiếp không? (c/k): ")
    val input: String? = readLine()
    val continueProgram = input == "c" || input == "C"
    if (!continueProgram) {
        println("Kết thúc chương trình!")
    }
}



fun bai1 () {
    var a = 0.0
    var b = 0.0
    println("Nhập a:")
    var s = readLine()
    if (s != null) a = s.toDouble()
    println("Nhập b:")
    s = readLine()
    if (s != null) b = s.toDouble()
    if (a == 0.0 && b == 0.0) {
        println("Phương trình vô số nghiệm")
    } else if (a == 0.0 && b != 0.0) {
        println("Phương trình vô nghiệm")
    } else {
        val x = -b / a
        println("No x=" + x)
    }
}

fun bai2 () {
    var month = 0
    println("Nhập tháng:")
    val s: String? = readLine()
    if (s != null) month = s.toInt()
    when (month) {
        1, 2, 3 -> println("Tháng " + month + " thuộc quý 1")
        4, 5, 6 -> println("Tháng " + month + " thuộc quý 2")
        7, 8, 9 -> println("Tháng " + month + " thuộc quý 3")
        10, 11, 12 -> println("Tháng " + month + " thuộc quý 4")
        else -> println("Tháng " + month + " không hợp lệ")
    }
}

fun bai3 () {
    var year = 0
    var s: String?
    println("Chương trình kiểm tra năm nhuần:")
    do {
        println("Nhập 1 năm:")
        s = readLine()
        while (s == null || s.toInt() < 0) {
            println("Nhập sai năm, nhập lại:")
            s = readLine()
        }
        year = s.toInt()
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            println("Năm $year là năm nhuần")
        } else {
            println("Năm $year không phải là năm nhuần")
        }
        print("Tiếp không?(c/k):")
        s = readLine()
        if (s == "k")
            break;
    } while (true)
    println("Kết thúc chương trình")
}