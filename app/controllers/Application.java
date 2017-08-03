package controllers;

import play.*;
import play.libs.F.Callback;
import play.libs.F.Callback0;
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
    
    public static WebSocket<String> hello() {
        return new WebSocket<String>() {
            public void onReady(WebSocket.In<String> in,
                    WebSocket.Out<String> out) {
                in.onMessage(new Callback<String>() {
                    public void invoke(String event) {
                        System.out.println(event);
                    }
                });
                in.onClose(new Callback0() {
                    public void invoke() {
                        System.out.println("Disconnected");
                    }
                });
                out.write("Hello client!");
            }
        };
    }
}
