package main.ascii;


import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class AsciiK.
 */
public class AsciiK extends AsciiBase
{
    
    /**
	 * Instantiates a new ascii k.
	 */
    public AsciiK() {
        this.realName = 'K';
        this.pattern1 = generatePattern1();
        this.pattern2 = generatePattern2();
    }

    /**
	 * Generate pattern1.
	 *
	 * @return the array list
	 */
    public ArrayList<String> generatePattern1() {
        ArrayList<String> result = new ArrayList<>();
        result.add("# # ");
        result.add("# # ");
        result.add("##  ");
        result.add("# # ");
        result.add("# # ");
        return result;
    }

    /**
	 * Generate pattern2.
	 *
	 * @return the array list
	 */
    public ArrayList<String> generatePattern2() {
        ArrayList<String> result = new ArrayList<>();
        result.add("#    # ");
        result.add("#    # ");
        result.add("#    # ");
        result.add("#  #   ");
        result.add("###    ");
        result.add("###    ");
        result.add("#  #   ");
        result.add("#    # ");
        result.add("#    # ");
        result.add("#    # ");
        return result;
    }
}
