/*
Elver Iram Jiménez Rodríguez A01196327
Luis Mario de Leija Piñón         A01410385
Luis  Montiel Rocha                 A01410588
Pablo Serrano Hernandez        A01410753
Rubén Daniel Baez Muñíz        A01411504
*/
package spp.pkg404teamnotfound.p2.problema1;
import java.util.Scanner;
/**
 *
 * @author elver
 */
public class SPP404TeamNotFoundP2Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  mostrarMenu();
    }
    static void mostrarMenu(){
        int n;
        System.out.println("Programa para calcular matrices");
        System.out.println("Cual operacion quiere utilizar en sus matrices");
        System.out.println("1.- Suma de matrices");
        System.out.println("2.- Resta de matrices");
        System.out.println("3.- Multiplicacion de matrices");
        Scanner kb = new Scanner (System.in);
        n= kb.nextInt();
        switch(n){
           case 1:
                sumaArreglos();
                break;
           case 2:
                restaArreglos();
                break;
            case 3:
                 MVectores();
                 break;
        }
}
    static void sumaArreglos(){
        int arreglo1[][];
        int R ;
        int datoCasilla1;
        int arreglo2[][];
        int datoCasilla2;
        int s;
       
        Scanner kb = new Scanner (System.in);
        System.out.println("Ingrese el tamaño de la matriz");
        R= kb.nextInt();
        
        arreglo1 = new int [R][R];
        for(int i = 0; i<arreglo1.length ; i++){
        for(int j = 0; j<arreglo1.length ; j++){  
            System.out.println("Ingrese el dato que se guardara en la casilla Matriz 1");
            Scanner entradaCasilla1 = new Scanner (System.in);
            datoCasilla1= entradaCasilla1.nextInt();
            arreglo1[i][j]=datoCasilla1;
            
            
        }
        
        
        }
        arreglo2 = new int [R][R];
        for(int i=0; i<arreglo2.length; i++){
        for(int j=0; j<arreglo2.length; j++){
            System.out.println("Ingrese el dato que se guardara en la casilla Matriz 2");
            Scanner entradaCasilla2 = new Scanner(System.in);
            datoCasilla2= entradaCasilla2.nextInt();
            arreglo2[i][j]= datoCasilla2;   
        }
}
        for(int i=0; i<arreglo1.length; i++){
        for(int j=0;j<arreglo1.length;j++){
            s= arreglo1[i][j] + arreglo2[i][j];
            System.out.println("La suma de las matrices es "+s);
        }    
        }
    }
        static void restaArreglos(){
        int arreglo1[][];
        int R;
        int datoCasilla1;
        int arreglo2[][];
        int datoCasilla2;
        int s;
        Scanner kb = new Scanner (System.in);
        System.out.println("Ingrese el tamaño de la matriz");
        R= kb.nextInt();

        arreglo1 = new int [R][R];
        for(int i = 0; i<arreglo1.length ; i++){
        for(int j = 0; j<arreglo1.length ; j++){  
            System.out.println("Ingrese el dato que se guardara en esta casilla");
            Scanner entradaCasilla1 = new Scanner (System.in);
            datoCasilla1= entradaCasilla1.nextInt();
            arreglo1[i][j]=datoCasilla1;
        }
        }
        arreglo2 = new int [R][R];
        for(int i=0; i<arreglo2.length; i++){
        for(int j=0; j<arreglo2.length; j++){
            System.out.println("Ingrese el dato que se guardara en la casilla");
            Scanner entradaCasilla2 = new Scanner(System.in);
            datoCasilla2= entradaCasilla2.nextInt();
            arreglo2[i][j]= datoCasilla2;
        }
}
        for(int i=0; i<arreglo1.length; i++){
        for(int j=0;j<arreglo1.length;j++){
            s= arreglo1[i][j] - arreglo2[i][j];
            System.out.println("La resta de las matrices es "+s);
        }    
        }
}
public static void MVectores() {  
        int r;
        
       r=TamMat();
       
       int [][]Matriz1 = GeneracionMatriz(r);
       int[][]Matriz2 = GeneracionMatriz(r);
       

       MatricesMultiplicacion ( Matriz1, Matriz2);
       
}
    
    public static int  TamMat(){
        int r;
        System.out.println("Introduce tamaño de matrices");
 r = SolicitaEntero();
 return r;
            
    }
    
    public static int [][] GeneracionMatriz(int r) {
        Scanner kb = new Scanner (System.in);
    int t;
        int [][] Matriz = new int [r][r];
        t = (r*r);
        System.out.println("Introduce datos de matriz, capacidad de "+ t + " variables.");
        
        for (int i = 0; i < Matriz.length; i++ ) 
        {
        
            
            for (int j = 0; j < Matriz.length; j++) 
            {

                System.out.println("Introduce varaible " + i +","+ j );

                Matriz[i][j]=SolicitaEntero();

            }
       
        }
        
        return Matriz;
    
    
    }
    
   
    

    
    public static void error() {
    

        System.out.println("Se ha producido un error en la ejecucion del programa.");
        Salida();
        
    
    }
    
    public static void Salida() {
        Scanner kb = new Scanner (System.in);
        int x;
    
        System.out.println("Inserta un numero para reiniciar.");
        System.out.println("Inserta cualquier otra tecla para salir.");
    
    try {
        x =kb.nextInt();
        MVectores();
    
    }
    catch (Exception ex) {
        System.exit(0);
            
        }
    
    
    
    
    
    }
    
    public static int SolicitaEntero() {
    
    
       
   Scanner kb = new Scanner(System.in);
   int e=0;
        
        
        try {
            
            e =kb.nextInt();
              
        }
        catch (Exception ex) {
            
           error();
            
        }
        
        return e;
    
    }
    

     
     public static void MatricesMultiplicacion(int [][]a,int [][] b) {
         
         
         
         System.out.println("Calculo de Matriz 1 * Matriz 2.");
         
         
         for ( int i = 0; i < a.length; i++) {
         
          for (int j = 0; j < a[1].length; j++  ) {
         
            for (int K =0; K< a.length; K++ ) {
          
                int Matriz3 = a[i][K] * b [K][j];
                
                System.out.println(Matriz3);
           
           
          }
            
         
         }
         
         
         }
         
         
             
         
         System.out.println("Calculo de Matriz 2 * Matriz 1.");
         
         
         for ( int i = 0; i < a.length; i++) {
         
          for (int j = 0; j < a[1].length; j++  ) {
         
            for (int K =0; K< a.length; K++ ) {
          
                int Matriz3 = a[j][K] * b [K][i];
                
                System.out.println(Matriz3);
           
           
          }
            
         
         }
         
         
         }
           
         
     }    
}