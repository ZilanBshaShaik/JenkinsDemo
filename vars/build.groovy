def call(String mavenGoal){
if ("${mavenGoal}" == "Clean")
    {
      sh "mvn clean"
    }
else if ("${mavenGoal}" == "Compile")
    {
      sh "mvn clean compile"
    }
else if ("${mavenGoal}" == "Test")
    {
      sh "mvn clean test"
    }
else if ("${mavenGoal}" == "Package")
    {
      sh "mvn clean package"
    }
else if ("${mavenGoal}" == "Install")
    {
      sh "mvn clean install"
    }
else if ("${mavenGoal}" == "Deploy")
    {
      sh "clean deploy"
    }
}
