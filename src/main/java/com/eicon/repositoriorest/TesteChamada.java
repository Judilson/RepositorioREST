/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eicon.repositoriorest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author jjunior
 */
@Path("/testandoREST")
public class TesteChamada {

    @GET
    @Produces("application/xml")
    public String teste() {
        String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n";
        return "<ctofservice>" + "<celsius>" + "teste" + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
    }

    @Path("{c}")
    @GET
    @Produces("application/xml")
    public String testeParametro(@PathParam("c") String c) {

        return c + "teste com parametro";
    }
}
