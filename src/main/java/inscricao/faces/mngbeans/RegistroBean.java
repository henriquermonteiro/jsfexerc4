/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inscricao.faces.mngbeans;

import inscricao.entity.Candidato;
import java.util.ArrayList;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import utfpr.faces.support.PageBean;

/**
 *
 * @author Henrique
 */
@ManagedBean(name = "registroBean")
@ApplicationScoped
public class RegistroBean extends PageBean {
    private ArrayList<Candidato> candidatosList;

    public ArrayList<Candidato> getCandidatosList() {
        return candidatosList;
    }

    public void setCandidatosList(ArrayList<Candidato> candidatosList) {
        this.candidatosList = candidatosList;
    }

    public RegistroBean() {
        candidatosList = new ArrayList<>();
    }
    
    
}
