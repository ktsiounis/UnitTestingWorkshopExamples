class NestedTestsDemo {

    @Nested
    @DisplayName("Tests for feature flow A")
    inner class FeatureFlowATests {

        fun `test user flow for this feature`() {
            // remainder of test
        }

    }

    @Nested
    @DisplayName("Tests for feature flow B")
    inner class FeatureFlowBTests {

        fun `test user flow for this feature`() {
            // remainder of test
        }
        
    }

}