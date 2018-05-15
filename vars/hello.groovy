#!groovy
def call() {
    // Have access to all the Jenkins plugins, etc
    sh 'echo Hello World'

    // these vars live only in groovy
    def groovyVar = "Something else"
    echo "${groovyVar}"
}
