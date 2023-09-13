//задание1
fun  printFullName(firstName: String, lastName: String)
{
    println("$firstName $lastName")
}


fun main(args: Array<String>)
{
    //задание1
    printFullName("Руслан", "Трущов")

    //задание2
    printFullName(firstName = "Руслан", lastName = "Трущов")

    //задание3
    val fullName = calculateFullName("Руслан","Трущов")

    //задание4
    println(calculateFullName2("Трущов","Руслан").second)

}
//задание3
fun calculateFullName(firstName: String,lastName: String) = firstName + lastName


//задание4
fun calculateFullName2(firstName: String,lastName: String):Pair<String,Int> {
    return Pair("$firstName $lastName", firstName.length + lastName.length)
}