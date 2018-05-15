#!groovy
def call(options) {
    // Have access to all the Jenkins plugins, etc
    sh 'echo Hello World'

    // Capture the results of a shell script
    def results = sh(script:"echo ${options}", returnStdout:true).trim()
    // trim removes the return character...
    echo "${results}"
    // can now use if statements, etc now that we are in Groovy

    // these vars live only in groovy
    def groovyVar = "Something else"
    echo "${groovyVar}"
}
