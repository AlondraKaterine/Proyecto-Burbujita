/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Consola;

import Dao.ClienteDao;
import Dao.CompraDao;
import Dao.PersonaDao;
import Dao.ProductoDao;
import Dao.ProveedorDao;
import Dao.UsuarioDao;
import Dao.VentaDao;
import DaoImpl.ClienteDaoImpl;
import DaoImpl.CompraDaoImpl;
import DaoImpl.PersonaDaoImpl;
import DaoImpl.ProductoDaoImpl;
import DaoImpl.ProveedorDaoImpl;
import DaoImpl.UsuarioDaoImpl;
import DaoImpl.VentaDaoImpl;
import Entidad.Cliente;
import Entidad.Compra;
import Entidad.Persona;
import Entidad.Producto;
import Entidad.Proveedor;
import Entidad.Usuario;
import Entidad.Venta;

/**
 *
 * @author Parisan
 */
public class BurbujaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        BurbujaProject bp=new BurbujaProject();
        
//        ***********CLIENTE*********//
//     bp.agregarCliente();
//     bp.listarCliente();
//     bp.eliminarCliente();
//     bp.actualizarCliente();
//        
//        ***********COMPRA*********//
//     bp.agregarCompra();
//     bp.listarCompra();
//     bp.eliminarCompra();
//     bp.actualizarCompra();
//        
//        
//        ***********PERSONA*********//
//     bp.agregarPersona();
//     bp.listarPersona();
//     bp.eliminarPersona();
//     bp.actualizarPersona();
//        
//        ***********PRODUCTO*********//
//     bp.agregarProducto();
//     bp.listarProducto();
//     bp.eliminarProducto();
//     bp.actualizarProducto();
//        
//        
//        ***********PROVEEDOR*********//
     bp.agregarProveedor();
