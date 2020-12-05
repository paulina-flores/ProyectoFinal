
import java.util.*;
class Persona implements Serializable{

   protected String usuario, contrase鎙, tipo;
   protected Nombre nombre;
   protected Direccion direccion;
   protected Fecha fecha;
   protected String nacionalidad;
   
   public Persona(String tipo, String usuario, String contrase鎙, Nombre nombre, Direccion direccion, Fecha fecha, String nacionalidad){
      setTipo(tipo);
      setUsuario(usuario);
      setContrase鎙(contrase鎙);
      setNombre(nombre);
      setDireccion(direccion);
      setFecha(fecha);
      setNacionalidad(nacionalidad);
   }
   
   public void setTipo(String tipo){
      this.tipo = tipo;
   }
   
   public void setUsuario(String usuario){
      this.usuario = usuario;
   }
   
   public void setContrase鎙(String contrase鎙){
      this.contrase鎙 = contrase鎙;
   }
   
   public void setNombre(Nombre nombre){
      this.nombre = nombre;
   }
   
   public void setDireccion(Direccion direccion){
      this.direccion = direccion;
   }
   
   public void setFecha(Fecha fecha){
      this.fecha = fecha;
   }
   
   public void setNacionalidad(String nacionalidad){
      this.nacionalidad = nacionalidad;
   }
   
   public String getTipo(){
      return tipo;
   }
   
   public String getUsuario(){
      return usuario;
   }
   
   public String getContrase鎙(){
      return contrase鎙;
   }
   
   public Nombre getNombre(){
      return nombre;
   }
   
   public Fecha getFecha(){
      return fecha;
   }
   
   public Direccion getDireccion(){
      return direccion;
   }
   
   public String getNacionalidad(){
      return nacionalidad;
   }
   
   //public String toString(){
      
   //}
 
}

class Nombre implements Serializable{

   private String nombre, ap, am;
   
   public Nombre(String nombre, String ap, String am){
      setNombre(nombre);
      setAp(ap);
      setAm(am);
   }
   
   public void setNombre(String nombre){
      this.nombre = nombre;
   }
   
   public void setAp(String ap){
      this.ap = ap;
   }
   
   public void setAm(String am){
      this.am = am;
   }
   
   public String getNombre(){
      return nombre;
   }
   
   public String getAp(){
      return ap;
   }
   
   public String getAm(){
      return am;
   }
   
   public String toString(){
      return (nombre + " " + ap + " " + am);
   }
 
}
class Fecha implements Serializable{

   private String dd, mm, aa;
   
   public Fecha(String dd, String mm, String aa){
      setDd(dd);
      setMm(mm);
      setAa(aa);
   }
   
   public void setDd(String dd){
      this.dd = dd;
   }
   
   public void setMm(String mm){
      this.mm = mm;
   }
   
   public void setAa(String aa){
      this.aa = aa;
   }
   
   public String getDd(){
      return dd;
   }
   
   public String getMm(){
      return mm;
   }
   
   public String getAa(){
      return aa;
   }
   
   public String toString(){
      return (dd + "-" + mm + "-" + aa);
   }

}



class Direccion implements Serializable{

   private String calle, numeroInt, ciudad, estado;
   
   public Direccion(String calle, String numeroInt, String ciudad, String estado){
      
      setCalle(calle);
      setNumeroInt(numeroInt);
      setCiudad(ciudad);
      setEstado(estado);
      
   }
   
   public void setCalle(String calle){
      this.calle = calle;
   }
   
   public void setNumeroInt(String numeroInt){
      this.numeroInt = numeroInt;
   }
   
   public void setCiudad(String ciudad){
      this.ciudad = ciudad;
   }
   
   public void setEstado(String estado){
      this.estado = estado;
   }
   public String getCalle(){
      return calle;
   }
   
   public String getNumeroInt(){
      return numeroInt;
   }
   
   public String getCiudad(){
      return ciudad;
   }
   public String getEstado(){
      return estado;
   }
   
   public String toString(){
      return ("Domicilio: " + calle + "\nNumero int: " + numeroInt + "\nCiudad: " + ciudad + "\nEstado: " + estado);
   }

}

class Entrenador extends Persona implements Serializable{

   private String idEntrenador;
   
   public Entrenador(String tipo, String usuario, String contrase鎙, Nombre nombre, Direccion direccion, Fecha fecha, String nacionalidad, String idEntrenador){
      super(tipo, usuario, contrase鎙, nombre, direccion, fecha, nacionalidad);
      setidEntrenador(idEntrenador);
   }
   
