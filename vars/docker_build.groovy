def call(String ProjectName, String ImageTag, String DockerHubUser){
  sh "docker build -t ${DockerHubUser}/${Projectname}:${ImageTag} ."
  
}
