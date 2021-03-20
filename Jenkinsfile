def ANSIBLE_INVENTORY="~/remotehosts"
def DIR_NAME="Ethan"
node {
    stage "Ping remote host witn Ansible Ad-Hoc command"  
    sh "ansible all -i ${ANSIBLE_INVENTORY} -m ping"
    stage "Create directory in remote host(s)"
    sh "ansible all -i ${ANSIBLE_INTENTORY} -m command -a '${DIR_NAME}'"
}