package empolyservice;

import empolyes.empolyes;

import java.util.ArrayList;
import java.util.List;

public class empolyservice {
List<empolyes> listem = new ArrayList<>();
    public empolyservice(){
        listem.add(new empolyes(1 , "j040" , "trình trần phương bảo" ,"bao@email.com"));
        listem.add(new empolyes(2 , "j40" , "trình trần phương bảo" ,"bao@email.com"));
        listem.add(new empolyes(3 , "j340" , "trình trần phương bảo" ,"bao@email.com"));
        listem.add(new empolyes(4 , "j440" , "trình trần phương bảo" ,"bao@email.com"));

    }

    public List<empolyes> getALl() {
        return listem;
    }
    public void add(empolyes ma){
        listem.add(ma);
    }
    public void remove(int id){
       for (empolyes em : listem){
           if(em.getId() == id){
               listem.remove(em);
               break;
           }
       }
    }
    public void update(empolyes ma){
        for (empolyes em : listem){
            if (em.getId() == ma.getId()){
 em.setFisitname(ma.getFisitname());
 em.setLastname(ma.getLastname());
 em.setEmail(ma.getEmail());
            }
        }
    }

}