   public void setidEntrenador(String idEntrenador){
      this.idEntrenador = idEntrenador;
   }
   
   public String getidEntrenador(){
      return idEntrenador;
   }
   
   public String toString(){
      return ("Nombre: " + nombre + "\nFecha de Nacimiento: " + fecha + "\nNacionalidad: " + nacionalidad + "\nID: " + idEntrenador);
   }

}

class Atleta extends Persona implements Serializable{

   private HashMap<String, ArrayList<String>> pruebaMarca = new HashMap<String, ArrayList<String>>();
   private String categoria, Entrenador;
   
   public Atleta(String tipo, String usuario, String contrase鎙, Nombre nombre, Direccion direccion, Fecha fecha, String nacionalidad, HashMap<String, ArrayList<String>> pruebaMarca, String categoria, String Entrenador){
      super(tipo, usuario, contrase鎙, nombre, direccion, fecha, nacionalidad);
      setPruebaMarca(pruebaMarca);
      setCategoria(categoria);
      setEntrenador(Entrenador);
   }
   /*
      HashMap<String, ArrayList<Double>> prueba-marca = new HashMap<String, ArrayList<Double>>();
      ArrayList<String> pruebas {100 metros, Salto de longitud, 4x100metros}  
      ArrayList<ArrayList<double>> marcas =  {{10.89, 10.90, 10.92}, {7.10, 7.15, 7.20}}
      ArrayList<double> marcas100metros = {10.89, 10.90, 10.92}
      ArrayList<double> marcasSaltoLongitud = {7.10, 7.15, 7.20}
      marcas100metros.add(10.60);
   
   */
   public void setEntrenador(String Entrenador){
      this.Entrenador = Entrenador;
   }
   
   public String getEntrenador(){
      return Entrenador;
   }
   
   
   public void setPruebaMarca(HashMap<String, ArrayList<String>> pruebaMarca){
      this.pruebaMarca = pruebaMarca;
   }
   
   public void setCategoria(String categoria){
      this.categoria = categoria;
   }
   
   public HashMap<String, ArrayList<String>> getPruebaMarca(){
      return pruebaMarca;
   }
   
   public String getCategoria(){
      return categoria;
   }
   
   
   public String toString(){
      return ("Nombre: " + nombre + "\nFecha de Nacimiento: " + fecha + "\nNacionalidad: " + nacionalidad + "\nPruebas: " + pruebaMarca);
   }
 
}


class Principal implements Serializable{
   public static void main(String args[]){
      
      int opcionCuenta = elegirCuenta();
      if(opcionCuenta==1)
         crearCuenta();
      else{}
      leerArchivo();
      
   }
   
