import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import template.VelocityTemplateEngine;

import static spark.Spark.*;

public class FoShizzle {
  public static void main(String[] args) {
    String layout = "templates/layout.wm";

    get("/foshizzle_it", (request, response) -> {
      Map model = new HashMap();

      model.put("template", "templates/home.wm" );
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/foshizzle_it", (request, response) -> {
      String word = request.queryParams("word");
      response.redirect("/foshizzle_it/" + word);
      return null;
    });

    get("/foshizzle_it/:word", (request, response) -> {
      Map model = new HashMap();
      String word = request.params("word");

      model.put("word", word);
      model.put("template", "templates/home.wm" );
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
