/** Copyright Payara Services Limited **/

package org.vendoree.payara.jaxrs.rolesallowed.servlet;

import static javax.ws.rs.core.MediaType.TEXT_PLAIN;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/resource")
@Produces(TEXT_PLAIN)
public class Resource {

    @GET
    @Path("hi")
    @RolesAllowed("a")
    public String hi() {
       return "hi!";
    }


}
