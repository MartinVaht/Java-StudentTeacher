package hello;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;


public class GreeterTest {

	@Mock
	private Counter testcount ;


	@InjectMocks
	private Greeter greeter ;


	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
		}


	@Test
	public void normaalne_Tere() {

		when(testcount.countLugeja("Peeter")).thenReturn(6);

		String tulemus = greeter.ytleTere("Peeter");

		assertEquals("Hello world!", tulemus);
	}

	@Test
	public void yhe_t2hega() {

		when(testcount.countLugeja("a")).thenReturn(1);

		String tulemus = greeter.ytleTere("a");

		assertEquals("Su nimes on midagi mäda", tulemus);
	}

	@Test
	public void kaks_t2hte() {

		when(testcount.countLugeja("aa")).thenReturn(2);

		String tulemus = greeter.ytleTere("aa");

		assertEquals("Hello world!", tulemus);
	}

	@Test
	public void null_t2hte() {

		when(testcount.countLugeja("")).thenReturn(0);

		String tulemus = greeter.ytleTere("");

		assertEquals("Su nimes on midagi mäda", tulemus);
	}


	@Test
	public void viisteist_t2hte() {

		when(testcount.countLugeja("15tähte")).thenReturn(15);

		String tulemus = greeter.ytleTere("15tähte");

		assertEquals("Hello world!", tulemus);


	}

	@Test
	public void kuusteist_t2hte() {

		when(testcount.countLugeja("kuusteist")).thenReturn(16);

		String tulemus = greeter.ytleTere("kuusteist");

		assertEquals("Su nimi on liiga pikk, see ei ole võimalik", tulemus);
	}

	@Test
	public void miinus_t2hte() {

		when(testcount.countLugeja("asdfg")).thenReturn(-100);

		String tulemus = greeter.ytleTere("asdfg");

		assertEquals("Kes sa veel oled", tulemus);
	}

	@Test
	public void exeption() {
		//given
		when(testcount.countLugeja(anyString())).thenThrow(new RuntimeException("everything is on fire"));

		//when
		String result = greeter.ytleTere("aaa");

		//then
		assertEquals("Oops", result);
	}
}



