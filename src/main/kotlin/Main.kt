import Attribute.Attribute
import Attribute.Types
import Attribute.Validation


fun main(){
//    var entity = Entity()
    // Trying to override validation
    var regra = object : validation { override fun execute() { print("hello \n")}}

    val entity = load()


    entity.attributes.get("name")?.value = "Leozinho2"
    entity.attributes.get("age")?.value = "25a"

    println(entity.validations())

    // Prepare source somehow.
    //val source = "public class Test {  public Test() { System.out.println(\"world\"); } public void teste1(){} }"

   // val helloClass: Class<*> = InMemoryJavaCompiler.compile("Test", source.toString())
   // helloClass.methods.forEach { println(it.name) }

   // println(instance) // Should print "test.Test@hashcode".


    //println(attb.validate())

    //entity.attributes.put("teste", regra)
   // entity.attributes.get("teste")?.execute()

    // Product
    var product = Entity()
    // name
    // price
    // id
    // stock
    // min_age

    // Shopping Cart Item
    var shoppingCartItem = Entity()

    // product(?id)
    // quantity

    // Shopping Cart
    var shoppingCart = Entity()
    // List of Shopping Cart Item
    // Total

    // Client
    var client = Entity()
    // birthday
    // name
    // email

    // Payment
    var payment = Entity()

    // Order *Aggregate
    var order = Entity()
    // Cart(?id)
    // Client(?id)
    // Address(?id)
    // Payment(?id)
}
