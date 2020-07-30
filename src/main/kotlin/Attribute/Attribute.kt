package Attribute

data class Attribute(var validation: List<Validation> = ArrayList<Validation>(), var value: String = "") {


    fun validate(): List<String> {
       return validation.filter {
            val regex = Regex(it.regex);
            val error = when(it.type) {
                Types.matches -> !regex.matches(value)
                Types.containsMatchIn -> !regex.matches(value)
                Types.find -> !regex.matches(value)
                else -> throw Exception("Validation type invalid")
            }
           error
        }
       .map {
        it.message
       }
    }


}