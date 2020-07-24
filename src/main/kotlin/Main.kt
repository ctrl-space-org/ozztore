fun main(){
    var entity = Entity()
    // Trying to override validation
    var regra = object : validation { override fun execute() { print("hello \n")}}
    entity.attributes.put("teste", regra)
    entity.attributes.get("teste")?.execute()

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