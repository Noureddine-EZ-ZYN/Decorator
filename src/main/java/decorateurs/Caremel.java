package decorateurs;

import composants.Boisson;

public class Caremel extends  Decorateur {


    public Caremel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+ " Au caramel";
    }

    @Override
    public double cout() {
        return 8.8+boisson.cout();
    }
}
