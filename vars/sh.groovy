def call(mvnname){
  def mvnname = mvn compile
  sh "${mvnname}"
}  
