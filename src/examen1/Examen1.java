
package examen1;
import java.util.Scanner;

class examen{
    void ejercicio1(){
        
        Scanner sc = new Scanner(System.in);
        int x= (int) Math.floor(Math.random()*(1-9+1)+9);
        int y=(int) Math.floor(Math.random()*(1-9+1)+9);
        int[][] M1= new int[x][y];
        int[][] M2= new int[x][y];
        int[][] M3= new int[x][y];
        int[][] M_Result=new int[x][y];
        
        //mostrar el tamano de las matrices
        System.out.println("actualmente se esta trbajando con matrices de: ["+x+"]x["+y+"]");
        System.out.println();
        //llenar M1
        for (int i=0;i<x;i++){
            for (int j=0;j<y;j++){
                System.out.println("Introduzca los valores de la primera matriz en la fila "+(i+1)+" colunna"+(j+1));
                M1[i][j] = sc.nextInt();
            }
        }
        //llenar M2
        for (int i=0;i<x;i++){
            for (int j=0;j<y;j++){       
                System.out.println("Introduzca los valores de la segunda matriz en la fila "+(i+1)+" colunna"+(j+1));
                M2[i][j] = sc.nextInt();
                
            }
        }
        //llenar M3
        for (int i=0;i<x;i++){
            for (int j=0;j<y;j++){               
                System.out.println("Introduzca los valores de la tercera matriz en la fila "+(i+1)+" colunna"+(j+1));
                M3[i][j] = sc.nextInt();
            }
        } 
        //operaciones con las matrices
        for (int i=0;i<x;i++){
            for (int j=0;j<y;j++){
                
                M_Result[i][j]=(M1[i][j]+M2[i][j])*M3[i][j];
            }
        }
        //imprimir resultados 
        System.out.println("la matriz resultante es:");
        for (int i=0;i<x;i++){
            for (int j=0;j<y;j++){
                System.out.print(M_Result[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
    //segundo ejecicio
    void ejercicio2(){
        Scanner sc = new Scanner(System.in);
        int X=0;
        int Y=0;
        //se solicitan las dimenciones de la matriz
        System.out.print("Asigne un valor para la dimencion en X de su matriz: ");
        X = sc.nextInt();
        
        System.out.print("Asigne un valor para la dimencion en Y de su matriz: ");
        Y = sc.nextInt();
        
        int[][] Matriz= new int[X][Y];
        
        //se procede a llenar la matriz
        for (int x=0;x<X;x++){
            for (int y=0;y<Y;y++){
                
                Matriz[x][y]= ((240+x)*x*x*x*x)+((200+y)*y*y*y)-3;
            
            }
        }
        //se imprime la matriz
        System.out.println("la matriz resultante es:");
        for (int i=0;i<X;i++){
            for (int j=0;j<Y;j++){
                System.out.print(Matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    //tercer ejercicio
    void ejercicio3(){
        Scanner sc = new Scanner(System.in);
        int X, Y;
        int one=0, zero=0;
        
        //solicitar las dimenciones de la matriz
        System.out.print("Asigne un valor para la dimencion en 'X' de su matriz: ");
        X = sc.nextInt();
        System.out.print("Asigne un valor para la dimencion en 'Y' de su matriz: ");
        Y = sc.nextInt();
        
        int[][]MatrizI= new int[X][Y];
        
        //ciclo para solicitar los datos de la matriz
        for(int i=0;i<X;i++){
            for(int j=0;j<X;j++){
                System.out.print("Introduzca los valores de la matriz en la fila "+(i+1)+" colunna "+(j+1)+" : ");
                MatrizI[i][j] = sc.nextInt();
            }
        }
        //ciclo para comprobar si se trata de una matriz identidad
        for (int i=0;i<X;i++){
            for (int j=0;j<Y;j++){
                if (i==j){
                    if(MatrizI[i][j]!=1){
                        one++;
                    }
                }
                if (i!=j){
                    if(MatrizI[i][j]!=0){
                        zero++;
                    }
                }
            }
        } 
        //se imprime la matriz
        for (int i=0;i<X;i++){
            for (int j=0;j<Y;j++){
                System.out.print(MatrizI[i][j]+" ");
            }
            System.out.println();
        }
        // imprimir resultado
        if (one!=0&&zero!=0){
            System.out.println("la matriz introducida NO es una matriz identidad");
        }
        else{
            System.out.println("la matriz introducida es una matriz identidad");
        }   
    }
    
    //Cuarto ejercicio
    void ejercicio4(){
        Scanner sc = new Scanner(System.in);
        int X, Y;
         //solicitar las dimenciones de la matriz
        System.out.print("Asigne un valor para la dimencion en 'X' de su matriz: ");
        X = sc.nextInt();
        System.out.print("Asigne un valor para la dimencion en 'Y' de su matriz: ");
        Y = sc.nextInt();
        
        int[][]MatrizT= new int[X][Y];
        
        //ciclo para solicitar los datos de la matriz
        for(int i=0;i<X;i++){
            for(int j=0;j<X;j++){
                System.out.print("Introduzca los valores de la matriz en la fila "+(i+1)+" colunna "+(j+1)+" : ");
                MatrizT[i][j] = sc.nextInt();
            }
        }
        
        //comprobar si es una matriz triangular superior
         int Comprobar=0;
        for(int i=1;i<X;i++){
            for(int j=0;j<Y;j++){
                if(j<i){
                    Comprobar+=MatrizT[i][j];      
                    }
             }
        }
        //se imprime la matriz
        for (int i=0;i<X;i++){
            for (int j=0;j<Y;j++){
                System.out.print(MatrizT[i][j]+" ");
            }
            System.out.println();
        }
        // se imprime el resultado
        if(Comprobar==0){
            System.out.println("Es una matriz triagular superior");
        }
        else{
            System.out.println("No es una matriz triagular superior");
        }
        
    }
}


public class Examen1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        examen Ej= new examen();
        int Opc=0;
        
        System.out.println("--BIENVENIDO--");
        while(Opc!=5){
            System.out.println("escoja una de las siguientes opciones");
            System.out.println("Opc-1");
            System.out.println("Opc-2");
            System.out.println("Opc-3");
            System.out.println("Opc-4");
            System.out.println("Opc-5:salir");

            Opc=sc.nextInt();
            if (Opc==1){
                Ej.ejercicio1();
            }
            if (Opc==2){
                Ej.ejercicio2();
            }if (Opc==3){
                Ej.ejercicio3();
            }
            if (Opc==4){
                Ej.ejercicio4();
            }
        }
    }  
}
