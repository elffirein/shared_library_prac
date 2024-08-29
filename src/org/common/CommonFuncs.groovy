package org.common

class CommonFuncs {
    def sayHi() {
	sh 'ls -l'
        echo "Hi from CommonFuncs!"
    }

    def sayHello(str) {
        echo "Hello ${str}"
    }
}
