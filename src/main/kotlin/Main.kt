import Attribute.Attribute
import Attribute.Types
import Attribute.Validation

fun main(){
    var entity = Entity()
    // Trying to override validation
    var regra = object : validation { override fun execute() { print("hello \n")}}


    entity.attributes.put("name", Attribute( listOf(Validation(Types.matches,"[a-zA-Z\\s]+","? contains numbers"))))
    entity.attributes.put("age", Attribute( listOf(Validation(Types.matches,"^[0-9]*\$","? accept only number"))))
    entity.attributes.get("name")?.value = "Leozinho"
    entity.attributes.get("age")?.value = "25"
    println(entity.validations())


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
