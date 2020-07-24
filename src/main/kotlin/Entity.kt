class Entity {
  // Entity`s name, for example: Car, Person, Account, etc.
   lateinit var name: String

  // Entity`s attributes e.g: name, street, city, age, etc.
  var attributes: MutableMap<String, validation> = HashMap<String, validation>()

  lateinit var rules: List<Function<Action>>

}