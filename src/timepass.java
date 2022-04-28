class dog implements gg{

    @Override
    public void bow() {
        System.out.println("Dog goes bow bow");
    }

    @Override
    public void identify() {
        System.out.println("Imma doge");
    }
}


class cat implements gg {

    @Override
    public void bow() {
        System.out.println("Cat doesn't do bow bow stoopid");
    }

    @Override
    public void identify() {
        System.out.println("Imma kate");
    }
}

interface gg {
    void bow();
    void identify();
}




public class timepass {

    public static void main(String[] args) {
        System.out.println("Hi anmol");
        dog d = new dog();
        d.identify();
        d.bow();
        cat c = new cat();
        c.identify();
        c.bow();
    }
}
