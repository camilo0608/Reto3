package application.web;


import application.Model.Score;
import application.service.ServiciosScore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import static org.springframework.http.HttpStatus.CREATED;
import org.springframework.web.bind.annotation.*;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@RestController
@RequestMapping("/api/Score")
@CrossOrigin(origins = "*", methods= {GET, POST, PUT, DELETE})
public class ControladorScore {

    @Autowired
    private ServiciosScore scoreService;

    @PostMapping("/save")
    @ResponseStatus(CREATED)
    public Score save(@RequestBody Score c){
        
        return scoreService.save(c);
        
    }
}
