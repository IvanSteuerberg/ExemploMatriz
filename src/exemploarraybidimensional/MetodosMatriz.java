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






}
