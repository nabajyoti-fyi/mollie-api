package nl.stil4m.mollie.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Page<T> {
	private final Integer totalCount;
	
	private final Integer offset;
	
	private final Integer count;
	
	private final List<T> data;
	
	private final PageLinks links;
	
	@JsonCreator
	public Page(@JsonProperty("totalCount") Integer totalCount, @JsonProperty("offset") Integer offset, @JsonProperty("count") Integer count, @JsonProperty("data") List<T> data, @JsonProperty("links") PageLinks links) {
		this.totalCount = totalCount;
		this.offset = offset;
		this.count = count;
		this.data = data;
		if (links == null) {
			this.links = new PageLinks(null, null, null, null);
		} else {
			this.links = links;
		} 
	}
	
	public Integer getTotalCount() { return this.totalCount; }
	
	public Integer getOffset() { return this.offset; }
	
	public Integer getCount() { return this.count; }
	
	public List<T> getData() { return this.data; }
	
	public PageLinks getLinks() { return this.links; }
}
