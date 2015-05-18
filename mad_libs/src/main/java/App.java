import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import spark.ModelAndView;
import template.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    String layout = "templates/layout.wm";

    get("/form", (request, response) -> {
      Map model = new HashMap();
      Set<String> sessionResponse = request.session().attributes();
      System.out.println(sessionResponse.getClass());
      for ( String item : sessionResponse ) {
        String thisItem = request.session().attribute(item);
        System.out.println(thisItem);
      }

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

      request.session().attribute("testing this", "test");
      request.session().attribute("more testing", "testing again");
      request.session().attribute("more again", "again again");

      model.put("template", "templates/story.wm");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
