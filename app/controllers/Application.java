package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import models.User;
import play.*;
import play.libs.Json;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
    
    public static Result json() {
    	JsonNode jsonNode = Json.toJson(new User("ももいろ"));
    	System.out.println(jsonNode);
    	return ok(jsonNode);

    }

}
