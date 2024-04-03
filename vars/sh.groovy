def call(String mvnName, String options = '') {
    def mvnHome = tool mvnName
    sh "${mvnHome} compile ${options}"
} 
