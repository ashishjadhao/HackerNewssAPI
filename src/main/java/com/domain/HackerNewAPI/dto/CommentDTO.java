package com.domain.HackerNewAPI.dto;


	public class CommentDTO 
	{
	    private String user;
	    private String text;
		public String getUser() {
			return user;
		}
		public void setUser(String user) {
			this.user = user;
		}
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		@Override
		public String toString() {
			return "CommentDTO [user=" + user + ", text=" + text + "]";
		}
		public CommentDTO(String user, String text) {
			super();
			this.user = user;
			this.text = text;
		}
	    

	
	}
