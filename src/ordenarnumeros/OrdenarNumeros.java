/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenarnumeros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author David pardo Calvo
 */
public class OrdenarNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> numLista = new ArrayList<>();
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            
            String entrada = null;
            
            while((entrada = br.readLine()) != null){
                if(entrada.matches("\\d+")){
                    numLista.add(Integer.parseInt(entrada));
                }else{
                    break;
                }
                
            }
            br.close();
            isr.close();
            Collections.sort(numLista);
            for(int t:numLista){
                 System.out.println(t);
            }            
        }catch (IOException ioe){
            ioe.getMessage();
        }                         
                
    }
    
}
