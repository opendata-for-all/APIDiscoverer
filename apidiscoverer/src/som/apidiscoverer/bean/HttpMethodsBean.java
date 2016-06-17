package som.apidiscoverer.bean;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import som.apidiscoverer.model.HttpMethod;

@ManagedBean(name = "httpMethodsBean")
@ApplicationScoped
public class HttpMethodsBean {

    public HttpMethod[] getMethods() {
        return HttpMethod.values();
    }

}