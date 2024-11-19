package com.ubforge.ubforge.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.w3c.dom.Text;

@EntityScan
public class Task {
    
        @Id
        private Long id;
        private String title;
        private Text description;
        private String status;
        private String priority;
        private User assign_to;
        private User author;

    
        public Task() {
        }
    
        public Task(String title, Text description) {
            this.title = title;
            this.description = description;
    
        }
    
        public Text getDescription() {
            return description;
        }
    
        public void setDescription(Text description) {
            this.description = description;
        }
    
        public Long getId() {
            return id;
        }
    
        public String getTitle() {
            return title;
        }
    
        public void setTitle(String title) {
            this.title = title;
        }
        
        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public User getAssign_to() {
            return assign_to;
        }

        public User getAuthor() {
            return author;
        }

        public String getPriority() {
            return priority;
        }

        public void setAssign_to(User assign_to) {
            this.assign_to = assign_to;
        }

        public void setAuthor(User author) {
            this.author = author;
        }

        public void setPriority(String priority) {
            this.priority = priority;
        }
    
}
