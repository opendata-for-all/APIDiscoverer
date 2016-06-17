package som.apidiscoverer.bean;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.primefaces.model.DefaultStreamedContent;

import com.mashape.unirest.http.exceptions.UnirestException;

import jsondiscoverer.util.ModelHelper;
import som.apidiscoverer.Discoverer;
import som.apidiscoverer.model.APIRequest;
import som.apidiscoverer.model.HttpMethod;
import som.apidiscoverer.model.Response;
import som.apidiscoverer.util.GenerationrUtils;
import som.apidiscoverer.util.RESTClient;
@ManagedBean(name = "discovererBean")
@ViewScoped
public class DiscovererBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<APIRequest> records;
	
	private APIRequest newAPIRequest;
	private Response response;
	private Discoverer discoverer;
	  private DefaultStreamedContent download;
	  private DefaultStreamedContent ecore;

    @PostConstruct
    public void init() {
    	newAPIRequest = new APIRequest();
    	response = new Response();
    	discoverer = new Discoverer();
    	setRecords(new ArrayList<>());
    	System.out.println(HttpMethod.values());
    }
  

    public void setDownload(DefaultStreamedContent download) {
        this.download = download;
    }

    public DefaultStreamedContent getDownload() throws Exception {
        System.out.println("GET = " + download.getName());
        return download;
    }

    public void prepDownload() throws Exception {
    	 File temp = File.createTempFile("swagger", ".json"); 
 		FileWriter fileWritter = new FileWriter(temp.getPath(),true);
         BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
         System.out.println(GenerationrUtils.getJsonFromSwaggerModel(discoverer.getApi()).toString());
         bufferWritter.write(GenerationrUtils.getJsonFromSwaggerModel(discoverer.getApi()).toString());
         bufferWritter.close();
        InputStream input = new FileInputStream(temp);
        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        setDownload(new DefaultStreamedContent(input, externalContext.getMimeType(temp.getName()), temp.getName()));
    }
    public void downloadEcore() throws Exception {
   	 File temp = File.createTempFile("schema", ".ecore"); 
   	ModelHelper.saveEPackage(discoverer.getSchema(), temp);


       InputStream input = new FileInputStream(temp);
       ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
       setEcore(new DefaultStreamedContent(input, externalContext.getMimeType(temp.getName()), temp.getName()));
   }
public void sendRequest() throws MalformedURLException{
	try {
		response = RESTClient.send(newAPIRequest);
		newAPIRequest.setResponse(response);
		discoverer.discover(newAPIRequest);
		records.add(newAPIRequest);
		
	} catch (UnirestException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

public void cleanForms(){
	newAPIRequest = new APIRequest();
	response = new Response();

}
	public List<APIRequest> getRecords() {
		return records;
	}


	public void setRecords(List<APIRequest> records) {
		this.records = records;
	}


	
	public APIRequest getNewAPIRequest() {
		return newAPIRequest;
	}


	public void setNewAPIRequest(APIRequest newAPIRequest) {
		this.newAPIRequest = newAPIRequest;
	}

	public Response getResponse() {
		return response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}


	public DefaultStreamedContent getEcore() {
		return ecore;
	}


	public void setEcore(DefaultStreamedContent ecore) {
		this.ecore = ecore;
	}
	
	
}