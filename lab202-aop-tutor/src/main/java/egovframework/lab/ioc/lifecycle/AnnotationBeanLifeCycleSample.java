package egovframework.lab.ioc.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import egovframework.lab.ioc.postprocess.Debug;

@Component("annotationBeanLifeCycleSample")
public class AnnotationBeanLifeCycleSample {

    protected final Log log = LogFactory.getLog(this.getClass());

    @Debug
    public String sampleMethod() {
        return "Hi~ annotation sample";
    }

    public void afterPropertiesSet() throws Exception {
        log
            .debug("InitializingBean 을 구현한 경우 Bean 초기화(Initialization) 시 afterPropertiesSet 메서드가 수행됨.");
    }

    @PostConstruct
    public void directedInit() throws Exception {
        log.debug("@PostConstruct 를 기술한 메서드의 경우  초기화 메서드로 수행됨.");
    }

    public void destroy() throws Exception {
        log
            .debug("DisposableBean 을 구현한 경우 Bean 종료(Destruction) 시 destroy 메서드가 수행됨.");
    }

    @PreDestroy
    public void directedDestroy() throws Exception {
        log.debug("@PreDestroy 를 기술한 메서드의 경우 종료 메서드로 수행됨.");
    }

}
