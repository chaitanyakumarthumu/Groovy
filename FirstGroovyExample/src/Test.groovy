import static org.junit.Assert.assertThat
import static org.junit.jupiter.api.Assertions.*

class Test {

	TestDemo td
	@org.junit.jupiter.api.Test
	void test() {
		assertThat(td.findIndexOf(0), 1)
	}
	

}
