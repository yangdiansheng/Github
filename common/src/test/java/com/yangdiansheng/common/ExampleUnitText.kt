package com.yangdiansheng.common

import org.junit.Test

class ExampleUnitText{

    @Test
    fun textBoolean(){
       val result =  getABoolean().no { 1 }.otherwise { 2 }
        print(result)
    }
}

fun getABoolean() = false