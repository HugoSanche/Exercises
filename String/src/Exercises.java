import java.util.Arrays;

public class Exercises {


    public static void main(String[] args) {
        Exercises execute =new Exercises();
       // execute.invertString("Baltazar");
        execute.isPalindroma("hugo");
    }
    public void invertString(String string){
        String[] arrayText=string.split("");
        System.out.println(Arrays.toString(arrayText));
        StringBuilder texto= new StringBuilder();
        for (int i=arrayText.length-1; i>=0; i--){
            texto.append(arrayText[i]);
        }
        System.out.println(texto);

        //other way
        StringBuilder texto2= new StringBuilder(string).reverse();
        System.out.println(texto2);
    }
    public void isPalindroma(String string){

        for (int i=0; i<string.length()/2; i++){
            if (string.charAt(i)!=string.charAt((string.length()-1)-i)){
                System.out.println("No es Palindroma");
                return;
            }
        }
        System.out.println("Es palindroma");
    }

}
