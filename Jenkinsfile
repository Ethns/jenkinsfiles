def ANSIBLE_INVENTORY="~/remotehosts"
def DIR_NAME="Ethan"
node {
    stags {
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