package exemploarraybidimensional;
import javax.swing.JOptionPane;
/**
 *
 * @author irodriguezsteuerberg
 */
public class ExemploArrayBidimensional {

    public static void main(String[] args) {

int[][]matriz = new int[3][4];
String[]alumnos={"alum1","alum2","alum3"};
String[]modulos={"M1","M2","M3","M4"};
int opcion;
MetodosMatriz obx = new MetodosMatriz();
do{
opcion = Integer.parseInt(JOptionPane.showInputDialog("***MENU***\n1--> crear matriz"
+"\n2--> amosar \n3--> amosar todo\n4-->Media Alumnos\n5-->Media Modulos \n6--> Sair \n Teclea a opcion"));
switch(opcion){
 case 1:
    matriz = obx.crearMatriz(matriz);
    break;
 case 2:
    obx.amosar(matriz);
    break;
 case 3:
     obx.amosarTodo(matriz, alumnos, modulos);
     break;
 case 4:
     obx.amosarMediaAlum(obx.mediaAlumno(matriz));
     break;
 case 5:
     obx.amosarMediaModulos(obx.mediaModulos(matriz));
     break;
 case 6:
    obx.sair();
 }
}while(opcion<6);
        
}
    
}
