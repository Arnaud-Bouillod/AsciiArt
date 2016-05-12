package core.ascii;


import java.util.ArrayList;

public class AsciiF extends AsciiBase
{
    public AsciiF() {
        this.realName = 'F';
        this.pattern1 = generatePattern1();
    }

    public ArrayList<String> generatePattern1() {
        ArrayList<String> result = new ArrayList<>();
        result.add("### ");
        result.add("#   ");
        result.add("##  ");
        result.add("#   ");
        result.add("#   ");
        return result;
    }

    public ArrayList<String> generatePattern2() {
        ArrayList<String> result = new ArrayList<>();
        result.add("###### ");
        result.add("#      ");
        result.add("#      ");
        result.add("#      ");
        result.add("####   ");
        result.add("#      ");
        result.add("#      ");
        result.add("#      ");
        result.add("#      ");
        result.add("#      ");
        return result;
    }
}