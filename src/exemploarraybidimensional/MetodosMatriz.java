package exemploarraybidimensional;

/**
 *
 * @author irodriguezsteuerberg
 */
public class MetodosMatriz {

public int[][] crearMatriz(int[][] taboa){
    for (int f=0;f<taboa.length;f++){
      for(int c=0;c<taboa[f].length;c++){
      taboa[f][c]=PedirDatos.pedirInt();
      }    
    }    
return taboa;
}

public void amosar(int[][]taboa){
for (int f=0;f<taboa.length;f++){
    System.out.println("\n");
      for(int c=0;c<taboa[f].length;c++){
          System.out.print(taboa[f][c]+"  ");
      }    
    }
}

public void sair(){
System.exit(0);
}

public String[] arrayFila(int [][]taboa){
    String []filas = new String [taboa.length];
    for(int i=0;i<filas.length;i++){
    filas[i]=PedirDatos.pedirString("nome filas ");
    }
return filas;
}

public String[] arrayColumna(int [][]taboa){
    String []columnas = new String [taboa[0].length];
    for(int i=0;i<columnas.length;i++){
    columnas[i]=PedirDatos.pedirString("nome columnas ");
    }
return columnas;
}

public void amosarTodo(int[][]taboa,String[]alumnos,String[]modulos){
    System.out.print("    ");
    for(int i=0;i<modulos.length;i++){
    System.out.print("   "+modulos[i]);    
}
  for (int f=0;f<taboa.length;f++){
    System.out.print("\n "+alumnos[f]);
      for(int c=0;c<taboa[f].length;c++){
          System.out.print("  "+taboa[f][c]+"  ");
      }    
    }
    
}

public int[] mediaAlumno(int[][]taboa){
int[]mediaAlum= new int[taboa.length];       
 for (int f=0;f<taboa.length;f++){
      for(int c=0;c<taboa[f].length;c++){
         mediaAlum[f]=mediaAlum[f]+taboa[f][c];  
         
      }
      mediaAlum[f]=mediaAlum[f]/4;
    }   
return mediaAlum;
}
public void amosarMediaAlum(int[]taboa){
    System.out.println("\nMedia alumnos: ");
    for (int i=0;i<taboa.length;i++){
    System.out.print(taboa[i]+"  ");
     
      }    
    }

public int[] mediaModulos(int[][]taboa){
int[]mediaModulos= new int[4];
int acu=0;
 for (int c=0;c<mediaModulos.length;c++){ 
 acu=0;
 for(int f=0;f<taboa.length;f++){
 acu=acu+taboa[f][c];
 }
 mediaModulos[c]=acu/3;
 }
return mediaModulos;
}

public void amosarMediaModulos(int[]taboa){
    System.out.println("\nMedia modulos: ");
    for (int i=0;i<taboa.length;i++){
    System.out.print(taboa[i]+"  ");
     
      }    
    }


}
