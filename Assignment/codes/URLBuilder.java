package Questions;

import java.util.Map;

public class URLBuilder {
	private String protocol;
	private String host;
	private String path;
	private Map<String,String> queryParams;
	public URLBuilder(String protocol, String host, String path, Map<String, String> queryParams) {
		super();
		this.protocol = protocol;
		this.host = host;
		this.path = path;
		this.queryParams = queryParams;
	}
	public String buildURL()
	{
		StringBuilder url =new StringBuilder(protocol);
		url.append("://").append(host).append(path);
		if(queryParams != null && !queryParams.isEmpty())
		{
			url.append("?");
			for(Map.Entry<String,String> entry: queryParams.entrySet())
			{
				url.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
			}
			url.deleteCharAt(url.length()-1);
		}
		return url.toString();	}

}
