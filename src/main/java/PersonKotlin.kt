package com.yvonne//可不加分號

class PersonKotlin{//class前不用加public,沒有寫就是public
    fun greeting(){
        println("Hello kotlin")
    }
}


//top-level 第一級
fun main(){//main方法可不在類別(class)內
    val p = PersonKotlin()
    /*
    val -> 不可改變的值
    var -> 可改變的值
     */
    p.greeting()
}