import Attribute.Attribute

class Entity {
  // Entity`s name, for example: Car, Person, Account, etc.
   lateinit var name: String

  // Entity`s attributes e.g: name, street, city, age, etc.
  var attributes: MutableMap<String, Attribute> = HashMap<String, Attribute>()

  lateinit var rules: List<Function<Action>>

}