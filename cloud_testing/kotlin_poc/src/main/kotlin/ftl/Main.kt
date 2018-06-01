package ftl

import xctest.Bash

object Main {

    @Throws(Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
      println(Bash.execute("hi"))
    }
}
