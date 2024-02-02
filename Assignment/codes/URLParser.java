package Questions;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class URLParser {
	private String protocol;
	private String host;
	private String path;
	private Map<String,String> queryParameters;
	public URLParser() {
		super();
	}
	public void parseURL(String urlString)
	{
		try {
			URI uri = new URI(urlString);
			this.protocol=uri.getScheme();
			this.host=uri.getHost();
			this.path=uri.getPath();
			this.queryParameters=getQueryParameters(uri.getQuery());
		}
		catch(URISyntaxException e)
		{
			e.printStackTrace();
		}
	}
	private Map<String,String> getQueryParameters(String query)
	{
		Map<String,String> queryParams=new HashMap<>();
		if(query!=null && !query.isEmpty())
		{
			String[] pairs =query.split("&");
			for(String pair:pairs)
			{
				String[] keys=pair.split("=");
				if(keys.length==2)
				{
					queryParams.put(keys[0],keys[1]);
				}
			}
		}
		return queryParams;
	}
	public String getProtocol() {
		return protocol;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public Map<String, String> getQueryParameters() {
		return queryParameters;
	}
	public void setQueryParameters(Map<String, String> queryParameters) {
		this.queryParameters = queryParameters;
	}

}
