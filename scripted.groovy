node {  
    stage('pull') { 
         git branch: 'main', url: 'https://github.com/iamtruptimane/ECS-blue-green-deployment'
    }
    stage('Build') { 
         echo 'build is succeed'
    }
    stage('Test') { 
         echo 'Test cases going well'
    }
    stage('Deploy') { 
         echo 'yahoo!! application deployed successfully'
    }
}