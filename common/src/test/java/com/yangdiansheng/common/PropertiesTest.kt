package com.yangdiansheng.common

import org.junit.Test

class InfoProps: AbsPropertoes("info.properties"){
    var name:String by prop
    var email:String by prop
    var age:Int by prop
    var studdent:Boolean by prop
    var point:Float by prop
}

class TestProperties{

    @Test
    fun testProperties(){
        InfoProps().let {
            println(it.name)
            println(it.email)
            println(it.age)
            println(it.studdent)
            println(it.point)
            it.name = "kolin"
            it.email = "admin@qq.com"
            it.age = 18
            it.point = 3.0f
        }
    }
}