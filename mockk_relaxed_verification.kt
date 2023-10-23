@Test
fun `verify trips`() {
    val plane = mockk<Plane>(relaxed = true)

    plane.trip("Athens", "Paris")
    plane.trip("Athens", "Barcelona")
    plane.trip("Paris", "Berlin")

    // all pass
    verify(atLeast = 3) { plane.accelerate(any(), any()) }
    verify(atMost  = 2) { plane.accelerate(from = "Athens", to = or("Paris", "Barcelona")) }
    verify(exactly = 1) { plane.accelerate("Athens", "Paris") }
    verify(exactly = 0) { plane.accelerate("Paris", "Athens") }

    confirmVerified(plane)
}