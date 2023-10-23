class Calculator {
    fun increaseByOne(num: Int) = num + 1
}
   
@Test
fun `Calculator returns the correct number increased by one`() {
    val calculator = mockk<Calculator>()

    every { calculator.increaseByOne(any()) } returns -1
    every { calculator.increaseByOne(2) } answers { callOriginal() }

    calculator.increaseByOne(5) shouldBe -1
    calculator.increaseByOne(2)) shouldBe 3
}