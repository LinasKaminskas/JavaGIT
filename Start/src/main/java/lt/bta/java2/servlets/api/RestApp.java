package lt.bta.java2.servlets.api;

import lt.bta.java2.servlets.api.impl.EmployeeServiceImpl;
import lt.bta.java2.servlets.api.impl.TitleServiceImpl;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class RestApp extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<>();
        resources.add(EmployeeServiceImpl.class);
        resources.add(ObjectMapperContextResolver.class);
        resources.add(TitleServiceImpl.class);
        //...
        return resources;
    }
}
