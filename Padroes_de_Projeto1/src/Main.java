import br.com.ph.factory.CarFactory;
import br.com.ph.factory.ChevroletFactory;
import br.com.ph.factory.FordFactory;
import br.com.ph.models.SUV;
import br.com.ph.models.Sedan;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String args[]){
        //Fabrica de carros Ford

        CarFactory fordFactory = new FordFactory();
        SUV SUVFord = fordFactory.criarSUV();
        Sedan SedanFord = fordFactory.criarSedan();

        SUVFord.exibirInfo();
        SedanFord.exibirInfo();

        System.out.println(" ");

        CarFactory chevroletFactory = new ChevroletFactory();
        SUV SUVGm = chevroletFactory.criarSUV();
        Sedan SedanGm = chevroletFactory.criarSedan();
        SUVGm.exibirInfo();
        SedanGm.exibirInfo();

    }
}