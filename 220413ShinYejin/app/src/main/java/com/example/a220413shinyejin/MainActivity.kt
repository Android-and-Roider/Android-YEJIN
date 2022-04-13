package com.example.a220413shinyejin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    //lateinit var tmp: String-lateinit var 변수명:타입 *앱 만들 때 자주 사용되니 잘 기억하기*

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val myTex = findViewById<TextView>(R.id,txt)




    }
}


class User {

    var name="Yejin"

    fun printMyName(){
        println("name: $name")

    }


}

fun main() {

    val Yejin: User

    Yejin.printMyName()
    //var_변수명=값
    //var 변수명:타입=값
    //var a=10 //Int 형 a 값=10 (1)
    //var b: Int=10 (2) ,(1)=(2) 같은 말, 코틀린은 객체

    //var b: string="10" -타입이 애매모호할 때 이렇게 써줌



}

//fun 함수명(Int r, Int a) ; 리턴 타입 {

}

//fun multiply(a:Int):Int {

    //return a*10
//}
//fun addNum(Int a, Int b)


//변수 선언
//var 변화 가능 변수, 객체가 아니라 데이터 위주,대부분 '숫자나 값' 위주
//val 변화 불가능 변수, 거의 객체 위주, ID 받아서 컴포넌트 할당할 때,액티비티 단위에선 객체 위주

//특수한 경우에 쓰임
//lazy 늦은 선언,데이터 위주
//lateinit 늦은 선언, 액티비티 단위에선 객체 위주
