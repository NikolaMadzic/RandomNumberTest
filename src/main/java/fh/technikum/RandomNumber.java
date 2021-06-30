package fh.technikum;

import java.util.Random;

import javax.ws.rs.*;
import javax.ws.rs.container.*;
import javax.ws.rs.core.*;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.net.URI;
import java.util.*;

@Path("/api")
public class RandomNumber {

    @GET
    @Path("/createRandomNumber/")
    @Produces(MediaType.TEXT_PLAIN)
    public String createRandomNumber() {
        Random rand = new Random(); //instance of random class
        int upperbound = 100;
        int int_random = rand.nextInt(upperbound);
        System.out.println("Random integer value from 0 to" + (upperbound-1) + " : "+ int_random);
        return String.format("%d",int_random);
    }




}
