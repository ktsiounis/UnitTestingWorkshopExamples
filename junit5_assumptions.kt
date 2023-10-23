class AssumptionsDemo {

    @Test
    fun `test only for CI env`() {
        assumeTrue(System.getEnv("ENV") == "CI")
        // remainder of test
    }

    @Test
    fun `test only for local env`() {
        assumeTrue(
            System.getEnv("ENV") == "local",
            "Test ignored due to local environment"
        )
        // remainder of test
    }

    @Test
    fun `test for all envs`() {
        assumingThat(System.getEnv("ENV") == "CI") {
            // perform an assertion only for CI if it's needed
        }
        // remainder of test
    }

}