def call() {
	stages {
		stage("Stage 1") {
			steps {
				echo "In stage 1"
			}
		}
		stage("Stage 2") {
			steps {
				echo "In stage 2"
			}
		}
	}
}
