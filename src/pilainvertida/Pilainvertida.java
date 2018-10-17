
package pilainvertida;

import java.util.Stack;

public class Pilainvertida {


public void Cadena_Invertida(String Cadena){
Stack<Character> pila = new Stack <Character>();
for (int a=0; a<Cadena.length();a++){
            pila.push(Cadena.charAt(a));
            }

        System.out.println("La pila invertida es: ");
      
        while (!pila.empty()){
           
            System.out.println(pila.pop());
       
        }

        
        
    }
    
}
