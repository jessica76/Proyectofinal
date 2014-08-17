import java.util.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jessy
 */    
@Controller
@RequestMapping("/nominas")
public class Nomina  {
    int Trabajador;
    int idNomina;
   Float total;
    
    
    public Nomina() {
        this.Pago = Pago;
        this.total = total;
        this.id = id;
    }

    public Nomina(Integer idNomina) {
        this.idNomina = idNomina;
    }

    public Integer getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(Integer idNomina) {
        this.idNomina = idNomina;
    }

    public Date getFechaPago() {
        return Pago;
    }

    public void setFechaPago(Date fechaPago) {
        this.Pago = Pago;
    }

    public Float gettotal() {
        return total;
    }

    public void settotal(Float total) {
        this.total = total;
    }

    public Trabajador getId() {
        return id;
    }

    public void setId(Trabajador id) {
        this.id = id; 
        return ;
    }

  
       
    }

    
