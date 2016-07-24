
# ltr /Library/Java/JavaVirtualMachines
# list of all versions:
# /usr/libexec/java_home -V

#version 1.6:
#export JAVA_HOME=`/usr/libexec/java_home -v 1.6.0_65-b14-466.1`
#export JAVA_HOME=`/usr/libexec/java_home -v 1.6.0_65-b14-468`

#version 1.7:
#export JAVA_HOME=`/usr/libexec/java_home -v 1.7.0_79`

#version 1.8:
export JAVA_HOME=`/usr/libexec/java_home -v 1.8.0_25`
#export JAVA_HOME="/Library/Java/JavaVirtualMachines/jdk1.8.0_25.jdk/Contents/Home/"

#version 1.9:
#export JAVA_HOME=`/usr/libexec/java_home -v 1.9.0`
echo "exporting JAVA_HOME = $JAVA_HOME"

