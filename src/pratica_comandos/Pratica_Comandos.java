/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica_comandos;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Pratica_Comandos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     somaNumeros();
     multiplos();
     menorNumeroList();
     fatorial();
     codigoBarra();
     comandoSplit();
     comandoSubtring();
     lowerCaseToUpperCase();
     compareToTrimIsEmpty();
     indexOf();
    }
    
    private static void somaNumeros(){
        Integer numero = 0;
        for (int i = 1; i <= 4; i++) {
           numero += i;
            
        }
        System.out.println(numero);
    }
    
    private static void multiplos(){
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
    
    private static void menorNumeroList(){
        int[] valoresArray = { 88, 7, 0, -1, 45, 3, 92, -9, 300000001, 12, 23567};
        int menor = 0;
        
        for (int i = 0; i < valoresArray.length; i++) {
            if (i == 0) {
                menor = valoresArray[i];
            }else{
                if (menor > valoresArray[i]) {
                    menor = valoresArray[i];
                }
            }
        }
        System.out.println(menor);
    }
    
    private static void fatorial(){
        int fatorial = 1;
        for (int i = 1; i <= 10; i++) {
            fatorial *= i;
            System.out.println(fatorial);
        }
    }
    
    private static void codigoBarra(){
        int[] codigo = {1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,89};
        int barra = 0;
        int verificador = 0;
        
        
        for (int i = 0; i < codigo.length; i++) {
            
            if (i <= 19) {
                barra += codigo[i];
            }else{
                if (i >= 20){
                   verificador += codigo[i];
                }
            }
        }
        if (barra != verificador) {
            System.out.printf("Código %d e verificador %d são diferentes\n", barra, verificador);
        }else{
            System.out.printf("Código %d e verificador %d são iguais\n", barra, verificador);
        }
    }
    
    private static void comandoSplit(){
        System.out.println("Digite seu texto");
        
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        String[] textoSplit = texto.split(" ");
        
        for (int i = 0; i < textoSplit.length; i++) {
            System.out.println(textoSplit[i]);
            
        }
        
        // Faz a mesma coisa que o for de cima.
        //for(String txt : textoSplit){
          //  System.out.println(txt);
        //}
    }
    
    private static void comandoSubtring(){
        System.out.println("Informe um texto");
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        
        if (texto.length() <= 13) {
            System.out.println(texto);
        }else{
            System.out.println(texto.substring(0,13));
        }
    }
    
    private static void lowerCaseToUpperCase(){
        System.out.println("Digite seu texto");
        
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        boolean espaco = false;
        
        for (int i = 0; i < texto.length(); i++) {
              String caracter = String.valueOf(texto.charAt(i));
              
            
            if (!espaco) {
                espaco = caracter.equals(" ");
                System.out.print(caracter.toUpperCase());
            }else{
                System.out.print(caracter.toLowerCase());
            }
        }
    }
    private static void compareToTrimIsEmpty(){
        System.out.println("Digite seu email");
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        System.out.println(email);
        
        if (email.compareTo("teste@gmail.com")==0) {
            System.out.println("E-mail correto");
        }
        
        if(email.equals("teste@gmail.com")){
            System.out.println("E-mail correto");
            
        }
        
        if (email.isEmpty()) {
            System.out.println("Email em branco");
        }
        
    }
    
    private static void indexOf(){
        System.out.println("Digite seu texto");
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        
        if (texto.indexOf(",") > 0) {
            System.out.println(texto.substring(0, texto.indexOf(",")));
        }else{
            System.out.println(texto);
        }
        
    }
    
}
