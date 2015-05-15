import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import template.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    String layout = "templates/layout.wm";

    get("/form", (request, response) -> {
      Map model = new HashMap();

      model.put("template", "templates/form.wm");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/story", (request, response) -> {
      Map model = new HashMap();

      model.put("person1", request.queryParams("person1"));
      model.put("person2", request.queryParams("person2"));
      model.put("animal", request.queryParams("animal"));
      model.put("exclamation", request.queryParams("exclamation"));
      model.put("verb", request.queryParams("verb"));
      model.put("noun", request.queryParams("noun"));

      model.put("template", "templates/story.wm");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
