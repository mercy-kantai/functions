fun main(){
 printName("Mercy")
var x = modulus(24,7)
 println(x)
var y = add(12,10)
println(y)
var w = add(30,7)
println(w)
 aboutMyself("My name is Mercy I like reading books which dedicate to my clear communication")



}
fun printName(name: String) {
    println("Hello" + "" + name)
}


fun modulus(num1:Int,num2:Int):Int {
    var result=num1%num2
  return result
}
fun add(num1:Int,num2:Int):Int {
 var result = num1+num2
    return result

}
fun aboutMyself(word:String) {
    println(word)


}