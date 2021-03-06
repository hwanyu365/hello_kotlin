package com.hwanyu365.hello

import com.hwanyu365.hello.classes.ClassesAndObjects
import com.hwanyu365.hello.stdlib.collections.Collections
import com.hwanyu365.hello.controlflow.ControlFlow
import com.hwanyu365.hello.etc.Etc
import com.hwanyu365.hello.functions.Functions
import com.hwanyu365.hello.officiallib.OfficialLib
import com.hwanyu365.hello.stdlib.StdLibs
import com.hwanyu365.hello.types.Types

//import com.hwanyu365.hello.types.TypeCheckAndCast as tca

fun main() {
//    launch<HelloApp>()

    Types().run()
    ControlFlow().run()
    ClassesAndObjects().run()
    Functions().run()
    Etc().run()
    StdLibs().run()
    OfficialLib().run()
}