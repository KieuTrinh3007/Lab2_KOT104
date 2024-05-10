package com.example.lab2

fun main () {
    var s : String?
    do {
        // Khai báo và sử dụng kĩ thuật safety

        var mssv : String? = null
        // var tenSV : String = null // Biến muốn gán giá trị null thì phải có dấu hỏi chấm
        println("Nhập mssv muốn tìm : ")
        s = readLine()
        mssv = s.toString()

        val tenSV = getTenSV(mssv!!) // thêm 2 dấu !! để loại bỏ null
        println("Tên Sinh Viên $tenSV có mssv là $mssv")
        print("Tiếp không?(c/k):")

        s = readLine()
        if (s == "k")
            break;
    } while (true)
    println("Kết thúc chương trình")


}

    val danhsachSV : Map<String, String> = mutableMapOf("PH31536" to "Pham Kieu Trinh", "PH12345" to "Nguyen Van A", "PH56432" to "Le Van C")

    fun getTenSV (mssv: String) : String? {

        val tenSV = danhsachSV.get(mssv)

        if(tenSV == null){
            println("Khong tim thay ten SV")
        }
        return  tenSV


}