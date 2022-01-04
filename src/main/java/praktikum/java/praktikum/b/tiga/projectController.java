
package praktikum.java.praktikum.b.tiga;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.ran.serviceProcess;
//import praktikum.java.praktikum.b.tiga.logicalProcess; //import class logicallProcess
/**
 *
 * @author Zahran Rafif Pc
 */

@Controller
@ResponseBody
public class projectController {
    //mengirim dari service ke controller
    
    //Dikembangin
    //dari serviceProcess
    serviceProcess money = new serviceProcess();
    @RequestMapping("/tampilkonversi2")
    public String Matauang2(){
        String uang;   
        //input                   //dolar, yuan, yen, rupee, baht
        uang = money.getMatauang2(100, 40, 10000, 30, 40); 
        return uang;
    }
    
    serviceProcess jaran = new serviceProcess(); //Sesuai kelas yg di service
    @RequestMapping("/tampilmahasiswa")
    public String tampilMaha(){
        String input;       
          input = serviceProcess.mahasiswa("Zahran Rafif", "20200140073", "2020", "Zahran Rafif");      
        return input;
    }  
}

