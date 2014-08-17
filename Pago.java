import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 *
 * @author Jessy
 */
@Controller
@RequestMapping
public class Pago {
    float Pago;
    public @ResponseBody String mensajito(@PathVariable float primerPago, @PathVariable float 
            segundoPago,@PathVariable float total, @PathVariable int id ){
        String mensajito="nada";
        try{
           Pago d= new Pago();
            d.agregarPago(new Pago(primerPago, segundoPago, total,new Cliente(id)));
           mensajito= "Pago almacenado";
        }catch(Exception  e){
            mensajito="error en id de usuario";
        }return null;
}}
    

