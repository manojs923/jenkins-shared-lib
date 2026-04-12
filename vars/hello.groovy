@Library('Shared') _

pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                hello()              // uses default
                hello('Manoj')       // custom name
            }
        }
    }
}