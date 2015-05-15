import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import template.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.wm";


    get("/", (request, response) -> {
      Map model = new HashMap();

      model.put("template", "templates/hello.wm" );
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/favorite_photos", (request, response) -> {
      Map model = new HashMap();

      model.put("template", "templates/favorite_photos.wm" );
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/form", (request, response) -> {
      Map model = new HashMap();

      model.put("template", "templates/form.wm");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/greeting_card", (request, response) -> {
      Map model = new HashMap();
      String recipient = request.queryParams("recipient");
      String sender = request.queryParams("sender");

      System.out.println(request.queryParams());

      model.put("recipient", recipient);
      model.put("sender", sender);
      model.put("template", "templates/greeting_card.wm");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
