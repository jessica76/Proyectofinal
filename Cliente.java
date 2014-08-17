import java.lang.String.String;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
/*
 
 * @author Jessy
 */

@Controller
@RequestMapping("/")

public class Cliente {

    private Cliente(String nombre, String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
@RequestMapping(value="/cliente/nombre/email", method=RequestMethod.GET, headers={"Accept=text/html"})
    public @ResponseBody String mensajito(@PathVariable String nombre, @PathVariable String email){
          Cliente d= new Cliente();
           d.Cliente(new Cliente(nombre, email));
           return "Datos Guardados";
    }
    
    @RequestMapping(value="/cliente", method=RequestMethod.GET, headers={"Accept=application/json"})
    public @ResponseBody String metodo2()throws Exception {
        Cliente d=new Cliente();
        ObjectMapper maper=new ObjectMapper();
            
        return maper.writeValueAsString(d.buscarClientes());
    }
}    
    
    
    

