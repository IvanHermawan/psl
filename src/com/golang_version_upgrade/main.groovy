package com.golang_version_upgrade

def main(script) {
    //def GO_VERSION = ("${script.env.GO_VERSION}" != "null") ? "${script.env.GO_VERSION}" : ""
  
    stage('GO'){
        def root = tool type: "go", name: "${GO_VERSION}"
        withEnv(["GOROOT=${root}", "PATH+GO=${root}/bin"]) {
            sh 'go version'
        }
    }  
}