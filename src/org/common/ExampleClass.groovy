package org.common.ExampleClass

class ExampleClass {
	def sayHi() {
		sh 'ping 127.0.0.1'
		println("Hi Jenkins")
	}
}
