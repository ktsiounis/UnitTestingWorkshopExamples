@ParameterizedTest
@ValueSource(strings = ["potato", "tomato", "apple"])
fun `is current item an apple`(item: String) {
    item shouldBe "apple"
}


complanion object {
    @JvmStatic
    private fun groceries() = listOf("potato", "tomato", "apple") 
}

@ParameterizedTest
@MethodSource("groceries)
fun `is current item from groceries an apple`(item: String) {
    item shouldBe "apple"
}