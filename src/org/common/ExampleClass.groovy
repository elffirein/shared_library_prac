package org.common

import com.cloudbees.groovy.cps.NonCPS

@NonCPS
def sayHi() {
		sh 'ping 127.0.0.1'
		println("Hi Jenkins")
}
