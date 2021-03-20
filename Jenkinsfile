def ANSIBLE_INVENTORY="~/remotehosts"
def DIR_NAME="Ethan"
pipeline {
    agent any
    stages {
        stage ("Ping remote host with Ansible Ad-Hoc command")  {
            steps {
                sh "ansible all -i ${ANSIBLE_INVENTORY} -m ping"
            }
        }
        
        stage ("Create directory in remote host(s)") {
            steps {
                sh "ansible all -i ${ANSIBLE_INVENTORY} -m command -a 'mkdir -p ${DIR_NAME}'"
            }
        }
    }
}