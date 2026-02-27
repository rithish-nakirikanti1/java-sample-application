pipeline {
    agent any
    tools {
        maven 'mvn-3.8'
        jdk 'jdk-17'
    }

    stages {

        stage('mvn complie') {
            steps {
                sh 'mvn compile'
            }
        }
        stage('mvn test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('mnv package') {
            steps {
                sh 'mvn package'
            }
        }
    }
}
