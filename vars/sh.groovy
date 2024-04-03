def call(String mvnName, String options){
    sh "${mvnName} compile ${options}"
} 
