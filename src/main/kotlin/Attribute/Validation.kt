package Attribute

data class Validation(var type: Types = Types.matches, var regex:String = "", var message: String="")
