/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eicon.repositoriorest;

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
        System.out.println("teste");
        RetornoModel retorno = new RetornoModel();
        retorno.setRetorno("teste");
        
        
        return retorno;
    }

    @Path("{c}")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public String testeParametro(@PathParam("c") String c) {

        return c + "teste com parametro";
    }
}
