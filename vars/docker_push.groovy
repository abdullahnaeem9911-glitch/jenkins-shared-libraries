def call(String Project, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword(credentialsId: "dockerhubcred", usernameVariable: "dockerHubUser", passwordVariable: "dockerHubPass")]){
      sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
  }
  sh "docker push ${dockerHubUser}/${Project}:${ImageTag}"
}
