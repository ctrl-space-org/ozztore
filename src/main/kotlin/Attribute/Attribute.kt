package Attribute

class Attribute(var validation: List<Validation>, var value: String = "") {

    fun validate(): List<String> {
       return validation.map {
            val regex = Regex(it.regex);
            val error = when(it.type) {
                Types.matches -> !regex.matches(value)
                Types.containsMatchIn -> !regex.matches(value)
                Types.find -> !regex.matches(value)
                else -> throw Exception("Validation type invalid")
            }
             if (error) it.message
             else ""
            }
           .filter {
               it.isNotBlank() && it.isNotBlank()
           }
    }


}