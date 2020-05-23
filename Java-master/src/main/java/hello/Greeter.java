package hello;

public class Greeter {

	Counter lugeja = new Counter();

	public String ytleTere(String name) {
		int pikkus;


		try {
			pikkus = lugeja.countLugeja(name);
		} catch (Exception x) {
			return "Oops";
		}

			if ( pikkus <= 1 && pikkus >= 0 ) {
				return "Su nimes on midagi mäda";
			} else if (pikkus > 15 ) {
				return "Su nimi on liiga pikk, see ei ole võimalik";

			} else if ( pikkus >= 2 && pikkus <= 15) {
				return "Hello world!";

			} else
				return "Kes sa veel oled";

		}
	}

