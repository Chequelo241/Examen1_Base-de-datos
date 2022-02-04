
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
        System.out.println("la matriz resultante es:");
        for (int i=0;i<x;i++){
            for (int j=0;j<y;j++){
                System.out.print(M_Result[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}

public class Examen1 {

    public static void main(String[] args) {
        
        examen Ej= new examen();
        Ej.ejercicio1();

    }
    
}
