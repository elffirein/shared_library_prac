import org.common.ExampleClass
import org.common.SecondClass

def call(body) {
  def pipelineParams= [:]
  def example = new ExampleClass()
  def second = new SecondClass()
  body.resolveStrategy = Closure.DELEGATE_FIRST
  body.delegate = pipelineParams
  body()
  pipeline {
    agent any
    stages {
      stage('build') {
        steps {
		sh 'echo "Test foo"'
		script {
			example.sayHi()
			sec = second.newInstance()
			sec.sayHello()
		}
        }
      }
    }
  }
}
