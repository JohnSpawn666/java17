import java.awt.*;
import java.time.Instant;
import java.time.InstantSource;
import java.util.HexFormat;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class Main {

    public static void main(String[] args) {

        // System.out.println(formatterPatterSwitch("truc"));

        // testTriangle

        //pseudoRandomNumberGenerators();

         //hexFormat();
        
        instantSource();

    }

    /**
     * New interface InstantSource, factory of instant
     */
    private static void instantSource() {

        Instant endInstant = null;
        InstantSource source = null;       // dependency inject
                
        if(source.instant().isAfter(endInstant)){
            // .....
        }
    }

    /**
     * Can convert primitive type, byte array, char array, int hexadecimal String end reverse
     */
    private static void hexFormat() {
        HexFormat.of().toHexDigits(123);        //7f
        HexFormat.fromHexDigit("7f");       //1213
    }

    /**
 *  New interface of RandomGenerator, and factory RandoGeneratorFactory, to implements random number generator
    */
    private static void pseudoRandomNumberGenerators() {

        // Old generator
        RandomGenerator randomGenerator1 = RandomGeneratorFactory.of("Random").create(42);
        // Default random generator

        RandomGenerator randomGenerator2 = RandomGeneratorFactory.getDefault().create(42);

        // Shortcut for default
        RandomGenerator randomGenerator3 = RandomGenerator.getDefault();

        // Stream all available generators and display their names
        RandomGeneratorFactory.all().forEach(generator -> System.out.println(generator.name()));
    }

    /**
     * Can make some guards in case
     */
    static void testTriangle(Shape shape){
        switch (shape){
            case Triangle triangle && (triangle.calculateArea() > 100) -> {
                System.out.println("Large triangle");
            }
            case Triangle triangle -> System.out.println("Small triangle");
            default -> System.out.println("Not triangle");
        }
    }



    /**
     * Pattern Matching for switch
     */
    static String formatterPatterSwitch(Object object){
        return switch (object){
            case null -> "null";        // Can define a null case
            case Integer i -> String.format("int %d", i);
            case Long l -> String.format ("long %d", l);
            case Double d -> String.format("double %f", d);
            case String s -> String.format("String %s", s);
            default -> object.toString();
        };
    }
}