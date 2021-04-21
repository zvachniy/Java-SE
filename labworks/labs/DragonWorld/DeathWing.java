package labs.DragonWorld;

public class DeathWing extends SilverWings implements Flyable{

    public DeathWing(String name, int tooth) {
        super(name, tooth);
    }

    @Override
    public void ulta() {
        System.out.println("П*зда вам, людишки иб*ные. К вам летит "+name);
        System.out.println(name+" наследник Среброкрылых драконов, так что и летать он может и кусать ого-го, аж "+ tooth+" наносит. Ультует по-царски");
    }
}
