fun main(){
    var entity = Entity()
    // Trying to override validation
    var regra = object : validation { override fun execute() { print("hello \n")}}
    entity.attributes.put("teste", regra)
    entity.attributes.get("teste")?.execute()


    var product = Entity()
    // Entity Product
    // name
    // price

    var shoppingCart = Entity()
    // Shopping Cart
    // List Products
    // Total

    var order = Entity()
    // Aggregate Order
    // All products from Cart
    // Client Info
    // Delivery address info
    // Payment Info
}