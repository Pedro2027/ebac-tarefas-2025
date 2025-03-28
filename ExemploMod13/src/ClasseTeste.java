import br.com.ph.interfaces.CanetaEsferografica;
import br.com.ph.interfaces.Giz;
import br.com.ph.interfaces.ICaneta;
import br.com.ph.interfaces.Lapis;

/*
@author Pedro Henrique Araujo
27/03/2025 
*/
public class ClasseTeste {
    public static void main(String [] args){
        ICaneta caneta = new CanetaEsferografica();
        caneta.escrever(" ------Olá Pedro ------ ");
        caneta.escreverComumATodas();
        System.out.println(caneta.getCor());

        System.out.println("");

        ICaneta giz = new Giz();
        giz.escrever(" ------Oi Pedro------ ");
        giz.escreverComumATodas();
        System.out.println(giz.getCor());

        System.out.println("");

        ICaneta lapis = new Lapis();
        lapis.escrever(" ------Hello Pedro------ ");
        lapis.escreverComumATodas();
        System.out.println(lapis.getCor());

    }
}
