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
      // Map model = new HashMap();
      //
      // model.put("template", "templates/hello.wm" );
      return new ModelAndView(new HashMap(), layout);
    }, new VelocityTemplateEngine());

    get("/favorite_photos", (request, response) -> {
      Map model = new HashMap();

      model.put("template", "templates/favorite_photos.wm" );
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
