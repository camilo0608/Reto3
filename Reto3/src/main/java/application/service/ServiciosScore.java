package application.service;

import application.Model.Score;
import application.repository.RepositorioScore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ServiciosScore {
    @Autowired
    private RepositorioScore scoreRepository;

    public List<Score> getAll(){
        
        return  scoreRepository.getAll();
        
    }
    public Optional<Score> getScore(int id){
        
        return scoreRepository.getScore(id);
    }

    public Score save(Score score){
        
        if(score.getId()==null){
            
            return scoreRepository.save(score);
            
        }
        else{
            
            var paux=scoreRepository.getScore(
                    score.getId()
            );
            
            if(!paux.isPresent()){
                
                return scoreRepository.save(score);
                
            }
            else{
                
                return score;
                
            }
        }
    }
}
