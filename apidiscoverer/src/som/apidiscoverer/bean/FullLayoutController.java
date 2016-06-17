package som.apidiscoverer.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.CloseEvent;
import org.primefaces.extensions.component.layout.LayoutPane;
import org.primefaces.extensions.event.OpenEvent;
import org.primefaces.extensions.event.ResizeEvent;
import org.primefaces.extensions.model.layout.LayoutOptions;

@ManagedBean  
@ViewScoped  
public class FullLayoutController implements Serializable {  
  
    private static final long serialVersionUID = 20120925L;  
  
    private LayoutOptions layoutOptions;  
  
    @PostConstruct  
    protected void initialize() {  
        layoutOptions = new LayoutOptions();  
  
        // options for all panes  
        LayoutOptions panes = new LayoutOptions();  
        panes.addOption("slidable", false);  
        panes.addOption("resizeWhileDragging", false);  
        layoutOptions.setPanesOptions(panes);  
  
        // options for center pane  
        LayoutOptions center = new LayoutOptions();  
        layoutOptions.setCenterOptions(center);  
  
        // options for nested center layout  
        LayoutOptions childCenterOptions = new LayoutOptions();  
        center.setChildOptions(childCenterOptions);  
  
        // options for center-north pane  
        LayoutOptions centerNorth = new LayoutOptions();  
        centerNorth.addOption("size", "50%");  
        childCenterOptions.setNorthOptions(centerNorth);  
  
        // options for center-center pane  
        LayoutOptions centerCenter = new LayoutOptions();  
        centerCenter.addOption("minHeight", 60);  
        childCenterOptions.setCenterOptions(centerCenter);  
  
        // options for west pane  
        LayoutOptions west = new LayoutOptions();  
        west.addOption("size", 200);  
        layoutOptions.setWestOptions(west);  
  
       
  
        // options for east pane  
        LayoutOptions east = new LayoutOptions();  
        east.addOption("size", 200);  
        layoutOptions.setEastOptions(east);  
  
        // options for south pane  
        LayoutOptions south = new LayoutOptions();  
        south.addOption("size", 80);  
        layoutOptions.setSouthOptions(south);  
    }  
  
    public LayoutOptions getLayoutOptions() {  
        return layoutOptions;  
    }  
  
    public void handleClose(CloseEvent event) {  
        FacesMessage msg =  
            new FacesMessage(FacesMessage.SEVERITY_INFO, "Layout Pane closed",  
                             "Position:" + ((LayoutPane) event.getComponent()).getPosition());  
  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }  
  
    public void handleOpen(OpenEvent event) {  
        FacesMessage msg =  
            new FacesMessage(FacesMessage.SEVERITY_INFO, "Layout Pane opened",  
                             "Position:" + ((LayoutPane) event.getComponent()).getPosition());  
  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }  
  
    public void handleResize(ResizeEvent event) {  
        FacesMessage msg =  
            new FacesMessage(FacesMessage.SEVERITY_INFO, "Layout Pane resized",  
                             "Position:" + ((LayoutPane) event.getComponent()).getPosition() + ", new width = "  
                             + event.getWidth() + "px, new height = " + event.getHeight() + "px");  
  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }  
}  