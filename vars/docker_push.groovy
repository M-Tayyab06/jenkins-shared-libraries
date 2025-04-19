def call(String project, String imageTag, String dockerUser) {
  withCredentials([usernamePassword(credentialsId: 'dockerhubCred', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {
    sh 'echo "$DOCKER_PASSWORD" | docker login -u "$DOCKER_USERNAME" --password-stdin'
    sh "docker push $DOCKER_USERNAME/${project}:${imageTag}"
  }
}
