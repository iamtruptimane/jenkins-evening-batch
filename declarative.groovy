pipeline {
    agent any

    stages {
        stage('pull') {
            steps {
               git branch: 'main', url: 'https://github.com/iamtruptimane/ECS-blue-green-deployment' 
            }
        }
        stage('build') {
            steps {
                echo 'building..'
            }
        }
        stage('test') {
            steps {
                echo 'testing....'
            }
        }
        stage('deploy') {
            steps {
                echo 'deploying..'
            }
        }
    }
}