//     bp.listarProveedor();
//     bp.eliminarProveedor();
//     bp.actualizarProveedor();
//       
//        ***********USUARIO*************//
//     bp.agregarUsuario();
//     bp.listarUsuario();
//     bp.eliminarUsuario();
//     bp.actualizarUsuario();
//     
//         
//         ***********VENTA*************//
//     bp.agregarVenta();
//     bp.listarVenta();
//     bp.eliminarVenta();
//     bp.actualizarVenta();
//    
         
    }
    
    
      //***************CLIENTE*****************//  
    public void agregarCliente(){
        ClienteDao dao=new  ClienteDaoImpl();
        Cliente cliente=new Cliente();
        
            cliente.setId_persona(2);
            cliente.setEstado("1");
            
            if (dao.agregarCliente(cliente)) {
                System.out.println("Agregó Correctamente.");
            } else {
                System.out.println("Error.");
            }
        
    }
    public void listarCliente(){
         ClienteDao dao=new  ClienteDaoImpl();
        for (Cliente cl : dao.listarCliente()) {
        System.out.println("\n########################################");
        System.out.println("ID:"+cl.getId_cliente()+
                               "NOMBRES:"+cl.getId_persona()+
                               "\nAPELLIDOS:"+cl.getEstado());
                               
        System.out.println("\n########################################");
            
        }
    }
    
    public void eliminarCliente(){
        ClienteDao dao=new ClienteDaoImpl();
        if(dao.eliminarCliente(1)){
            System.out.println("Eliminó Correctamente");
        }else{
            System.out.println("Error.");
        }
    }
    
    public void actualizarCliente(){
       ClienteDao dao=new ClienteDaoImpl();
        Cliente cliente=new Cliente();
        
        cliente.setId_persona(2);
        cliente.setEstado("1");
        
        if (dao.actualizarCliente(cliente)) {
             System.out.println("Actualizó Correctamente.");
        } else {
            System.out.println("Error.");
        }
    }
    
    //************COMPRA**************/
    
    /*public void agregarCompra(){
        CompraDao dao=new CompraDaoImpl();
        Compra compra=new Compra();
        
            compra.setNombre("josue ");
            compra.setApepat("Alcantara");
            compra.setApemat("Garcia");
            compra.setFecha_nac("1996-10-25");
            compra.setSexo("M");
            compra.setDni(71553114);
            compra.setCelular(949630192);
            compra.setTelefono(949630192);
            compra.setDireccion("Av Peru #468");
            
            if (dao.agregarCompra(compra)) {
                System.out.println("Agregó Correctamente.");
            } else {
                System.out.println("Error.");
            }
        
    }
    public void listarCompra(){
        CompraDao dao=new CompraDaoImpl();
        for (Compra co : dao.listarCompra()) {
        System.out.println("\n########################################");
        System.out.println("\nID:"+co.getId_persona()+
                               "\nNOMBRES:"+co.getNombre()+
                               "\nAPELLIDOS:"+co.getApepat()+ p.getApemat()+
//                               "\nFECHA_NAC:"+per.getFecha_nac()+
                               "\nAPELLIDOS:"+co.getSexo()+
                               "\nDNI:"+co.getDni()+
                               "\nCELULAR:"+co.getCelular()+
                               "\nTELEFONO:"+co.getTelefono()+
                               "\nDIRECCION:"+co.getDireccion());
                               
        System.out.println("\n########################################");
            
        }
    }
    
    public void eliminarCompra(){
        CompraDao dao=new CompraDaoImpl();
        if(dao.eliminarCompra(1)){
            System.out.println("Eliminó Correctamente");
        }else{
            System.out.println("Error.");
        }
    }
    
    public void actualizarCompra(){
        CompraDao dao=new CompraDaoImpl();
        Compra compra=new Compra();
        compra.setId_persona(2);
        compra.setNombre("Pancho");
        compra.setApepat("Pizarro");
        compra.setApemat("Perez");
        compra.setFecha_nac("2015-12-05");
        compra.setSexo("F");
        compra.setDni(45678914);
        compra.setCelular(94242114);
        compra.setTelefono(445444465);
        compra.setDireccion("aaagfafafaf");
        
        if (dao.actualizarCompra(compra)) {
             System.out.println("Actualizó Correctamente.");
        } else {
            System.out.println("Error.");
        }
    }
    
    
    
    
    
    //************PERSONA**************/
    public void agregarPersona(){
        PersonaDao dao=new PersonaDaoImpl();
        Persona persona=new Persona();
        
            persona.setNombre("jfjfg ");
            persona.setApell_pater("gffffgf");
            persona.setApell_mater("Gaa");
            persona.setDireccion("asdsahhsdh");
            persona.setCorreo("sdgshdjh");
            persona.setTelefono("996301");
            persona.setCelular("9496301");
            persona.setRuc("fdgfgfdfd");
            persona.setNro_documento(3);
            persona.setTipo_persona("mayorista");
            persona.setTipo_documento("dni");
            persona.setGenero("M");
            
            
            if (dao.agregarPersona(persona)) {
                System.out.println("Agregó Correctamente.");
            } else {
                System.out.println("Error.");
            }
        
    }
    public void listarPersona(){
        PersonaDao dao=new PersonaDaoImpl();
        for (Persona p : dao.listarPersona()) {
        System.out.println("\n########################################");
        System.out.println("ID:"+p.getId_persona()+
                               "NOMBRES:"+p.getNombre()+
                               "APELLIDOS:"+p.getApell_pater()+ p.getApell_mater()+
//                               "\nFECHA_NAC:"+per.getFecha_nac()+
                               "DIRECCION:"+p.getDireccion()+
                               "CORREO:"+p.getCorreo()+
                               "TELEFONO:"+p.getTelefono()+
                               "CELULAR:"+p.getCelular()+
                               "RUC:"+p.getRuc()+
                               "NRO DOCUMENTO:"+p.getNro_documento()+
                               "TIPO_PERSONA:"+p.getTipo_persona()+
                               "TIPO_DOCUMENTO:"+p.getTipo_documento()+
                               "GENERO:"+p.getGenero() );
                               
        System.out.println("\n########################################");
            
        }
    }
    
    public void eliminarPersona(){
        PersonaDao dao=new PersonaDaoImpl();
        if(dao.eliminarPersona(1)){
            System.out.println("Eliminó Correctamente");
        }else{
            System.out.println("Error.");
        }
    }
    
    public void actualizarPersona(){
        PersonaDao dao=new PersonaDaoImpl();
        Persona persona=new Persona();
        
        persona.setNombre("Manuel");
            persona.setApell_pater("torres");
            persona.setApell_mater("Gaany");
            persona.setDireccion("tarapoto");
            persona.setCorreo("sfsfdddh");
            persona.setTelefono("99678");
            persona.setCelular("9496876");
            persona.setRuc("fdgdddddd");
            persona.setNro_documento(23454311);
            persona.setTipo_persona("publico");
            persona.setTipo_documento("dni");
            persona.setGenero("M");
        
        if (dao.actualizarPersona(persona)) {
             System.out.println("Actualizó Correctamente.");
        } else {
            System.out.println("Error.");
        }
    }
    /*
    //************PRODUCTO**************/
    public void agregarProducto(){
        ProductoDao dao=new ProductoDaoImpl();
        Producto producto=new Producto();
        
            producto.setCodigo("001");
            producto.setNombre("caramelo ");            
            producto.setId_categoria(2);
            producto.setPresentacion("bonito");
            producto.setMarca("xxqw");
            producto.setModelo("mm");
            producto.setId_unidad_medida(2);
            producto.setPrecio_compra(12);
            producto.setEstado("1");
            
            if (dao.agregarProducto(producto)) {
                System.out.println("Agregó Correctamente.");
            } else {
                System.out.println("Error.");
            }
        
    }
    public void listarProducto(){
        ProductoDao dao=new ProductoDaoImpl();
        for (Producto pro : dao.listarProducto()) {
        System.out.println("\n########################################");
        System.out.println("Codigo:"+pro.getCodigo()+
                               "Nombre:"+pro.getNombre()+ //                              
                               "Id_categoria:"+pro.getId_categoria()+
                               "Presentacion:"+pro.getPresentacion()+
                               "Marca:"+pro.getMarca()+
                               "Modelo:"+pro.getModelo()+
                               "Id_unidad_medida:"+pro.getId_unidad_medida()+
                                "Precio_compra:"+pro.getPrecio_compra()+
                                "Estado:"+pro.getEstado());
                               
        System.out.println("\n########################################");
            
        }
    }
    
    public void eliminarProducto(){
        ProductoDao dao=new ProductoDaoImpl();
        if(dao.eliminarProducto(238)){
            System.out.println("Eliminó Correctamente");
        }else{
            System.out.println("Error.");
        }
    }
    
    public void actualizarProducto(){
        ProductoDao dao=new ProductoDaoImpl();
        Producto producto=new Producto();
        
        producto.setCodigo("Pizarro");
        producto.setNombre("Pancho");        
        producto.setId_categoria(2);
        producto.setPresentacion("2015-12-05");
        producto.setModelo("simpaticp");
        producto.setId_unidad_medida(2);
        producto.setPrecio_compra(123);
        producto.setEstado("1");
        
        
        if (dao.actualizarProducto(producto)) {
             System.out.println("Actualizó Correctamente.");
        } else {
            System.out.println("Error.");
        }
    }
     //***************PROVEEDOR*****************/
    public void agregarProveedor(){
        ProveedorDao dao=new ProveedorDaoImpl();
        Proveedor proveedor=new Proveedor();
        
            proveedor.setNombre("josue ");
            proveedor.setCorreo("hjkfghjk");
            proveedor.setDireccion("morales");
            proveedor.setTelefono_celular("987643567");
            proveedor.setRuc("56789009876");           
            proveedor.setEstado("1");
            
            if (dao.agregarProveedor(proveedor)) {
                System.out.println("Agregó Correctamente.");
            } else {
                System.out.println("Error.");
            }
        
    }
    public void listarProveedor(){
        ProveedorDao dao=new ProveedorDaoImpl();
        for (Proveedor prove : dao.listarProveedor()) {
        System.out.println("\n########################################");
        System.out.println("ID:"+prove.getId_proveedor()+
                               "NOMBRES:"+prove.getNombre()+
                               "CORREO:"+prove.getCorreo()+ 
                               "DIRECCION:"+prove.getDireccion()+
                               "TELEFONO_CELULAR:"+prove.getTelefono_celular()+
                               "RUC:"+prove.getRuc()+
                               "ESTADO:"+prove.getEstado()+
                               "\nDIRECCION:"+prove.getDireccion());
                               
        System.out.println("\n########################################");
            
        }
    }
    
    public void eliminarProveedor(){
        ProveedorDao dao=new ProveedorDaoImpl();
        if(dao.eliminarProveedor(1)){
            System.out.println("Eliminó Correctamente");
        }else{
            System.out.println("Error.");
        }
    }
    
    public void actualizarProveedor(){
        ProveedorDao dao=new ProveedorDaoImpl();
        Proveedor proveedor=new Proveedor();
        proveedor.setId_persona(2);
        proveedor.setNombre("jose");
        proveedor.setCorreo("renyi");
        proveedor.setDireccion("mora");
        proveedor.setTelefono_celular("987647777");
        proveedor.setRuc("567233465476");           
        proveedor.setEstado("1");
        
        if (dao.actualizarProveedor(proveedor)) {
             System.out.println("Actualizó Correctamente.");
        } else {
            System.out.println("Error.");
        }
    }
    
    
    
    
    public void agregarUsuario(){
        UsuarioDao dao = new UsuarioDaoImpl();
        Usuario usuario =  new Usuario();
            
            usuario.setUsuario("bur");
            usuario.setPassword("123");
            usuario.setRol("administrador");
            usuario.setEstado("1");
            
            
            if (dao.agregarUsuario(usuario)) {
                System.out.println("Agregó Correctamente.");
            } else {
                System.out.println("Error.");
            }
        
    }
    
    public void listarUsuario(){
        UsuarioDao dao = new UsuarioDaoImpl();
        for (Usuario usu : dao.listarUsuario()) {
        System.out.println("\n------------------------");
        System.out.println("Id:"+usu.getId_usuario()+
                               " nombre:"+usu.getUsuario()+
                               " contraseña:"+usu.getPassword()+
                               " rol:"+usu.getRol()+
                               "estado:"+usu.getEstado());
        System.out.println("------------------------");
            
        }
    }
    public void eliminarUsuario(){
         UsuarioDao dao = new UsuarioDaoImpl();
        if(dao.eliminarUsuario(2)){
            System.out.println("Eliminó Correctamente.");
        }else{
            System.out.println("Error.");
        }
    }
    
    public void actualizarUsuario(){
        UsuarioDao dao = new UsuarioDaoImpl();
        Usuario usuario =  new Usuario();
        usuario.setId_usuario(2);
        usuario.setUsuario("PRO");
        usuario.setPassword("123");
        usuario.setRol("administrador");
        usuario.setEstado("1");
        
        if (dao.actualizarUsuario(usuario)) {
             System.out.println("Actualizó Correctamente.");
        } else {
            System.out.println("Error.");
        }
    }
    

    public void agregarVenta(){
        VentaDao dao = new VentaDaoImpl();
        Venta venta=  new Venta();
            venta.setId_usuario(2);
//            venta.setUsuario("jos");
//            venta.setContraseña("123");
//            venta.setRol("administrador");
            venta.setEstado("1");
            
            
            if (dao.agregarVenta(venta)) {
                System.out.println("Agregó Correctamente.");
            } else {
                System.out.println("Error.");
            }
        
    }
    
    public void listarVenta(){
        VentaDao dao = new VentaDaoImpl();
        for (Venta ve : dao.listarVenta()) {
        System.out.println("\n------------------------");
        System.out.println("\n Id:"+ve.getId_usuario()+
//                               "\n nombre:"+ve.getUsuario()+
//                               "\n contraseña:"+ve.getContraseña()+
//                               "\n rol:"+ve.getRol()+
                               "\n estado:"+ve.getEstado());
        System.out.println("------------------------");
            
        }
    }
    public void eliminarVenta(){
         VentaDao dao = new VentaDaoImpl();
        if(dao.eliminarVenta(2)){
            System.out.println("Eliminó Correctamente.");
        }else{
            System.out.println("Error.");
        }
    }
    
    public void actualizarVenta(){
        VentaDao dao = new VentaDaoImpl();
        Venta venta =  new Venta();
        venta.setId_usuario(2);
//        venta.setUsuario("alcantara");
//        venta.setContraseña("123");
//        venta.setRol("administrador");
        venta.setEstado("1");
        
        if (dao.actualizarVenta(venta)) {
             System.out.println("Actualizó Correctamente.");
        } else {
            System.out.println("Error.");
        }
    }
   
}  
    
        

