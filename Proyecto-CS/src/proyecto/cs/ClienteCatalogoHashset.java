
package proyecto.cs;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class ClienteCatalogoHashset {
     private Set listaCatalogoClientess=new HashSet();    
   
   public void agregar(){   
     int x;
     for(x=0;x<3;x++){
      CatalogoClientes p=new CatalogoClientes();
      p.setNombrecliente(JOptionPane.showInputDialog(null,"Digite su nombre:"));
      p.setApellidos(JOptionPane.showInputDialog(null,"Digite sus Apellidos:"));
      p.setDirección(JOptionPane.showInputDialog(null,"Digita tu direccion:"));
      p.setCiudad(JOptionPane.showInputDialog(null,"Digite su ciudad:"));
      p.setCorreo(JOptionPane.showInputDialog(null,"Digite su correo:"));
      
      
      listaCatalogoClientess.add(p);
      JOptionPane.showMessageDialog(null,"¡Elemento agregado!");
     } 
   }
   public void mostrarElementos(){
      Iterator <CatalogoClientes> itP=listaCatalogoClientess.iterator();
      int x=0;
      while(itP.hasNext()){
         JOptionPane.showMessageDialog(null,itP.next().getNombrecliente());
      }
   }
}


