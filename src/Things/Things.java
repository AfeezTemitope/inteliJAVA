package Things;

public class Things {
    private boolean alive;


    public Things() {
        this.alive = false;
    }

    public boolean alive() {
        return this.alive;
    }
    public void isAlive() {
        this.alive = true;
    }

    public void notAlive() {
        this.alive = false;
    }



    class LivingThing extends Things {
    }

    class Plant extends LivingThing {
    }

    class Animal extends LivingThing {
    }


    class Vertebrate extends Animal {
    }

    class Invertebrate extends Animal {
    }

    class Mammal extends Vertebrate {
    }

    class Aves extends Vertebrate {
    }

    class Reptile extends Vertebrate {
    }

    class Amphibian extends Vertebrate {
    }

    class Pisces extends Vertebrate {
    }
}
