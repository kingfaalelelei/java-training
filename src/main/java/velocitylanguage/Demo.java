package velocitylanguage;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import java.io.StringWriter;

public class Demo {
  public static void main(String[] args) {
    VelocityEngine velocityEngine = new VelocityEngine();
    velocityEngine.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
    velocityEngine.setProperty("classpath.resource.loader.class",
        ClasspathResourceLoader.class.getName());
    velocityEngine.init();

    Template t = velocityEngine.getTemplate("/vtemplates/index.vm");

    VelocityContext context = new VelocityContext();
    context.put("name", "World");

    StringWriter writer = new StringWriter();
    t.merge( context, writer );

    System.out.println(writer.toString());
  }

//  static String modelName = "User";
//  static String packageName = "com.companyname.projectname";
//
//  public static void main(String[] args) {
//    VelocityEngine velocityEngine = new VelocityEngine();
//    velocityEngine.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
//    velocityEngine.setProperty("classpath.resource.loader.class",
//        ClasspathResourceLoader.class.getName());
//    velocityEngine.init();
//
//    Template t = velocityEngine.getTemplate("/vtemplates/class.vm");
//
//    VelocityContext context = new VelocityContext();
//
//    if(packageName != null) {
//      context.put("packagename", packageName);
//    }
//
//    List<Field> properties = new ArrayList<>();
//    properties.add(new Field("id", "int"));
//    properties.add(new Field("firstName", "String"));
//    properties.add(new Field("lastName", "String"));
//    properties.add(new Field("dob", "LocalDate"));
//    context.put("className", modelName);
//    context.put("properties", properties);
//
//    StringWriter writer = new StringWriter();
//    t.merge( context, writer );
//
//    System.out.println(writer.toString());
//  }

//  public static void main(String[] args) {
//    VelocityEngine ve = new VelocityEngine();
//    ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
//    ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
//    ve.init();
//    VelocityContext context = new VelocityContext();
//    context.put("date", new Date());
//    Template t = ve.getTemplate( "/vtemplates/index.vm" );
//    StringWriter writer = new StringWriter();
//    t.merge( context, writer );
//  }
}
