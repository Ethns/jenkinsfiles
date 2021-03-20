def ANSIBLE_INVENTORY="~/remotehosts"
def DIR_NAME="Ethan"
node {
    stage "Ping remote host with Ansible Ad-Hoc command"  
    sh "ansible all -i ${ANSIBLE_INVENTORY} -m ping"
    stage "Create directory in remote host(s)"
    sh "ansible all -i ${ANSIBLE_INVENTORY} -m command -a 'mkdir ${DIR_NAME}'"
}