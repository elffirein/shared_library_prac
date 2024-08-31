package org.common

import com.cloudbees.groovy.cps.NonCPS
import org.common.SecondClass

@NonCPS
def sayHi() {
		println("Hi Jenkins")
		sec = new SecondClass()
		sec.sayHello()
}
