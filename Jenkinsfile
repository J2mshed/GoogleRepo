node{
    stage('SCM Checkout'){
    git 'https://github.com/J2mshed/GoogleRepo.git'
    }
    stage('Compile-Package'){
      def mvnHome = tool name: 'default', type: 'maven'
        sh "${mvnHome}/bin/mvn package"
    }
    stage('Email Notification'){
        mail bcc: '', body: 'Hi, Jenkins Alert', cc: '', from: '', replyTo: '', subject: 'Jenkins Job', to: 'sharipovjb@gmail.com'
    }
}
