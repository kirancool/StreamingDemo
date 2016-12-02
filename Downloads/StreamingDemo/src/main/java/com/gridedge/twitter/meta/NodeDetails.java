package com.gridedge.twitter.meta;

import java.util.List;
import java.util.Map;

public class NodeDetails 
{
	
		private String jsonName;
		/*private String vertices;
		private String edges;*/
		private List<java.util.Map<String, Object>> nodes;
		private List<java.util.Map<String, Object>> links;
		
		public String getJsonName() {
			return jsonName;
		}
		public void setJsonName(String jsonName) {
			this.jsonName = jsonName;
		}
		public List<java.util.Map<String, Object>> getNodes() {
			return nodes;
		}
		public void setNodes(List<java.util.Map<String, Object>> nodes) {
			this.nodes = nodes;
		}
		/*public List<Vertices> getVertices() {
			return vertices;
		}
		public void setVertices(List<Vertices> vertices) {
			this.vertices = vertices;
		}*/
		public List<Map<String, Object>> getLinks() {
			return links;
		}
		public void setLinks(List<Map<String, Object>> links) {
			this.links = links;
		}
		/*public List<JSONArray> getVertices() {
			return vertices;
		}
		public void setVertices(List<JSONArray> vertices) {
			this.vertices = vertices;
		}
		public List<JSONArray> getEdges() {
			return edges;
		}
		public void setEdges(List<JSONArray> edges) {
			this.edges = edges;
		}*/
		public class Vertices{
			private String uuid;
			private String name;
			private String location;
			private String nodeType;
			
			public String getLocation() {
				return location;
			}
			public void setLocation(String location) {
				this.location = location;
			}
			
			
			public String getVersion() {
				return version;
			}
			public void setVersion(String version) {
				this.version = version;
			}
			
			
			private String version;
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			
			public String getUuid() {
				return uuid;
			}
			public void setUuid(String uuid) {
				this.uuid = uuid;
			}
			public String getNodeType() {
				return nodeType;
			}
			public void setNodeType(String nodeType) {
				this.nodeType = nodeType;
			}
			
		}
		public class Edges{
			private String srcId;
			private String targetId;
			private String relationshipType;
			public String getSrcId() {
				return srcId;
			}
			public void setSrcId(String srcId) {
				this.srcId = srcId;
			}
			public String getTargetId() {
				return targetId;
			}
			public void setTargetId(String targetId) {
				this.targetId = targetId;
			}
			public String getRelationshipType() {
				return relationshipType;
			}
			public void setRelationshipType(String relationshipType) {
				this.relationshipType = relationshipType;
			}
		}
	}

