node {  
    stage('pull') { 
        git 'https://github.com/rajatpzade/studentapp.ui.git' 
    }
    stage('build') { 
        echo 'build successfully'
    }
    stage('test') { 
        echo 'test successfully'
    }
    stage('deploy') { 
        echo 'deploy successfully'
    }
}