package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
    
    public static Result insumos() {
        Content html = insumos.render();
        return ok(html);
    }
    
    public static Result productos() {
        Content html = productos.render();
        return ok(html);
    }
    
    public static Result ventas() {
        Content html = ventas.render();
        return ok(html);
    }
}
