fun main(){
    var entity = Entity()
    // Trying to override validation
    var regra = object : validation { override fun execute() { print("hello \n")}}
    regra.execute()
    entity.attributes.put("teste", regra)
    print(entity)
}