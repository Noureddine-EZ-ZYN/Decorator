import composants.Boisson;
import composants.Espresso;
import composants.Sumatra;
import decorateurs.Caremel;
import decorateurs.Chocolat;

public class Test {

    public  static  void main(String[] args){
        Boisson boisson;
        boisson=new Chocolat(new Caremel(new Sumatra()));
        System.out.println(boisson.getDescription());
    }
}