   public static int elegirCuenta(){
      Scanner s = new Scanner(System.in);
      System.out.println("      、ienvenido!\n\nIngresa la opcion deseada:\n\n(1)Crear Cuenta\n(2)Ingresar\n");
      boolean salir = true;
      int opcion = 0;
      do{
         try{
            opcion = s.nextInt();
            if(opcion==1 || opcion==2)
               salir = false;
            else
               System.out.println("Ingresa una opcion adecuada");
         }catch (InputMismatchException e) {
            s.next();
            System.out.println("Ingresa una opcion adecuada");
         }
      }while(salir);
      System.out.println();
      return opcion;
   }
   
   
   public static void crearCuenta(){
      Scanner s = new Scanner(System.in);
      Scanner x = new Scanner(System.in);
      System.out.println("Selecciona el tipo de cuenta que deseas:\n\n(1)Entrenador\n(2)Atleta\n");
      boolean salir = true;
      int opcion = 0;
      do{
         try{
            opcion = s.nextInt();
            if(opcion==1 || opcion==2)
               salir = false;
            else
               System.out.println("Ingresa una opcion adecuada");
         }catch (InputMismatchException e) {
            s.next();
            System.out.println("Ingresa una opcion adecuada");
         }
      System.out.println();
      }while(salir);
      String usuario = "", contrase鎙 = "", nombre = "", ap = "", am = "", calle = "", numeroInt = "", ciudad = "", estado = "", aa = "", dd = "", mm = "", nacionalidad = "", pruebas = "", marcas = "", categoria = "";
      FileOutputStream f1 = null;
      ObjectOutputStream f2 = null;
      switch(opcion){
         case 1:           //Registro de un entrenador
            try{
               
               
               System.out.print("Usuario: ");
               usuario = s.next();
               System.out.print("Contrasena: ");
               contrase鎙 = s.next();
               System.out.print("Nombre: ");
               nombre = x.nextLine();
               System.out.print("Apellido Paterno: ");
               ap = s.next();
               System.out.print("Apellido Materno: ");
               am = s.next();
               System.out.print("Calle: ");
               calle = x.nextLine();
               System.out.print("numeroInt: ");
               numeroInt = s.next();
               System.out.print("Ciudad: ");
               ciudad = x.nextLine();
               System.out.print("Estado: ");
               estado = x.nextLine();
               System.out.print("Fecha de Nacimiento (dd): ");
               dd = s.next();
               System.out.print("Fecha de Nacimiento (mm): ");
               mm = s.next();
               System.out.print("Fecha de Nacimiento (aa): ");
               aa = s.next();
               System.out.print("Nacionalidad: ");
               nacionalidad = s.next();
               
               
               //usuario = "emi7595"; cambiar a scanner!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
               Nombre nombre1 = new Nombre(nombre, ap, am);
               Direccion direccion1 = new Direccion(calle, numeroInt, ciudad, estado);
               Fecha fecha1 = new Fecha(dd, mm, aa);
               Entrenador entrenador1 = new Entrenador("entrenador", usuario, contrase鎙, nombre1, direccion1, fecha1, nacionalidad, "589783");
               f1 = new FileOutputStream("C:\\Users\\emili\\OneDrive\\Documents\\PROGRAMACION INTERMEDIA\\PROYECTO\\" + usuario + ".dat");
               f2 = new ObjectOutputStream(f1);
               f2.writeObject(entrenador1);
               f2.close();
               f1.close();
            }catch(IOException e){
               System.out.println("Existe un error al grabar la informacion en el archivo");
            }

            break;
         case 2:        //Registro de un atleta
            try{
            
            
               System.out.print("Usuario: ");
               usuario = s.next();
               System.out.print("Contrasena: ");
               contrase鎙 = s.next();
               System.out.print("Nombre: ");
               nombre = x.nextLine();
               System.out.print("Apellido Paterno: ");
               ap = s.next();
               System.out.print("Apellido Materno: ");
               am = s.next();
               System.out.print("Calle: ");
               calle = x.nextLine();
               System.out.print("numeroInt: ");
               numeroInt = s.next();
               System.out.print("Ciudad: ");
               ciudad = x.nextLine();
               System.out.print("Estado: ");
               estado = x.nextLine();
               System.out.print("Fecha de Nacimiento (dd): ");
               dd = s.next();
               System.out.print("Fecha de Nacimiento (mm): ");
               mm = s.next();
               System.out.print("Fecha de Nacimiento (aa): ");
               aa = s.next();
               System.out.print("Nacionalidad: ");
               nacionalidad = s.next();
            
            
            
            
               Nombre nombre1 = new Nombre(nombre, ap, am);
               Direccion direccion1 = new Direccion(calle, numeroInt, ciudad, estado);
               Fecha fecha1 = new Fecha(dd, mm, aa);
               
               
               boolean salir1 = true;               
               String prueba = "";
               String opcion1 = "";
               HashMap<String, ArrayList<String>> tabla = new HashMap<String, ArrayList<String>>();
               while(salir1){
                  
                  System.out.print("Ingresa una prueba: ");
                  prueba = x.nextLine();
                  ArrayList<String> marca  = new ArrayList<String>();
                  boolean salir2 = true;
                  while(salir2){
                     System.out.print("Ingresa una marca: ");
                     String y = s.next();
                     marca.add(y);
                     System.out.println("熹uieres ingresar otra marca?\n(1) Si\n(2)No");
                     opcion1 = x.nextLine();
                     if(!opcion1.equals("1"))
                        salir2 = false;
                  }
                  
                  tabla.put(prueba, marca);       
                  
                  System.out.println("熹uieres ingresar otra prueba?\n(1) Si\n(2)No");
                  opcion1 = x.nextLine();
                  if(!opcion1.equals("1"))
                     salir1 = false;
                     
               }
               
               
               //Empiezo a crear la informaci鏮 del hashmap
               /*
               String primeraPrueba = "100 metros";
               ArrayList<String> cienmetros  = new ArrayList<String>();
               cienmetros.add("10.9");
               cienmetros.add("10.8");
               String segundaPrueba = "200 metros";
               ArrayList<String> doscientosmetros  = new ArrayList<String>();
               doscientosmetros.add("20.5");
               doscientosmetros.add("20.4");
               HashMap<String, ArrayList<String>> tabla = new HashMap<String, ArrayList<String>>();
               tabla.put(primeraPrueba, cienmetros);
               tabla.put(segundaPrueba, doscientosmetros);
               */
               Atleta atleta1 = new Atleta("atleta", usuario, contrase鎙, nombre1, direccion1, fecha1, nacionalidad, tabla, categoria, "589783");
               //String tipo, String usuario, String contrase鎙, Nombre nombre, Direccion direccion, Fecha fecha, String nacionalidad, HashMap<String, ArrayList<String>> pruebaMarca, String categoria, String idEntrenador
               //Entrenador entrenador1 = new Entrenador("entrenador", "emi7595", "Soyemiliano1", nombre1, direccion1, fecha1, "Mexicana", "589783");
               f1 = new FileOutputStream("C:\\Users\\emili\\OneDrive\\Documents\\PROGRAMACION INTERMEDIA\\PROYECTO\\" + usuario + ".dat");
               f2 = new ObjectOutputStream(f1);
               f2.writeObject(atleta1);
               f2.close();
               f1.close();
            }catch(IOException e){
               System.out.println("Existe un error al grabar la informacion en el archivo");
            }
            break;
      }
   }
   
