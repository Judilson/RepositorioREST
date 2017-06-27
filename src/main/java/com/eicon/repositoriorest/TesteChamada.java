/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eicon.repositoriorest;

import br.com.giex.api.RetrieveMongo;
import com.eicon.repositoriorest.model.RetornoByteModel;
import com.eicon.repositoriorest.model.RetornoModel;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author jjunior
 */
@Path("/testandoREST")
public class TesteChamada {

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public RetornoModel teste() {

        RetornoModel retorno = new RetornoModel();
        
        return retorno;
    }

    @Path("{objectID}")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public RetornoByteModel testeParametro(@PathParam("objectID") String objectID) {

        RetrieveMongo retrive = new RetrieveMongo();
        
        byte[] b = retrive.retrieveByte(objectID, "giex_arquivos", "arquivos", "", "");
        
        RetornoByteModel retorno = new RetornoByteModel();
        retorno.setRetorno(b);
        
        return retorno;
    }
}
