pipeline {
    agent any

    stages {

        stage('github-clone') {
            steps {
                git branch: 'master', credentialsId: 'cicdtest', url: 'https://github.com/lkis71/springboot_webservice_aws.git/'
            }
        }

   		// stage...
   	}
}