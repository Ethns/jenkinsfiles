def raw = """com.key1.user=user1
com.key1.pass=call(key1)
com.key2.user=user2
com.key2.pass=call(key2)"""
print(raw)
println('\n')
def key1 = /call(key1)/
def key2 = /call(key2)/
def parsed1 = raw.replace(key1, 'password1')
print(parsed1)