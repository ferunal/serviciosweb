/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uniminuto.casacambioweb.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author lchacon
 */
@WebService(serviceName = "CasaCambioWS")
@Stateless()
public class CasaCambioWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "cambiarDolaresSoles")
    public double cambiarDolaresSoles(@WebParam(name = "monto") double monto) {
        //TODO write your implementation code here:
        return monto*3.6d;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "cambiarSolesADolares")
    public double cambiarSolesADolares(@WebParam(name = "monto") double monto) {
        //TODO write your implementation code here:
        return monto/3.6d;
    }
}
