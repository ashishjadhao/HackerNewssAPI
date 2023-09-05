package com.domain.HackerNewAPI.dto;



	import java.util.List;

	public class StoryDTO {
	    private String title;
	    private String url;
	    private int score;
	    private long time;
	    private String user;
	    private List<Long> commentIds;
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
		public long getTime() {
			return time;
		}
		public void setTime(long time) {
			this.time = time;
		}
		public String getUser() {
			return user;
		}
		public void setUser(String user) {
			this.user = user;
		}
		public List<Long> getCommentIds() {
			return commentIds;
		}
		public void setCommentIds(List<Long> commentIds) {
			this.commentIds = commentIds;
		}
		public StoryDTO(String title, String url, int score, long time, String user, List<Long> commentIds) {
			super();
			this.title = title;
			this.url = url;
			this.score = score;
			this.time = time;
			this.user = user;
			this.commentIds = commentIds;
		}
		@Override
		public String toString() {
			return "StoryDTO [title=" + title + ", url=" + url + ", score=" + score + ", time=" + time + ", user="
					+ user + ", commentIds=" + commentIds + "]";
		} 
	   
	    
	}


