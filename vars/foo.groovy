import org.common.ExampleClass

def call(body) {
  def pipelineParams= [:]
  body.resolveStrategy = Closure.DELEGATE_FIRST
  body.delegate = pipelineParams
  body()
  pipeline {
    agent any
    stages {
      stage('build') {
        steps {
		sh 'echo "Test foo"'
		def example = new ExampleClass()
		example.sayHi()
        }
      }
    }
  }
}