   public static void leerArchivo(){
         FileInputStream f1= null;
         ObjectInputStream f2 = null;
         Entrenador e1 = null;
         Atleta a1 = null;
         try{
            f1 = new FileInputStream("C:\\Users\\emili\\OneDrive\\Documents\\PROGRAMACION INTERMEDIA\\PROYECTO\\emi7596.dat");
            f2 = new ObjectInputStream(f1);
            while(true){
               e1 = (Entrenador) f2.readObject();
               System.out.println(e1);
            }        
         }
         catch(EOFException e){
            System.out.println("");
         }
         catch(IOException e){
            System.out.println(e);
         }
         catch(ClassNotFoundException e){
            System.out.println("Clase incorrecta");
         }
         catch(ClassCastException e){
            try{
               f1 = new FileInputStream("C:\\Users\\emili\\OneDrive\\Documents\\PROGRAMACION INTERMEDIA\\PROYECTO\\emi7596.dat");
               f2 = new ObjectInputStream(f1);
               while(true){
                  a1 = (Atleta) f2.readObject();
                  System.out.println(a1);
               }    
            
            }
            catch(EOFException x){
               System.out.println("");
            }
            catch(IOException x){
               System.out.println(x);
            }    
            catch(ClassNotFoundException x){
            System.out.println("Clase incorrecta");
            }
            

         }
         finally{
            try{
               f2.close();
               f1.close();
            }catch(IOException e){
               System.out.println("Error al cerrar el archivo");
            }
            catch(NullPointerException e){
               System.out.println("No hay archivo");
            }
         }
      }
   
}
//Persona: Nombre nombre, Direccion direccion, Fecha fecha, String nacionalidad
//Entrenador: Nombre nombre, Direccion direccion, Fecha fecha, String nacionalidad, int numeroAtletas
//Atleta: Nombre nombre, Direccion direccion, Fecha fecha, String nacionalidad, ArrayList<String> pruebas, ArrayList<String> marcas, String categoria


            /*
            System.out.print("Usuario: ");
            usuario = s.next();
            System.out.print("Contrasena: ");
            contrase鎙 = s.next();
            System.out.print("Nombre: ");
            nombre = s.next();
            System.out.print("Apellido Paterno: ");
            ap = s.next();
            System.out.print("Apellido Materno: ");
            am = s.next();
            System.out.print("Calle: ");
            calle = s.next();
            System.out.print("numeroInt: ");
            numeroInt = s.next();
            System.out.print("Ciudad: ");
            ciudad = s.next();
            System.out.print("Estado: ");
            estado = s.next();
            System.out.print("Fecha de Nacimiento (dd): ");
            dd = s.next();
            System.out.print("Fecha de Nacimiento (mm): ");
            mm = s.next();
            System.out.print("Fecha de Nacimiento (aa): ");
            aa = s.next();
            System.out.print("Nacionalidad: ");
            nacionalidad = s.next();
            //IDENTRENADOR
            */
