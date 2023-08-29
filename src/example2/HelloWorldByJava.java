package example2;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorldByJava implements InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("HelloWorldByJava destroy " + this.getClass().getSimpleName());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("HelloWorldByJava init " + this.getClass().getSimpleName());
    }
}
