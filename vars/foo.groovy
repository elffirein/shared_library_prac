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
		script {
			def example = new org.common.ExampleClass()
			example.sayHi()
		}
        }
      }
    }
  }
}
