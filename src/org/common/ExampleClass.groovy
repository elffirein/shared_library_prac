package org.common

import org.common.SecondClass

def sayHi() {
		println("Hi Jenkins")
		sec = new SecondClass()
		def ret = sec.sayHello()
		println(ret)
}
