#!groovy
pipeline {
    agent any
    stages {
        stage ("Stage 1")  {
            steps {
                sh "pwd"
            }
        }
        
        stage ("Stage 2") {
            steps {
                sh "ls"
            }
        }
        stage ("Stage 3") {
            steps {
                script {
                    def child01 = load ("${env.WORKSPACE}/jenkinsGroovyScripts/child01.groovy")
                    child01.getFromChild()
                }
            }
        }        
    }
}