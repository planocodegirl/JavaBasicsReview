package App;

public class OrderOfThings {
	static void order() {
		double number;
        String opinion, size, age, shape, color, origin, material, purpose;
        String noun;

        number = 5.0;
        opinion = "AWESOME";
        size = "teensy-weensy";
        age = "new";
        shape = "oblong";
        color = "BRIGHT yellow";
        origin = "AlphaCentaurian";
        material = "platinum";
        purpose = "good";

        noun = "dragons";

        // Using the + with strings, doesn't add it concatenates! (sticks them together)
        System.out.println(number + opinion + size + age + shape + color
                + origin + material + purpose + noun);
	}
}
